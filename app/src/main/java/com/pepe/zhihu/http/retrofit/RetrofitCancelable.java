package com.pepe.zhihu.http.retrofit;

import com.pepe.zhihu.http.ICancelable;

import io.reactivex.disposables.Disposable;

/**
 * @author 1one
 * @date 2019/8/27.
 */
public class RetrofitCancelable implements ICancelable {

    private Disposable mDisposable;

    public RetrofitCancelable(Disposable disposable) {
        this.mDisposable = disposable;
    }

    private void setDisposable(Disposable disposable) {
        this.mDisposable = disposable;
    }

    @Override
    public void cancel() {
        if (mDisposable != null && !mDisposable.isDisposed()) {
            mDisposable.dispose();
        }
    }
}
