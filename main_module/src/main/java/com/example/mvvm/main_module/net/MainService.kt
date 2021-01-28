package com.example.mvvm.main_module.net

import com.example.commonlib.net.BaseBean
import com.example.mvvm.main_module.model.MainModel
import io.reactivex.Observable
import retrofit2.http.POST
import retrofit2.http.Query

/**
 * 页面描述：PaoService
 *
 * Created by ditclear on 2017/11/19.
 */
interface MainService{
    //登录
    @POST("/yxx-app/sso/login")
    fun login(@Query("phone") phone: String,@Query("password") password: String): Observable<BaseBean<MainModel>>
}