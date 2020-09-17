package com.example.meal_plan.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.meal_plan.MainActivity
import com.example.meal_plan.R
import kotlinx.android.synthetic.main.activity_select.*

class SelectActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_select)

        pedido_image.setOnClickListener {
            if (edit_login.text.toString() == "" && edit_pass.text.toString() == "") {
                val intent = Intent(applicationContext, MainActivity::class.java)
                startActivity(intent)
            } else {
                Toast.makeText(applicationContext, "Login ou Senha Incorretos", Toast.LENGTH_LONG)
                    .show()
            }
        }

        cardapio_image.setOnClickListener {
            val intent = Intent(applicationContext, Menu1Activity::class.java)
            startActivity(intent)
        }

    }
}