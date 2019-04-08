package com.netvirta.common.login

class LoginPresenterImpl(private val loginView: LoginView): LoginPresenter {

    val user = User("John", 1234)

    override fun processLogin(password: String) {
        if (password.toInt() == user.password){
            loginView.loginResult("Login Successful! Welcome ${user.username}.")
        } else {
            loginView.loginResult("Login Failed! Try again.")
        }
    }
}
