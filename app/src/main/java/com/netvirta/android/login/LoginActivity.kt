package com.netvirta.android.login

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.netvirta.android.R
import com.netvirta.common.login.LoginPresenter
import com.netvirta.common.login.LoginPresenterImpl
import com.netvirta.common.login.LoginView
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity(), LoginView {
    lateinit var presenter: LoginPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        presenter = LoginPresenterImpl(this)

        submitButton.setOnClickListener {
            presenter.processLogin(editText.text.toString())
        }
    }

    override fun loginResult(result: Boolean) {
        if (result){
            textView.text = "Login Successful"
        } else {
            textView.text = "Login Failed"
        }
    }
}
