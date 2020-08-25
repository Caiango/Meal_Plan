package com.example.meal_plan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatDelegate
import kotlinx.android.synthetic.main.activity_select.*

class SelectActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_select)

        pedido_image.setOnClickListener {
            if (edit_login.text.toString() == "admin" && edit_pass.text.toString() == "123456") {
                val intent = Intent(applicationContext, MainActivity::class.java)
                startActivity(intent)
            } else {
                Toast.makeText(applicationContext, "Login ou Senha Incorretos", Toast.LENGTH_LONG)
                    .show()
            }


        }

    }
}