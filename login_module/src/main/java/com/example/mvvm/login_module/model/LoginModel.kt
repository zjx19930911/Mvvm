package com.example.mvvm.login_module.model

import com.example.commonlib.net.BaseBean
import com.example.commonlib.net.NetManager
import com.example.mvvm.login_module.net.LoginService
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

/**
 * Created by Jianxin on 2021/1/13.
 */

class LoginModel {
    var token: String? = null

    fun login(phone: String, passwprd: String): Observable<BaseBean<LoginModel>>? {
        return NetManager.getService(LoginService::class.java)?.login(phone, passwprd)
            ?.subscribeOn(Schedulers.newThread())//请求在新的线程中执行
            ?.observeOn(AndroidSchedulers.mainThread())
    }
}