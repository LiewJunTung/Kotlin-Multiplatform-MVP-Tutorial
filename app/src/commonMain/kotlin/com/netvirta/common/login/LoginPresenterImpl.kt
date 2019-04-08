package com.netvirta.common.login

class LoginPresenterImpl(private val loginView: LoginView): LoginPresenter {
    override fun processLogin(password: String) {
        loginView.loginResult(password == "1234")
    }
}
