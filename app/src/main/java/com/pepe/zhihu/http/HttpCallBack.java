package com.pepe.zhihu.http;

import com.pepe.zhihu.http.convert.Converter;
import com.pepe.zhihu.utils.LogUtil;


/**
 * @author 1one
 * @date 2019/8/7.
 */
public abstract class HttpCallBack<T> implements EngineCallback {
    @Override
    public void onSuccess(String result) {
        // 做解析
        // 不能直接用 Gson 去解析，通过配置去解析
        LogUtil.d("HttpCallBack onSuccess");
        LogUtil.d("HttpCallBack result = \n" + result);
        try {
            Converter converter = HttpUtils.mConfig.converter;
            Class<T> resultT = (Class<T>) Utils.analysisClazzInfo(this);
            T resultObj = converter.convert(result, resultT);
            onSuccess(resultObj);
        } catch (Exception e) {
            // 操作异常 ，解析，访问数据正常，但是拿到结果后操作出错
            onFailure(e);
        }
    }

    protected abstract void onSuccess(T resultObj);
}
