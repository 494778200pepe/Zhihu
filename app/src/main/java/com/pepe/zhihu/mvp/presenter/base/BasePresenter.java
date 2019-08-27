package com.pepe.zhihu.mvp.presenter.base;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;

import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;

import com.pepe.zhihu.R;
import com.pepe.zhihu.http.retrofit.HttpObserver;
import com.pepe.zhihu.http.retrofit.HttpResponse;
import com.pepe.zhihu.http.retrofit.HttpSubscriber;
import com.pepe.zhihu.mvp.contract.base.IBaseContract;
import com.pepe.zhihu.utils.LogUtil;
import com.thirtydegreesray.dataautoaccess.DataAutoAccess;

import java.util.ArrayList;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Response;

/**
 * @author 1one
 * @date 2019/8/27.
 */
public abstract class BasePresenter<V extends IBaseContract.View> implements IBaseContract.Presenter<V> {

    //View
    protected V mView;
    private boolean isAttached = false;
    private boolean isViewInitialized = false;

    private ArrayList<HttpSubscriber> subscribers;
    public CompositeDisposable mCompositeDisposable;

    public BasePresenter() {
        LogUtil.d("===> BasePresenter");
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        DataAutoAccess.saveData(this, outState);
    }

    @Override
    public void onRestoreInstanceState(Bundle outState) {
        if (outState == null) {
            return;
        }
        DataAutoAccess.getData(this, outState);
    }

    /**
     * 绑定View
     * @param view view
     */
    @Override
    public void attachView(@NonNull V view) {
        LogUtil.d("===> attachView");
        mView = view;
        onViewAttached();
        isAttached = true;
        subscribers = new ArrayList<>();
        mCompositeDisposable = new CompositeDisposable();
    }

    /**
     * 取消View绑定
     */
    @Override
    public void detachView() {
        mView = null;
        //view 取消绑定时，把请求取消订阅
        for (HttpSubscriber observer : subscribers) {
            if (observer != null && !observer.getDisposable().isDisposed()) {
                observer.getDisposable().dispose();
                LogUtil.d("unsubscribe:" + observer.toString());
            }
        }
        clearRequest();
    }

    @Override
    public void onViewInitialized() {
        isViewInitialized = true;
    }

    protected boolean isViewInitialized() {
        return isViewInitialized;
    }

    /**
     * presenter和view绑定成功
     */
    @CallSuper
    protected void onViewAttached() {

    }

    /**
     * 获取上下文，需在onViewAttached()后调用
     * @return
     */
    @NonNull
    @Override
    public Context getContext() {
        if (mView instanceof Activity) {
            return (Context) mView;
        } else if (mView instanceof Fragment) {
            return ((Fragment) mView).getContext();
        } else {
            throw new NullPointerException("BasePresenter:mView is't instance of Context,can't use getContext() method.");
        }
    }

    @NonNull
    protected String getString(@StringRes int resId) {
        return getContext().getResources().getString(resId);
    }

    public void addRequest(Disposable disposable){
        if (mCompositeDisposable != null && !mCompositeDisposable.isDisposed()) {
            mCompositeDisposable.add(disposable);
        }
    }

    public void clearRequest(){
        if (mCompositeDisposable != null) {
            mCompositeDisposable.clear(); // clear时网络请求会随即cancel
            mCompositeDisposable = null;
        }
    }
}
