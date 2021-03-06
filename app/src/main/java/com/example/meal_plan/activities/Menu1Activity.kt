package com.example.meal_plan.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.meal_plan.R
import kotlinx.android.synthetic.main.activity_menu1.*

class Menu1Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu1)

        img_acai.setOnClickListener {
            val intent = Intent(applicationContext, MenuActivity::class.java)
            startActivity(intent)
        }

        img_hamb.setOnClickListener {
            val intent = Intent(applicationContext, HambActivity::class.java)
            startActivity(intent)
        }

        imgbacksel.setOnClickListener {
            val intent = Intent(applicationContext, SelectActivity::class.java)
            startActivity(intent)
        }
    }
}