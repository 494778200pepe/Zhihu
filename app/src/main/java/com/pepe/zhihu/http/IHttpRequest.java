package com.pepe.zhihu.http;

import android.app.ProgressDialog;
import android.content.Context;
import android.widget.ProgressBar;

import java.util.Map;

/**
 * @author 1one
 * @date 2019/8/27.
 */
public interface IHttpRequest<R> {

    <T> R get(Context context, String url, Map<String, Object> params,
              final HttpCallBack<T> callback, final boolean cache, ProgressDialog progressDialog);

    <T> R post(Context context, String url, Map<String, Object> params,
               final HttpCallBack<T> callback, final boolean cache, ProgressDialog progressDialog);

    <T> void download(Context context, String url, Map<String, Object> params,
                      final HttpCallBack<T> callback);

    <T> void upload(Context context, String url, Map<String, Object> params,
                    final HttpCallBack<T> callback);
}
