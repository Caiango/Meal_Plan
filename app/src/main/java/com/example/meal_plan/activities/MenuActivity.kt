package com.example.meal_plan.activities

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isInvisible
import com.example.meal_plan.LayChanges
import com.example.meal_plan.MainActivity
import com.example.meal_plan.R
import com.example.meal_plan.act
import kotlinx.android.synthetic.main.activity_radio.*
import java.lang.Exception


class MenuActivity : AppCompatActivity(), CompoundButton.OnCheckedChangeListener {

    var mLay = LayChanges()

    companion object {
        //var para armazenar os checkbox de cada passo
        var creme: ArrayList<CheckBox> = ArrayList()
        var farinaceos: ArrayList<CheckBox> = ArrayList()
        var cereais: ArrayList<CheckBox> = ArrayList()
        var frutas: ArrayList<CheckBox> = ArrayList()
        var cobertura: ArrayList<CheckBox> = ArrayList()
        //var para armazenar todos os textviews das descrições
        var desc: ArrayList<TextView> = ArrayList()
        //var para armazenar os contadores de marcação dos checkbox
        var countCrem = 0
        var countFar = 0
        var countCer = 0
        var countFru = 0
        var teste = 0
    }


    //var para armazenar os textos dos checkbox selecionados
    var selCreme: ArrayList<String> = ArrayList()

    lateinit var rbGroup2: RadioButton


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_radio)


        //adicionando os checkbox nos arrays
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
        cereais.add(cb41)
        cereais.add(cb42)
        cereais.add(cb43)
        cereais.add(cb44)
        cereais.add(cb45)
        cereais.add(cb46)
        cereais.add(cb47)
        cereais.add(cb48)
        frutas.add(cb51)
        frutas.add(cb52)
        frutas.add(cb53)
        frutas.add(cb54)
        frutas.add(cb55)
        cobertura.add(cb61)
        cobertura.add(cb62)
        cobertura.add(cb63)
        cobertura.add(cb64)
        cobertura.add(cb65)
        desc.add(txPasso3Desc)
        desc.add(txPasso4Desc)
        desc.add(txPasso5Desc)


        //setando os setOnCheckedChanged nos checkbox
        cb21.setOnCheckedChangeListener(this)
        cb22.setOnCheckedChangeListener(this)
        cb23.setOnCheckedChangeListener(this)
        cb24.setOnCheckedChangeListener(this)
        cb25.setOnCheckedChangeListener(this)
        cb26.setOnCheckedChangeListener(this)
        cb31.setOnCheckedChangeListener(onCheckedChangeFar())
        cb32.setOnCheckedChangeListener(onCheckedChangeFar())
        cb33.setOnCheckedChangeListener(onCheckedChangeFar())
        cb34.setOnCheckedChangeListener(onCheckedChangeFar())
        cb35.setOnCheckedChangeListener(onCheckedChangeFar())
        cb36.setOnCheckedChangeListener(onCheckedChangeFar())
        cb41.setOnCheckedChangeListener(onCheckedChangeCereal())
        cb42.setOnCheckedChangeListener(onCheckedChangeCereal())
        cb43.setOnCheckedChangeListener(onCheckedChangeCereal())
        cb44.setOnCheckedChangeListener(onCheckedChangeCereal())
        cb45.setOnCheckedChangeListener(onCheckedChangeCereal())
        cb46.setOnCheckedChangeListener(onCheckedChangeCereal())
        cb47.setOnCheckedChangeListener(onCheckedChangeCereal())
        cb48.setOnCheckedChangeListener(onCheckedChangeCereal())
        cb51.setOnCheckedChangeListener(onCheckedChangeFruta())
        cb52.setOnCheckedChangeListener(onCheckedChangeFruta())
        cb53.setOnCheckedChangeListener(onCheckedChangeFruta())
        cb54.setOnCheckedChangeListener(onCheckedChangeFruta())
        cb55.setOnCheckedChangeListener(onCheckedChangeFruta())


        //chamando a alteração de layout da classe laychanges
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

    //função checkedChanged Creme
    override fun onCheckedChanged(cb: CompoundButton?, isChecked: Boolean) {

        if (isChecked) {
            countCrem++
            if (countCrem == mLay.limitCountCre) {
                for (check: CheckBox in creme) {
                    check.isEnabled = check.isChecked
                    if (check.isChecked) {
                        selCreme.add(check.text.toString())

                    }
                }
            }
        } else {
            countCrem--
            if (countCrem in 0..1) {
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

    //função checkedChanged Farináceos
    fun onCheckedChangeFar(): CompoundButton.OnCheckedChangeListener {

        return CompoundButton.OnCheckedChangeListener { cb, isChecked ->

            if (isChecked) {
                countFar++
                if (countFar == mLay.limitCountFar) {
                    for (check: CheckBox in farinaceos) {
                        check.isEnabled = check.isChecked
//                    if (check.isChecked) {
//                        selCreme.add(check.text.toString())
//
//                    }
                    }
                }
            } else {
                countFar--
                if (countFar in 0 until mLay.limitCountFar) {
                    for (check: CheckBox in farinaceos) {
                        check.isEnabled = true
                        //selCreme.clear()
                    }
                }
            }

        }

    }


    //função checkedChanged Cereal
    fun onCheckedChangeCereal(): CompoundButton.OnCheckedChangeListener {

        return CompoundButton.OnCheckedChangeListener { cb, isChecked ->

            if (isChecked) {
                countCer++
                if (countCer == mLay.limitCountCer) {
                    for (check: CheckBox in cereais) {
                        check.isEnabled = check.isChecked
//                    if (check.isChecked) {
//                        selCreme.add(check.text.toString())
//
//                    }
                    }
                }
            } else {
                countCer--
                if (countCer in 0 until mLay.limitCountCer) {
                    for (check: CheckBox in cereais) {
                        check.isEnabled = true
                        //selCreme.clear()
                    }
                }
            }

        }

    }


    //função checkedChanged Frutas
    fun onCheckedChangeFruta(): CompoundButton.OnCheckedChangeListener {

        return CompoundButton.OnCheckedChangeListener { cb, isChecked ->

            if (isChecked) {
                countFru++
                if (countFru == mLay.limitCountFru) {
                    for (check: CheckBox in frutas) {
                        check.isEnabled = check.isChecked
//                    if (check.isChecked) {
//                        selCreme.add(check.text.toString())
//
//                    }
                    }
                }
            } else {
                countFru--
                if (countFru in 0 until mLay.limitCountFru) {
                    for (check: CheckBox in frutas) {
                        check.isEnabled = true
                        //selCreme.clear()
                    }
                }
            }

        }
    }

    //setando e validando contador e array dos checkbox para chamar no on checked changed
    fun checkedValidator(ct: Int, isChecked: Boolean, array: ArrayList<CheckBox>, limit: Int) {
        //var c = 0
        if (isChecked) {
            teste++
            if (teste == limit) {
                for (check: CheckBox in array) {
                    check.isEnabled = check.isChecked
//                    if (check.isChecked) {
//                        selCreme.add(check.text.toString())
//
//                    }
                }
            }
        } else {
            teste--
            if (teste in 0 until limit) {
                for (check: CheckBox in array) {
                    check.isEnabled = true
                    //selCreme.clear()
                }
            }
        }
    }


}

