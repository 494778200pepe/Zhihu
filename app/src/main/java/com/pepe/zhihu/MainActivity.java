package com.pepe.zhihu;

import android.view.View;

import com.pepe.zhihu.inject.component.AppComponent;
import com.pepe.zhihu.inject.component.DaggerActivityComponent;
import com.pepe.zhihu.inject.module.ActivityModule;
import com.pepe.zhihu.mvp.contract.IMainContract;
import com.pepe.zhihu.mvp.presenter.MainPresenter;
import com.pepe.zhihu.ui.activity.base.BaseActivity;

public class MainActivity extends BaseActivity<MainPresenter> implements IMainContract.View, View.OnClickListener {

    @Override
    protected void setupActivityComponent(AppComponent appComponent) {
        DaggerActivityComponent.builder()
                .appComponent(appComponent)
                .activityModule(new ActivityModule(getActivity()))
                .build()
                .inject(this);
    }

    @Override
    protected int getContentView() {
        return R.layout.activity_main;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.mBtnSimpleGet:
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        mPresenter.simpleGetRequest();
                    }
                }).start();
                break;
            case R.id.mBtnSimpleGetForJson:
                mPresenter.simpleGetRequestForJson();
                break;
            case R.id.mBtnSimpleGetForXml:
                mPresenter.simpleGetRequestForXml();
                break;
            default:
                break;
        }
    }
}
