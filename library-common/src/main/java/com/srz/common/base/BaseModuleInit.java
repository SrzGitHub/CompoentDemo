package com.srz.common.base;

import android.app.Application;

import com.srz.common.utils.SLog;


/**
 * Created by goldze on 2018/6/21 0021.
 * 基础库自身初始化操作
 */

public class BaseModuleInit implements IModuleInit {
    @Override
    public boolean onInitAhead(Application application) {
        //开启打印日志
        SLog.setDebug(true);

        SLog.e("Srz >>> onInitAhead");
        return false;
    }

    @Override
    public boolean onInitLow(Application application) {
        SLog.e("Srz >>> onInitLow");
        return false;
    }
}
