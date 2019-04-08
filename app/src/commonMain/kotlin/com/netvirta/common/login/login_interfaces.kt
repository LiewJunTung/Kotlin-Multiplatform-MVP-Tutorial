package com.netvirta.common.login

interface LoginView {
    fun loginResult(result: Boolean)
}

interface LoginPresenter {
    fun processLogin(password: String)
}
