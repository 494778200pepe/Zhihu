

package com.pepe.zhihu.inject.module;

import android.content.Context;

import androidx.fragment.app.FragmentManager;

import com.pepe.zhihu.inject.ActivityScope;
import com.pepe.zhihu.ui.activity.base.BaseActivity;

import dagger.Module;
import dagger.Provides;

/**
 * ActivityModule
 * Created by ThirtyDegreesRay on 2016/8/30 14:53
 */
@Module
public class ActivityModule {

    private BaseActivity mActivity;

    public ActivityModule(BaseActivity activity) {
        mActivity = activity;
    }

    @Provides
    @ActivityScope
    public BaseActivity provideActivity(){
        return mActivity;
    }

    @Provides
    @ActivityScope
    public Context provideContext(){
        return mActivity;
    }

    @Provides
    @ActivityScope
    public FragmentManager provideFragmentManager(){
        return mActivity.getSupportFragmentManager();
    }

}
