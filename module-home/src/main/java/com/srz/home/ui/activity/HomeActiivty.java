package com.srz.home.ui.activity;



import com.srz.common.base.BaseActivity;
import com.srz.home.R;
import com.srz.home.ui.fragment.HomeFragment;

public class HomeActiivty extends BaseActivity {




    @Override
    protected int getLayoutId() {
        return R.layout.activity_home_actiivty;
    }

    @Override
    protected void init() {
        changeFragment(HomeFragment.class, R.id.homeFrameLayout, true, null, true);
    }

    @Override
    protected void loadData() {

    }
}
