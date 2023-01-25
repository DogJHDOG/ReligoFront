package com.UMCfront.religo.ui.user

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.UMCfront.religo.R
import com.UMCfront.religo.common.WelcomePageActivity
import com.UMCfront.religo.databinding.ActivityUserSurvey6Binding

class UserSurveyActivity6 : AppCompatActivity() {

    private lateinit var viewBinding: ActivityUserSurvey6Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_survey6)

        viewBinding= ActivityUserSurvey6Binding.inflate(layoutInflater)

        setContentView(viewBinding.root)

        viewBinding.btnNextUserSurvey6.setOnClickListener {
            val intent = Intent(this, WelcomePageActivity::class.java)
            startActivity(intent)
        }
    }
}