package com.pepe.zhihu;

import android.app.Application;

import com.pepe.zhihu.http.EngineConfig;
import com.pepe.zhihu.http.HttpUtils;
import com.pepe.zhihu.http.convert.JsonConvert;
import com.pepe.zhihu.http.retrofit.RetrofitRequest;
import com.pepe.zhihu.inject.component.AppComponent;
import com.pepe.zhihu.inject.component.DaggerAppComponent;
import com.pepe.zhihu.inject.module.AppModule;

import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author 1one
 * @date 2019/8/24.
 */
public class AppApplication extends Application {

    private static AppApplication application;
    private AppComponent mAppComponent;
    ThreadPoolExecutor threadPoolExecutor;
    ThreadLocal threadLocal;

    @Override
    public void onCreate() {
        super.onCreate();
        application = this;
        mAppComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();
        initNetwork();

        // 配置上层 配置
        EngineConfig config = new EngineConfig.Builder()
                .engineRequest(new RetrofitRequest())
                // 添加一个解析工厂 Gson Xml
                .converter(new JsonConvert())
                // 添加默认参数 platform = android
                .builder();
        HttpUtils.initConfig(config);
    }

    private void initNetwork(){
//        NetBroadcastReceiver receiver = new NetBroadcastReceiver();
//        IntentFilter filter;
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
//            filter = new IntentFilter(ConnectivityManager.CONNECTIVITY_ACTION);
//        } else {
//            filter = new IntentFilter();
//            filter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
//        }
//        registerReceiver(receiver, filter);
//
//        NetHelper.INSTANCE.init(this);
    }

    public static AppApplication get(){
        return application;
    }

    public AppComponent getAppComponent(){
        return mAppComponent;
    }
}
