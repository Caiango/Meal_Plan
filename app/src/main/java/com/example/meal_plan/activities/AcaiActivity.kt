package com.example.meal_plan.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.view.isInvisible
import com.example.meal_plan.R
import kotlinx.android.synthetic.main.activity_acai.*

class AcaiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_acai)


        buttonRadio.setOnClickListener {
            if (radioButton.isChecked){
                Toast.makeText(applicationContext,"foi",Toast.LENGTH_LONG).show()
            }
        }



    }
}