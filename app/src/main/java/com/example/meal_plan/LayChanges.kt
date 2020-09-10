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
    var limitCountCre = 0
    var limitCountFar = 0
    var limitCountCer = 0
    var limitCountFru = 0
    fun changePass(activity: Activity) {
        act = activity

        when {
            activity.radioButtonCopo.isChecked -> {

                setupView(act.radioopt1, "Copinho: 180ml", false)
                setupView(act.radioopt2, "", true)
                setupView(act.radioopt3, "", true)
                setupView(act.txValor1, "R$ 3,00", false)
                setupView(act.txValor2, "", true)
                setupView(act.txValor3, "", true)
                setupView(act.txPasso2Desc, "Apenas Adicional / Passo 7", false)
                activateCheck(MenuActivity.creme, false)
                activateCheck(MenuActivity.farinaceos, true)
                activateCheck(MenuActivity.cereais, true)
                activateCheck(MenuActivity.frutas, true)
                getValueTam()
                changeDesCop(MenuActivity.desc, "")


            }
            activity.radioButtonIso.isChecked -> {

                setupView(act.radioopt1, "H1", false)
                setupView(act.radioopt2, "H2", false)
                setupView(act.radioopt3, "H3", false)
                setupView(act.txValor1, "R$ 5,00", false)
                setupView(act.txValor2, "R$ 8,00", false)
                setupView(act.txValor3, "R$ 10,00", false)
                setupView(act.txPasso2Desc, "1 Bola Grátis", false)
                activateCheck(MenuActivity.farinaceos, true)
                activateCheck(MenuActivity.cereais, true)
                activateCheck(MenuActivity.frutas, true)
                limitCountCre = 1
                getValueTam()
                changeDesCop(MenuActivity.desc, "3 Opções")
                if (act.radioopt1.isChecked) {
                    activateCheck(MenuActivity.creme, false)
                } else {
                    activateCheck(MenuActivity.creme, true)
                }

            }
            activity.radioButtonTij.isChecked -> {

                setupView(act.radioopt1, "Pequeno", false)
                setupView(act.radioopt2, "Médio", false)
                setupView(act.radioopt3, "Grande", false)
                setupView(act.txValor1, "R$ 4,00", false)
                setupView(act.txValor2, "R$ 7,00", false)
                setupView(act.txValor3, "R$ 10,00", false)
                setupView(act.txPasso2Desc, "1 Bola Grátis", false)
                activateCheck(MenuActivity.farinaceos, true)
                activateCheck(MenuActivity.cereais, true)
                activateCheck(MenuActivity.frutas, true)
                limitCountCre = 1
                getValueTam()
                changeDesCop(MenuActivity.desc, "3 Opções")
                if (act.radioopt1.isChecked) {
                    activateCheck(MenuActivity.creme, false)
                } else {
                    activateCheck(MenuActivity.creme, true)
                }

            }
            activity.radioButtonTac.isChecked -> {

                setupView(act.radioopt1, "Pequeno", false)
                setupView(act.radioopt2, "Médio", false)
                setupView(act.radioopt3, "Grande", false)
                setupView(act.txValor1, "R$ 5,00", false)
                setupView(act.txValor2, "R$ 10,00", false)
                setupView(act.txValor3, "R$ 15,00", false)
                setupView(act.txPasso2Desc, "1 Bola Grátis", false)
                activateCheck(MenuActivity.farinaceos, true)
                activateCheck(MenuActivity.cereais, true)
                activateCheck(MenuActivity.frutas, true)
                limitCountCre = 1
                getValueTam()
                changeDesCop(MenuActivity.desc, "3 Opções")
                if (act.radioopt1.isChecked) {
                    activateCheck(MenuActivity.creme, false)
                } else {
                    activateCheck(MenuActivity.creme, true)
                }

            }
        }
    }

    //seta o texto e invisibilidade dos textview valores e RadioButton
    fun setupView(v: View, text: String, isInvi: Boolean) {
        if (v is TextView) {
            v.text = text.trim()
            v.isInvisible = isInvi
        } else if (v is RadioButton) {
            v.text = text.trim()
            v.isInvisible = isInvi
        }

    }

    //obter valores dos tamanhos escolhidos
    fun getValueTam() {
        when {
            act.radioopt1.isChecked -> {
                var tx = act.txValor1.text.toString()
            }
            act.radioopt2.isChecked -> {
                var tx = act.txValor2.text.toString()
            }
            act.radioopt3.isChecked -> {
                var tx = act.txValor3.text.toString()
            }
        }
    }

    //desmarca as checkbox e deixa selecionavel
    fun activateCheck(v: ArrayList<CheckBox>, isEnable: Boolean) {
        for (check: CheckBox in v) {

            check.isChecked = false
            check.isEnabled = isEnable

        }
    }

    //muda a descrição
    fun changeDesCop(v: ArrayList<TextView>, text: String) {
        act.radioopt1.setOnClickListener {
            for (tx: TextView in v) {
                tx.text = "2 Opções"
            }
            setLimit(act.radioopt1)
            activateCheck(MenuActivity.creme, false)
            activateCheck(MenuActivity.farinaceos, true)
            activateCheck(MenuActivity.cereais, true)
            activateCheck(MenuActivity.frutas, true)
        }
        act.radioopt2.setOnClickListener {
            act.txPasso3Desc.text = text
            act.txPasso5Desc.text = text
            act.txPasso4Desc.text = "4 Opções"
            setLimit(act.radioopt2)
            activateCheck(MenuActivity.creme, true)
            activateCheck(MenuActivity.farinaceos, true)
            activateCheck(MenuActivity.cereais, true)
            activateCheck(MenuActivity.frutas, true)
        }
        act.radioopt3.setOnClickListener {
            act.txPasso3Desc.text = text
            act.txPasso5Desc.text = text
            act.txPasso4Desc.text = "4 Opções"
            setLimit(act.radioopt3)
            activateCheck(MenuActivity.creme, true)
            activateCheck(MenuActivity.farinaceos, true)
            activateCheck(MenuActivity.cereais, true)
            activateCheck(MenuActivity.frutas, true)
        }
    }

    //seta o limitadores
    fun setLimit(v: View) {
        if (v is RadioButton) {
            when {
                v.isChecked && v == act.radioopt1 -> {
                    limitCountFar = 2
                    limitCountCer = 2
                    limitCountFru = 2
                }
                v.isChecked && v == act.radioopt2 -> {
                    limitCountFar = 3
                    limitCountCer = 4
                    limitCountFru = 3
                }
                v.isChecked && v == act.radioopt3 -> {
                    limitCountFar = 3
                    limitCountCer = 4
                    limitCountFru = 3
                }
            }
        }
    }
}









