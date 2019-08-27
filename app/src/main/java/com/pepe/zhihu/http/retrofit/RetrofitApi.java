package com.pepe.zhihu.http.retrofit;

import com.pepe.zhihu.bean.User;

import java.util.Map;

import io.reactivex.Observable;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.QueryMap;
import retrofit2.http.Url;

/**
 * @author 1one
 * @date 2019/8/27.
 */
public interface RetrofitApi {

    @GET()
    Observable<Response<ResponseBody>> getMethod(@Url String url, @QueryMap Map<String,Object> params);

    @FormUrlEncoded
    @POST()
    Call<ResponseBody> postMethod(@Url String url, @FieldMap Map<String,Object> params);

}