package com.srz.main;

import android.app.Application;

import com.srz.common.base.IModuleInit;
import com.srz.common.utils.SLog;

/**
 * //                    .::::.
 * //                  .::::::::.
 * //                 :::::::::::  FUCK YOU
 * //             ..:::::::::::'
 * //           '::::::::::::'
 * //             .::::::::::
 * //        '::::::::::::::..
 * //             ..::::::::::::.
 * //           ``::::::::::::::::
 * //            ::::``:::::::::'        .:::.
 * //           ::::'   ':::::'       .::::::::.
 * //         .::::'      ::::     .:::::::'::::.
 * //        .:::'       :::::  .:::::::::' ':::::.
 * //       .::'        :::::.:::::::::'      ':::::.
 * //      .::'         ::::::::::::::'         ``::::.
 * //  ...:::           ::::::::::::'              ``::.
 * // ```` ':.          ':::::::::'                  ::::..
 * //                    '.:::::'                    ':'````..
 * ===========================================================
 * You may think you know what the following code does.
 * But you dont. Trust me.
 * Fiddle with it, and youll spend many a sleepless
 * night cursing the moment you thought youd be clever
 * enough to "optimize" the code below.
 * Now close this file and go play with something else.
 * <p>
 * 2020/04/15 12:16 星期三
 **/
public class MainModuleInit implements IModuleInit {
    @Override
    public boolean onInitAhead(Application application) {
        SLog.d("Srz  >>> 主业务模块初始化 ");
        return false;
    }

    @Override
    public boolean onInitLow(Application application) {
        SLog.d("Srz  >>> 主业务模块初始化 ");
        return false;
    }
}
