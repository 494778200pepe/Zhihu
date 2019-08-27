package com.pepe.zhihu.http.retrofit;

import android.app.ProgressDialog;
import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.pepe.zhihu.http.HttpCallBack;
import com.pepe.zhihu.http.IHttpRequest;
import com.pepe.zhihu.utils.LogUtil;

import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * @author 1one
 * @date 2019/8/27.
 */
public class RetrofitRequest implements IHttpRequest<Disposable> {

    @Override
    public <T> Disposable get(Context context, String url, Map<String, Object> params, final HttpCallBack<T> callback, boolean cache, final ProgressDialog progressDialog) {
        HttpSubscriber<ResponseBody> subscriber =
                new HttpSubscriber<>(
                        new HttpObserver<ResponseBody>() {
                            @Override
                            public void onError(@NonNull Throwable error) {
                                LogUtil.d("RetrofitRequest onError");
                                callback.onFailure(new RetrofitErrorException(error.getMessage()));
                            }

                            @Override
                            public void onSuccess(@NonNull HttpResponse<ResponseBody> response) {
                                LogUtil.d("RetrofitRequest onResponse");
                                ResponseBody responseBody = response.body();
                                try {
                                    callback.onSuccess(responseBody.string());
                                } catch (Exception e) {
                                    callback.onFailure(e);
                                }
                            }
                        }
                ,progressDialog);
        Observable<Response<ResponseBody>> observable =
                RetrofitClient.INSTANCE.getRetrofit(url).create(RetrofitApi.class).getMethod(url, params);

        return generalRxHttpExecute(observable, subscriber, progressDialog);
    }

    @Override
    public <T> Disposable post(Context context, String url, Map<String, Object> params, final HttpCallBack<T> callback, boolean cache, ProgressDialog progressDialog) {
        RetrofitClient.INSTANCE.getRetrofit().create(RetrofitApi.class).postMethod(url, params).enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                // 成功解析即可
                ResponseBody body = response.body();
                if (body == null) {
                    // 401
                    body = response.errorBody();
                }
                try {
                    callback.onSuccess(body.string());
                } catch (IOException e) {
                    callback.onFailure(e);
                }
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                callback.onFailure(new RetrofitErrorException(t.getMessage()));
            }
        });
        return null;
    }

    @Override
    public <T> void download(Context context, String url, Map<String, Object> params, final HttpCallBack<T> callback) {

    }

    @Override
    public <T> void upload(Context context, String url, Map<String, Object> params, final HttpCallBack<T> callback) {

    }

    protected <T> Disposable generalRxHttpExecute(
            @NonNull Observable<Response<T>> observable, @Nullable HttpSubscriber<T> subscriber, final ProgressDialog dialog) {
        if (subscriber != null) {
            observable
                    .subscribeOn(Schedulers.io())
                    .doOnSubscribe(new Consumer<Disposable>() {
                        @Override
                        public void accept(Disposable disposable) throws Exception {
                            LogUtil.d("RetrofitRequest  doOnSubscribe");
                            if (dialog != null) {
                                LogUtil.d("RetrofitRequest  doOnSubscribe    dialog.show");
                                dialog.show();
                            }
                        }
                    })
                    .subscribeOn(AndroidSchedulers.mainThread())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(subscriber);
            return subscriber.getDisposable();
        } else {
            observable.subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(new HttpSubscriber<T>());
        }
        return null;
    }
}
