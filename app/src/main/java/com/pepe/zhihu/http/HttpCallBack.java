package com.pepe.zhihu.http;

import com.pepe.zhihu.http.convert.Converter;
import com.pepe.zhihu.utils.LogUtil;


/**
 * @author 1one
 * @date 2019/8/7.
 */
public abstract class HttpCallBack<T> implements EngineCallback {

    Converter mConverter;
    public void setConverter(Converter converter){
        mConverter = converter;
    }

    @Override
    public void onSuccess(String result) {
        LogUtil.d("HttpCallBack result = \n" + result);
        try {
            Class<T> resultT = (Class<T>) Utils.analysisClazzInfo(this);
            T resultObj = mConverter.convert(result, resultT);
            onSuccess(resultObj);
        } catch (Exception e) {
            // 操作异常 ，解析，访问数据正常，但是拿到结果后操作出错
            onFailure(e);
        }
    }

    protected abstract void onSuccess(T resultObj);
}
