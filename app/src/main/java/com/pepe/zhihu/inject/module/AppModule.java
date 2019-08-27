

package com.pepe.zhihu.inject.module;

import android.database.sqlite.SQLiteDatabase;

import androidx.annotation.NonNull;

import com.pepe.zhihu.AppApplication;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * AppModule
 * Created by ThirtyDegreesRay on 2016/8/30 13:52
 */
@Module
public class AppModule {

    private AppApplication application;

    public AppModule(AppApplication application) {
        this.application = application;
    }

    @Provides
    @Singleton
    public AppApplication provideApplication() {
        return application;
    }

}
