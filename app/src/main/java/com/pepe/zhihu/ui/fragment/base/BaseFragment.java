package com.pepe.zhihu.ui.fragment.base;

import androidx.fragment.app.Fragment;

import com.pepe.zhihu.mvp.contract.base.IBaseContract;

/**
 * @author 1one
 * @date 2019/8/24.
 */
public abstract class BaseFragment<P extends IBaseContract.Presenter>
        extends Fragment implements IBaseContract.View {


}
