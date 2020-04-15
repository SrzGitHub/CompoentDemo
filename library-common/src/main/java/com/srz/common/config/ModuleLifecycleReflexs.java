package com.srz.common.config;

/**
 *
 * 组件生命周期反射类名管理，在这里注册需要初始化的组件，通过反射动态调用各个组件的初始化方法
 * 注意：以下模块中初始化的Module类不能被混淆
 */

public class ModuleLifecycleReflexs {
    private static final String BaseInit = "com.srz.common.base.BaseModuleInit";
    //主业务模块
    private static final String MainInit = "com.srz.main.MainModuleInit";
    //登录验证模块
    private static final String SignInit = "com.srz.sign.SignModuleInit";
    //首页业务模块
    private static final String HomeInit = "com.srz.home.HomeModuleInit";
    //工作业务模块
    private static final String WorkInit = "com.srz.work.WorkModuleInit";
    //消息业务模块
    private static final String MsgInit =  "com.srz.msg.MsgModuleInit";
    //用户业务模块
    private static final String UserInit = "com.srz.user.UserModuleInit";

    public static String[] initModuleNames = {BaseInit, MainInit,SignInit, HomeInit, WorkInit, MsgInit,UserInit};
}
