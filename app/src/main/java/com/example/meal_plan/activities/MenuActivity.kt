package com.example.meal_plan.activities

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isInvisible
import com.example.meal_plan.LayChanges
import com.example.meal_plan.MainActivity
import com.example.meal_plan.R
import kotlinx.android.synthetic.main.activity_radio.*
import java.lang.Exception


class MenuActivity : AppCompatActivity(), CompoundButton.OnCheckedChangeListener {

    var mLay = LayChanges()

    companion object {
        var creme: ArrayList<CheckBox> = ArrayList()
        var farinaceos: ArrayList<CheckBox> = ArrayList()
        var cereais: ArrayList<CheckBox> = ArrayList()
        var frutas: ArrayList<CheckBox> = ArrayList()
        var cobertura: ArrayList<CheckBox> = ArrayList()
        var desc: ArrayList<TextView> = ArrayList()
    }


    var selCreme: ArrayList<String> = ArrayList()

    lateinit var rbGroup2: RadioButton


    var count = 0
    var countFar = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_radio)


        creme.add(cb21)
        creme.add(cb22)
        creme.add(cb23)
        creme.add(cb24)
        creme.add(cb25)
        creme.add(cb26)
        farinaceos.add(cb31)
        farinaceos.add(cb32)
        farinaceos.add(cb33)
        farinaceos.add(cb34)
        farinaceos.add(cb35)
        farinaceos.add(cb36)
        desc.add(txPasso3Desc)
        desc.add(txPasso4Desc)
        desc.add(txPasso5Desc)

        cb21.setOnCheckedChangeListener(this)
        cb22.setOnCheckedChangeListener(this)
        cb23.setOnCheckedChangeListener(this)
        cb24.setOnCheckedChangeListener(this)
        cb25.setOnCheckedChangeListener(this)
        cb26.setOnCheckedChangeListener(this)



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

    override fun onCheckedChanged(cb: CompoundButton?, isChecked: Boolean) {

        if (isChecked) {
            count++
            if (count == mLay.limitCount) {
                for (check: CheckBox in creme) {
                    check.isEnabled = check.isChecked
                    if (check.isChecked) {
                        selCreme.add(check.text.toString())

                    }
                }
            }
        } else {
            count--
            if (count < 1) {
                for (check: CheckBox in creme) {
                    check.isEnabled = true
                    selCreme.clear()
                }
            }
        }


    }


    //funçao para obter os valores do elemento do radiogroup2 marcado
    fun onChangedRadio() {
        try {
            var selectID = radioGroup2.checkedRadioButtonId
            rbGroup2 = findViewById(selectID)
            Toast.makeText(applicationContext, rbGroup2.text, Toast.LENGTH_LONG).show()
        } catch (e: Exception) {
            Toast.makeText(applicationContext, "Não foi selecionado um tamanho", Toast.LENGTH_LONG)
                .show()
        }
    }

    


}

