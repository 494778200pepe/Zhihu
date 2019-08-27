package com.pepe.zhihu.http.cache;

import com.pepe.zhihu.utils.PreferencesUtil;

/**
 * Created by hcDarren on 2017/8/26.
 */

public class SPHttpCache implements ICache{

    @Override
    public void saveCache(String finalUrl, String resultJson){
        PreferencesUtil.getInstance().saveParam(finalUrl,resultJson);
    }

    @Override
    public String getCache(String finalUrl){
        return (String) PreferencesUtil.getInstance().getObject(finalUrl);
    }

}
