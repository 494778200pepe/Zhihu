package com.pepe.zhihu.http.retrofit;

import androidx.annotation.NonNull;

import com.pepe.zhihu.http.HttpConfig;
import com.pepe.zhihu.utils.LogUtil;

import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.simplexml.SimpleXmlConverterFactory;

/**
 * @author 1one
 * @date 2019/8/27.
 */
public enum RetrofitClient {
    // 单例
    INSTANCE;

    private HashMap<String, Retrofit> retrofitMap = new HashMap<>();

    private Retrofit createRetrofit(@NonNull String baseUrl, boolean isJson) {
        int timeOut = HttpConfig.HTTP_TIME_OUT;

        HttpLoggingInterceptor interceptor=new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .connectTimeout(timeOut, TimeUnit.MILLISECONDS)
                .addInterceptor(new BaseInterceptor())
                .addInterceptor(interceptor)
                .connectTimeout(10, TimeUnit.SECONDS)
                .readTimeout(10, TimeUnit.SECONDS)
                .writeTimeout(10, TimeUnit.SECONDS)
                .retryOnConnectionFailure(true)
                .build();

        Retrofit.Builder builder = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .client(okHttpClient);

//        if (isJson) {
            builder.addConverterFactory(GsonConverterFactory.create());
//        }else{
//            builder.addConverterFactory(SimpleXmlConverterFactory.createNonStrict());
//        }
        Retrofit retrofit = builder.build();
        retrofitMap.put(baseUrl + "-" + isJson, retrofit);
        return retrofit;
    }

    public Retrofit getRetrofit(@NonNull String baseUrl, boolean isJson) {
        String key = baseUrl + "-" + isJson;
        if (retrofitMap.containsKey(key)) {
            return retrofitMap.get(key);
        }
        return createRetrofit(baseUrl, isJson);
    }

    /**
     * 拦截器
     */
    private class BaseInterceptor implements Interceptor {
        @Override
        public Response intercept(@NonNull Chain chain) throws IOException {
            Request request = chain.request();

            LogUtil.d(request.url().toString());

            Response response = chain.proceed(request);
            ResponseBody responseBody = response.body();
            long contentLength = responseBody.contentLength();
            LogUtil.d("<-- "
                    + response.code()
                    + (response.message().isEmpty() ? "" : ' ' + response.message())
                    + ' ' + response.request().url()
            );
            LogUtil.d("body = " + responseBody.toString());
            return response;
        }
    }

    public Retrofit getRetrofit(@NonNull String baseUrl) {
        if(baseUrl.contains("?")){
            baseUrl = baseUrl.substring(0,baseUrl.charAt('?'));
        }
        if (baseUrl.charAt(baseUrl.length() - 1) != '/') {
            baseUrl += "/";
        }
        return getRetrofit(baseUrl, true);
    }

    public Retrofit getRetrofit() {
        return getRetrofit(HttpConfig.GITHUB_BASE_URL);
    }
}
