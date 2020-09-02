package com.example.meal_plan

import android.app.Activity
import android.view.View
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.TextView
import android.widget.Toast
import androidx.core.view.isInvisible
import com.example.meal_plan.activities.MenuActivity
import kotlinx.android.synthetic.main.activity_radio.*
import kotlinx.android.synthetic.main.row_mhs.view.*


lateinit var act: Activity

class LayChanges {
    var limitCount = 0
    fun changePass(activity: Activity) {
        act = activity
        when {
            activity.radioButtonCopo.isChecked -> {

                setupView(act.radioopt1, "Copinho: 1,80ml", false)
                setupView(act.radioopt2, "", true)
                setupView(act.radioopt3, "", true)
                setupView(act.txValor1, "R$ 3,00", false)
                setupView(act.txValor2, "", true)
                setupView(act.txValor3, "", true)
                setupView(act.txPasso2Desc, "Apenas Adicional / Passo 7", false)
                activateCheck(act.cb21, false)
                activateCheck(act.cb22, false)
                activateCheck(act.cb23, false)
                activateCheck(act.cb24, false)
                activateCheck(act.cb25, false)
                activateCheck(act.cb26, false)
                getValueTam()



            }
            activity.radioButtonIso.isChecked -> {

                setupView(act.radioopt1, "H1", false)
                setupView(act.radioopt2, "H2", false)
                setupView(act.radioopt3, "H3", false)
                setupView(act.txValor1, "R$ 5,00", false)
                setupView(act.txValor2, "R$ 8,00", false)
                setupView(act.txValor3, "R$ 10,00", false)
                setupView(act.txPasso2Desc, "1 Escolha", false)
                activateCheck(act.cb21, true)
                activateCheck(act.cb22, true)
                activateCheck(act.cb23, true)
                activateCheck(act.cb24, true)
                activateCheck(act.cb25, true)
                activateCheck(act.cb26, true)
                limitCount = 1
                getValueTam()

            }
            activity.radioButtonTij.isChecked -> {

                setupView(act.radioopt1, "Pequeno", false)
                setupView(act.radioopt2, "Médio", false)
                setupView(act.radioopt3, "Grande", false)
                setupView(act.txValor1, "R$ 4,00", false)
                setupView(act.txValor2, "R$ 7,00", false)
                setupView(act.txValor3, "R$ 10,00", false)
                setupView(act.txPasso2Desc, "1 Escolha", false)
                activateCheck(act.cb21, true)
                activateCheck(act.cb22, true)
                activateCheck(act.cb23, true)
                activateCheck(act.cb24, true)
                activateCheck(act.cb25, true)
                activateCheck(act.cb26, true)
                limitCount = 1
                getValueTam()

            }
            activity.radioButtonTac.isChecked -> {

                setupView(act.radioopt1, "Pequeno", false)
                setupView(act.radioopt2, "Médio", false)
                setupView(act.radioopt3, "Grande", false)
                setupView(act.txValor1, "R$ 5,00", false)
                setupView(act.txValor2, "R$ 10,00", false)
                setupView(act.txValor3, "R$ 15,00", false)
                setupView(act.txPasso2Desc, "1 Escolha", false)
                activateCheck(act.cb21, true)
                activateCheck(act.cb22, true)
                activateCheck(act.cb23, true)
                activateCheck(act.cb24, true)
                activateCheck(act.cb25, true)
                activateCheck(act.cb26, true)
                limitCount = 1
                getValueTam()

            }
        }
    }

    fun setupView(v: View, text: String, isInvi: Boolean) {
        if (v is TextView) {
            v.text = text.trim()
            v.isInvisible = isInvi
        } else if (v is RadioButton) {
            v.text = text.trim()
            v.isInvisible = isInvi
        }

    }

    fun getValueTam(){
        when{
            act.radioopt1.isChecked -> {
                var tx = act.txValor1.text.toString()
                Toast.makeText(act.applicationContext, tx, Toast.LENGTH_LONG).show()
            }
            act.radioopt2.isChecked -> {
                var tx = act.txValor2.text.toString()
                Toast.makeText(act.applicationContext, tx, Toast.LENGTH_LONG).show()
            }
            act.radioopt3.isChecked ->{
                var tx = act.txValor3.text.toString()
                Toast.makeText(act.applicationContext, tx, Toast.LENGTH_LONG).show()
            }
        }
    }

    fun activateCheck(v: View, isSel: Boolean){
        if(v is CheckBox){
            v.isEnabled = isSel
        }
    }
}







