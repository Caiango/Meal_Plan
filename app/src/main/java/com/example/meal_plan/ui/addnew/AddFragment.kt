package com.example.meal_plan.ui.pendant

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.android.volley.Request
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.example.meal_plan.AdapterDataMhs
import com.example.meal_plan.AdapterHamb
import com.example.meal_plan.R
import com.example.meal_plan.RestauranteClass
import kotlinx.android.synthetic.main.fragment_add.*
import org.json.JSONArray

class AddFragment : Fragment() {

    private lateinit var addViewModel: AddViewModel

    lateinit var lista: ArrayList<RestauranteClass>
    var res: RestauranteClass = RestauranteClass("", "", 0)

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        addViewModel =
            ViewModelProviders.of(this).get(AddViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_add, container, false)
        val edtNome: EditText = root.findViewById(R.id.edtNome)
        val edtDesc: EditText = root.findViewById(R.id.edtDesc)
        val btnadd: Button = root.findViewById(R.id.btnAdd)
        val rv_add: RecyclerView = root.findViewById(R.id.rvadd)

        lista = ArrayList()

        btnadd.setOnClickListener {
            var txNome = edtNome.text.toString()
            var txDesc = edtDesc.text.toString()
            var img = R.mipmap.hamburguer

            if (txNome.isBlank() || txDesc.isBlank()) {
                Toast.makeText(context, "Preencha os Dados", Toast.LENGTH_LONG).show()
                rv_add.layoutManager = LinearLayoutManager(AddFragment().context)
                rv_add.adapter = AdapterHamb(lista, AddFragment().context)
            } else {
                res = RestauranteClass(txNome, txDesc, img)
                lista.add(res)
                rv_add.layoutManager = LinearLayoutManager(AddFragment().context)
                rv_add.adapter = AdapterHamb(lista, AddFragment().context)
            }
        }

        var res1 = RestauranteClass("Comida 1", "Desc 2", R.mipmap.montar)
        var res2 = RestauranteClass("Comida 2", "Desc 2", R.mipmap.montar)
        var res3 = RestauranteClass("Comida 3", "Desc 3", R.mipmap.montar)
        lista.add(res1)
        lista.add(res2)
        lista.add(res3)


        return root
    }


}