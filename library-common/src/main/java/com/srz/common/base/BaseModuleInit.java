package com.srz.common.base;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;
import com.srz.common.BuildConfig;
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
        if (BuildConfig.DEBUG){

            ARouter.openLog();     // 打印日志
            ARouter.openDebug();// 开启调试模式(如果在InstantRun模式下运行，必须开启调试模式！线上版本需要关闭,否则有安全风险)
            SLog.setDebug(true);
        }else {
            SLog.setDebug(false);
        }
        ARouter.init(application); // 尽可能早，推荐在Application中初始化
        return false;
    }

    @Override
    public boolean onInitLow(Application application) {
        SLog.e("Srz >>> onInitLow");
        return false;
    }
}
