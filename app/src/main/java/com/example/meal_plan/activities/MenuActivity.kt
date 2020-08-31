package com.example.meal_plan.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isInvisible
import com.example.meal_plan.LayChanges
import com.example.meal_plan.R
import kotlinx.android.synthetic.main.activity_radio.*


class MenuActivity : AppCompatActivity() {

    var mLay = LayChanges()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_radio)




        radioButtonCopo.setOnClickListener { mLay.changePass(this) }
        radioButtonIso.setOnClickListener { mLay.changePass(this) }
        radioButtonTac.setOnClickListener { mLay.changePass(this) }
        radioButtonTij.setOnClickListener { mLay.changePass(this) }
        radioopt1.isInvisible = true
        radioopt2.isInvisible = true
        radioopt3.isInvisible = true
        txValor1.isInvisible = true
        txValor2.isInvisible = true
        txValor3.isInvisible = true

    }


}

