package com.example.modulfifthexam.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.modulfifthexam.R
import com.example.modulfifthexam.managers.SharedPrefs

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val handler = Handler()
        handler.postDelayed({
            if (SharedPrefs(this).isSaved) {
                Intent(this, MainActivity::class.java).also {
                    startActivity(it)
                    finish()
                }
            } else {
                Intent(this, IntroActivity::class.java).also {
                    startActivity(it)
                    finish()
                }
            }
        }, 2000)

    }
}