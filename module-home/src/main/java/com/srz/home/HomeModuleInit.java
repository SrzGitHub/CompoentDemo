package com.srz.home;

import android.app.Application;


import com.srz.common.base.IModuleInit;
import com.srz.common.utils.SLog;


/**
 * Created by goldze on 2018/6/21 0021.
 */

public class HomeModuleInit implements IModuleInit {
    @Override
    public boolean onInitAhead(Application application) {
        SLog.e("首页模块初始化 -- onInitAhead");
        return false;
    }

    @Override
    public boolean onInitLow(Application application) {
        SLog.e("首页模块初始化 -- onInitLow");
        return false;
    }
}
