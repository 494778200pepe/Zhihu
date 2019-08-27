package com.pepe.zhihu.ui.activity.base;

import android.os.Bundle;
import android.widget.ProgressBar;

import androidx.annotation.CallSuper;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.pepe.zhihu.AppApplication;
import com.pepe.zhihu.inject.component.AppComponent;
import com.pepe.zhihu.mvp.contract.base.IBaseContract;
import com.thirtydegreesray.dataautoaccess.DataAutoAccess;

import javax.inject.Inject;

import butterknife.ButterKnife;

/**
 * @author 1one
 * @date 2019/8/24.
 */
public abstract class BaseActivity<P extends IBaseContract.Presenter> extends AppCompatActivity implements IBaseContract.View{

    @Inject
    protected P mPresenter;

    private static BaseActivity curActivity;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setupActivityComponent(getAppComponent());
        DataAutoAccess.getData(this, savedInstanceState);
        if(mPresenter != null) {
            mPresenter.onRestoreInstanceState(savedInstanceState == null ?
                    getIntent().getExtras() : savedInstanceState);
            mPresenter.attachView(this);
        }
        if (getContentView() != 0) {
            setContentView(getContentView());
//            ButterKnife.bind(getActivity());
        }
        initActivity();
        initView(savedInstanceState);
        if(mPresenter != null) {
            mPresenter.onViewInitialized();
        }
    }

    /**
     * 依赖注入的入口
     * @param appComponent appComponent
     */
    protected abstract void setupActivityComponent(AppComponent appComponent);

    /**
     * 获取ContentView id
     * @return
     */
    @LayoutRes
    protected abstract int getContentView();

    /**
     * 初始化activity
     */
    @CallSuper
    protected void initActivity() { }

    /**
     * 初始化view
     */
    @CallSuper
    protected void initView(Bundle savedInstanceState) { }

    public static BaseActivity getCurActivity() {
        return curActivity;
    }

    protected BaseActivity getActivity() {
        return this;
    }

    @NonNull
    protected AppApplication getAppApplication() {
        return (AppApplication) getApplication();
    }

    protected AppComponent getAppComponent(){
        return getAppApplication().getAppComponent();
    }
}
