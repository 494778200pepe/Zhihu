package com.pepe.zhihu.mvp.contract.base;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.ProgressBar;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/**
 * @author 1one
 * @date 2019/8/24.
 */
public interface IBaseContract {

    interface View {
        ProgressDialog getProgressDialog();
        void initProgressDialog();
    }

    interface Presenter<V extends IBaseContract.View> {

        void onSaveInstanceState(Bundle outState);

        void onRestoreInstanceState(Bundle outState);

        void attachView(@NonNull V view);

        void detachView();

        /**
         * view initialized, you can init view data
         */
        void onViewInitialized();

        @Nullable
        Context getContext();
    }
}
