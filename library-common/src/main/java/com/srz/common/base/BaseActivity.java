package com.srz.common.base;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

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
 * 2020/04/15 12:14 星期三
 **/
public abstract class BaseActivity extends AppCompatActivity {


    private BaseFragment lastFragment;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(getLayoutId());
        init();
        loadData();

    }
    //获取布局ID
    protected abstract int getLayoutId();
    protected abstract void init();
    protected abstract void loadData();

    /**
     * 切换Fragment的方法
     *
     * @param fragmentClass 要跳转的Fragment
     * @param containId     容器ID
     * @param isHidden      是否隐藏
     * @param bundle        参数
     * @param isBack        是否添加到回退栈
     * @return
     */
    public BaseFragment changeFragment(Class<? extends BaseFragment> fragmentClass, int containId, boolean isHidden, Bundle bundle, boolean isBack) {

        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        //获取Fragment的类名，用类名当做Tag
        String fragmentName = fragmentClass.getSimpleName();
        //根据tag来查找当前Fragment，如果不为null 就代表当前Fragment已经被加载过至少一次
        BaseFragment currentFragment = (BaseFragment) manager.findFragmentByTag(fragmentName);
        if (currentFragment == null) {
            //如果Fragment为null 就创建Fragment对象，添加到FragmentManager中
            try {
                //通过Java动态代理创建的对象
                currentFragment = fragmentClass.newInstance();
                //添加到FragmentManager中
                transaction.add(containId, currentFragment, fragmentName);

            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        if (isHidden) {
            //隐藏上一个Fragment
            if (lastFragment != null)
                transaction.hide(lastFragment);
            //显示当前Fragment
            transaction.show(currentFragment);
        } else {
            //替换上一个Fragment
            transaction.replace(containId, currentFragment, fragmentName);
        }
        //传递参数
        if (bundle != null) {
            currentFragment.setBundle(bundle);
        }

        if (isBack) {
            transaction.addToBackStack(fragmentName);
        }

        transaction.commit();

        lastFragment = currentFragment;

        return lastFragment;

    }
}
