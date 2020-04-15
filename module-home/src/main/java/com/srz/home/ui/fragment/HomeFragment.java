package com.srz.home.ui.fragment;



import com.alibaba.android.arouter.facade.annotation.Route;
import com.srz.common.base.BaseFragment;
import com.srz.common.router.RouterFragmentPath;


/**
 * Created by goldze on 2018/6/21
 */
@Route(path = RouterFragmentPath.Home.PAGER_HOME)
public class HomeFragment extends BaseFragment {

    @Override
    protected int layoutId() {
        return 0;
    }

    @Override
    protected void init() {

    }
}
