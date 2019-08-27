package com.pepe.zhihu.mvp.contract;

import android.content.Intent;

import com.pepe.zhihu.mvp.contract.base.IBaseContract;

/**
 * @author 1one
 * @date 2019/8/27.
 */
public interface IMainContract {

    interface View extends IBaseContract.View{

    }

    interface Presenter extends IBaseContract.Presenter<IMainContract.View>{

        void simpleGetRequest();

        void simpleGetRequestForJson();

        void simpleGetRequestForXml();
    }
}
