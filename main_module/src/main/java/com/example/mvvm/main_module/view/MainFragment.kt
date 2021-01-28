package com.example.mvvm.main_module.view

import android.util.Log
import android.view.View
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.launcher.ARouter
import com.example.commonlib.Constant
import com.example.commonlib.base.BaseFragment
import com.example.commonlib.base.ClickPresent
import com.example.commonlib.extens.showSuccessDialog
import com.example.mvvm.main_module.R
import com.example.mvvm.main_module.databinding.FragmentMainBinding


/**
 * Created by Jianxin on 2021/1/27.
 */
@Route(path = Constant.PATH_FRAGMENT_MAIN_MAIN)
class MainFragment : BaseFragment<FragmentMainBinding>(), ClickPresent {
    override fun bindVM() {
        mBinding.click = this
    }

    override fun getLayoutId(): Int {
        return R.layout.fragment_main
    }

    override fun initView() {
        mBinding.topBar.setTitle("主页")
    }

    override fun lazyLoad() {
        Log.e("MainFragment", "MainFragment:initData")
    }

    override fun onClick(v: View?) {
        ARouter.getInstance().build(Constant.PATH_ACTIVITY_MAIN_MAINDETAIL).navigation()
    }

}