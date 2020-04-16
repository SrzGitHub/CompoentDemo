package com.srz.home.ui.activity;



import com.alibaba.android.arouter.facade.annotation.Route;
import com.srz.common.base.BaseActivity;
import com.srz.common.router.RouterActivityPath;
import com.srz.home.R;
import com.srz.home.ui.fragment.HomeFragment;

@Route(path = RouterActivityPath.Home.PAGER_HOME)
public class HomeActiivty extends BaseActivity {


    @Override
    protected int getLayoutId() {
        return R.layout.activity_home_actiivty;
    }

    @Override
    protected void init() {
        //加载Fragment
        changeFragment(HomeFragment.class, R.id.homeFrameLayout, true, null, false);
    }

    @Override
    protected void loadData() {


        /**
         * SharedPreferences
         * ARouter
         */
    }

}
