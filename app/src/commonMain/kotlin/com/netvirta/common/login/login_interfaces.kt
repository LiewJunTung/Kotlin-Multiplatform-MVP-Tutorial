package com.netvirta.common.login

interface LoginView {
    fun loginResult(result: String)
}

interface LoginPresenter {
    fun processLogin(password: String)
}
