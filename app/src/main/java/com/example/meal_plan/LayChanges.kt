package com.example.meal_plan

import android.app.Activity
import androidx.core.view.isInvisible
import kotlinx.android.synthetic.main.activity_radio.*


class LayChanges {


    fun changePass(activity: Activity) {
        when {
            activity.radioButtonCopo.isChecked -> {

                activity.radioopt1.text = "Copinho: 1,80ml"
                activity.radioopt2.isInvisible = true
                activity.radioopt3.isInvisible = true
                activity.radioopt1.isInvisible = false
                activity.txValor1.text = "R$ 3,00"
                activity.txValor1.isInvisible = false
                activity.txValor2.isInvisible = true
                activity.txValor3.isInvisible = true
                activity.txPasso2Desc.text = "2 Escolhas | ${activity.radioopt1.text.toString()}"

            }
            activity.radioButtonIso.isChecked -> {
                activity.radioopt1.text = "H1"
                activity.radioopt2.text = "H2"
                activity.radioopt3.text = "H3"
                activity.radioopt1.isInvisible = false
                activity.radioopt2.isInvisible = false
                activity.radioopt3.isInvisible = false
                activity.txValor1.text = "R$ 5,00"
                activity.txValor2.text = "R$ 8,00"
                activity.txValor3.text = "R$ 10,00"
                activity.txValor1.isInvisible = false
                activity.txValor2.isInvisible = false
                activity.txValor3.isInvisible = false
            }
            activity.radioButtonTij.isChecked -> {
                activity.radioopt1.text = "Pequeno"
                activity.radioopt2.text = "Médio"
                activity.radioopt3.text = "Grande"
                activity.radioopt1.isInvisible = false
                activity.radioopt2.isInvisible = false
                activity.radioopt3.isInvisible = false
                activity.txValor1.text = "R$ 4,00"
                activity.txValor2.text = "R$ 7,00"
                activity.txValor3.text = "R$ 10,00"
                activity.txValor1.isInvisible = false
                activity.txValor2.isInvisible = false
                activity.txValor3.isInvisible = false
            }
            activity.radioButtonTac.isChecked -> {
                activity.radioopt1.text = "Pequeno"
                activity.radioopt2.text = "Médio"
                activity.radioopt3.text = "Grande"
                activity.radioopt1.isInvisible = false
                activity.radioopt2.isInvisible = false
                activity.radioopt3.isInvisible = false
                activity.txValor1.text = "R$ 5,00"
                activity.txValor2.text = "R$ 10,00"
                activity.txValor3.text = "R$ 15,00"
                activity.txValor1.isInvisible = false
                activity.txValor2.isInvisible = false
                activity.txValor3.isInvisible = false
            }
        }
    }

}




