package com.pepe.zhihu.http;

/**
 * @author 1one
 * @date 2019/8/27.
 */
public interface EngineCallback {

    void onSuccess(String result);

    void onFailure(Exception e);
}
