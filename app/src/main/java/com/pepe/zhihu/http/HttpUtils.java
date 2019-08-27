package com.pepe.zhihu.http;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.text.TextUtils;


import com.pepe.zhihu.http.convert.Converter;
import com.pepe.zhihu.utils.LogUtil;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 1one
 * @date 2019/8/27.
 */
public class HttpUtils<R> {
    private IHttpRequest mHttpRequest;
    private static IHttpRequest mInitHttpRequest;
    private Context mContext;
    private final int TYPE_POST = 0x0011, TYPE_GET = 0x0022;
    private int mType = TYPE_GET;
    private Map<String, Object> mParams;
    private Map<String, String> mHeaders;
    private String mUrl;
    private ProgressDialog mProgressDialog;
    private Converter mConverter;
    private static Converter mInitConverter;
    public static EngineConfig mConfig;

    public static HttpUtils with(Context context) {
        return new HttpUtils(context);
    }

    public HttpUtils httpRequest(IHttpRequest httpRequest) {
        mHttpRequest = httpRequest;
        return this;
    }

    public HttpUtils get() {
        mType = TYPE_GET;
        return this;
    }

    private HttpUtils(Context context) {
        mParams = new HashMap<>();
        mHeaders = new HashMap<>();
        this.mContext = context;
    }

    public static void initConfig(EngineConfig engineConfig) {
        mConfig = engineConfig;
        mInitHttpRequest = mConfig.getEngineRequest();
        mInitConverter = mConfig.getConverter();
    }

    public HttpUtils param(String key, Object value) {
        if (null != value) {
            mParams.put(key, value);
        }
        return this;
    }

    public HttpUtils header(String key, String value) {
        mHeaders.put(key, value);
        return this;
    }

    public HttpUtils url(String url) {
        this.mUrl = url;
        return this;
    }

    public HttpUtils progressBar(ProgressDialog dialog) {
        this.mProgressDialog = dialog;
        return this;
    }

    public HttpUtils converter(Converter converter) {
        this.mConverter = converter;
        return this;
    }

    public HttpUtils cache(boolean cache) {
        return this;
    }

    public <T> void request() {
        request(null);
    }

    public <T> ICancelable request(final HttpCallBack<T> callback) {
        if (mHttpRequest == null) {
            mHttpRequest = mInitHttpRequest;
        }
        if (mConverter == null) {
            mConverter = mInitConverter;
        }
        if (mHttpRequest == null) {
            throw new NullPointerException("HttpRequest 是空，请配置");
        }
        if (TextUtils.isEmpty(mUrl)) {
            throw new NullPointerException("访问路径为空");
        }
        callback.setConverter(mConverter);
        // 异常判断
        if (mType == TYPE_GET) {
            LogUtil.d("HttpUtils  request  mProgressDialog == null ?  " + (mProgressDialog == null));
            return mHttpRequest.get(mContext, mUrl, mParams, callback, true, mProgressDialog);
        } else if (mType == TYPE_POST) {
            return mHttpRequest.post(mContext, mUrl, mParams, callback, true, mProgressDialog);
        }
        return null;
    }

}

