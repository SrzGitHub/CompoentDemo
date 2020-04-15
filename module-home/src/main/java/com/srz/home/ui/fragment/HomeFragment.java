package com.srz.home.ui.fragment;



import com.alibaba.android.arouter.facade.annotation.Route;
import com.srz.common.base.BaseFragment;
import com.srz.common.router.RouterFragmentPath;
import com.srz.home.R;


@Route(path = RouterFragmentPath.Home.PAGER_HOME)
public class HomeFragment extends BaseFragment {

    @Override
    protected int layoutId() {
        return R.layout.fragment_home;
    }

    @Override
    protected void init() {

    }
}
