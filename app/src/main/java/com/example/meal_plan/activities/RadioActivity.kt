package com.example.meal_plan.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.view.isInvisible
import com.example.meal_plan.R
import kotlinx.android.synthetic.main.activity_radio.*

class RadioActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_radio)



        radioButtonCopo.setOnClickListener { radio() }
        radioButtonIso.setOnClickListener { radio() }
        radioButtonTac.setOnClickListener { radio() }
        radioButtonTij.setOnClickListener { radio() }
        checkBox1.isInvisible = true
        checkBox2.isInvisible = true
        checkBox3.isInvisible = true
        txValor1.isInvisible = true
        txValor2.isInvisible = true
        txValor3.isInvisible = true

    }

    fun radio() {
        when {
            radioButtonCopo.isChecked -> {
                checkBox1.text = "Copinho: 1,80ml"
                checkBox2.isInvisible = true
                checkBox3.isInvisible = true
                checkBox1.isInvisible = false
                txValor1.text = "R$ 3,00"
                txValor1.isInvisible = false
                txValor2.isInvisible = true
                txValor3.isInvisible = true
            }
            radioButtonIso.isChecked -> {
                checkBox1.text = "H1"
                checkBox2.text = "H2"
                checkBox3.text = "H3"
                checkBox1.isInvisible = false
                checkBox2.isInvisible = false
                checkBox3.isInvisible = false
                txValor1.text = "R$ 5,00"
                txValor2.text = "R$ 8,00"
                txValor3.text = "R$ 10,00"
                txValor1.isInvisible = false
                txValor2.isInvisible = false
                txValor3.isInvisible = false
            }
            radioButtonTij.isChecked -> {
                checkBox1.text = "Pequeno"
                checkBox2.text = "Médio"
                checkBox3.text = "Grande"
                checkBox1.isInvisible = false
                checkBox2.isInvisible = false
                checkBox3.isInvisible = false
                txValor1.text = "R$ 4,00"
                txValor2.text = "R$ 7,00"
                txValor3.text = "R$ 10,00"
                txValor1.isInvisible = false
                txValor2.isInvisible = false
                txValor3.isInvisible = false
            }
            radioButtonTac.isChecked -> {
                checkBox1.text = "Pequeno"
                checkBox2.text = "Médio"
                checkBox3.text = "Grande"
                checkBox1.isInvisible = false
                checkBox2.isInvisible = false
                checkBox3.isInvisible = false
                txValor1.text = "R$ 5,00"
                txValor2.text = "R$ 10,00"
                txValor3.text = "R$ 15,00"
                txValor1.isInvisible = false
                txValor2.isInvisible = false
                txValor3.isInvisible = false
            }
        }
    }

}

