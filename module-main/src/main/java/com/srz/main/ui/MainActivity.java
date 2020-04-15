package com.srz.main.ui;

import androidx.fragment.app.Fragment;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.srz.common.base.BaseActivity;
import com.srz.common.router.RouterActivityPath;
import com.srz.main.R;

import java.util.List;


/**
 * Created by goldze on 2018/6/21
 */
@Route(path = RouterActivityPath.Main.PAGER_MAIN)
public class MainActivity extends BaseActivity {


    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void init() {

    }

    @Override
    protected void loadData() {

    }


}
