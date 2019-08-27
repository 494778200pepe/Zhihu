package com.pepe.zhihu.http.convert;

import com.google.gson.Gson;

/**
 * @author 1one
 * @date 2019/8/7.
 */
public class JsonConvert implements Converter {
    @Override
    public <T> T convert(String value, Class<T> type){
        return new Gson().fromJson(value,type);
    }
}
