package com.example.meal_plan.activities

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import androidx.appcompat.app.AppCompatDelegate.*
import com.example.meal_plan.R


class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        AppCompatDelegate.setDefaultNightMode(MODE_NIGHT_NO)

        Handler().postDelayed(Runnable {
            val i = Intent(this, SelectActivity::class.java)
            startActivity(i)
        }, 3000)

    }
}


