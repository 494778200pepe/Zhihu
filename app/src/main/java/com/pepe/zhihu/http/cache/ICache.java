package com.pepe.zhihu.http.cache;

/**
 * @author 1one
 * @date 2019/8/27.
 */
public interface ICache {

    void saveCache(String finalUrl, String resultJson);

    String getCache(String finalUrl);
}
