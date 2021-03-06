package com.example.meal_plan

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.recyclerview.widget.RecyclerView
import com.example.meal_plan.activities.NestActivity
import com.example.meal_plan.ui.pendant.PendenteFragment
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.row_mhs.view.*


class AdapterDataMhs(val dataMhs: List<HashMap<String, String>>) :
    RecyclerView.Adapter<AdapterDataMhs.HolderDataMhs>() {
    override fun onCreateViewHolder(
        p0: ViewGroup,
        p1: Int
    ): AdapterDataMhs.HolderDataMhs {
        val v = LayoutInflater.from(p0.context).inflate(R.layout.row_mhs, p0, false)
        return HolderDataMhs(v)
    }

    override fun getItemCount(): Int {
        return dataMhs.size
    }

    override fun onBindViewHolder(p0: AdapterDataMhs.HolderDataMhs, p1: Int) {
        val data = dataMhs.get(p1)
        p0.txMesa.setText("Mesa: " + data.get("pedido_mesa") + " " + data.get("id_pedido"))
        p0.txDesc.setText(data.get("acai_passos"))

//        if (!data.get("url").equals("")) {
//            Picasso.get().load(data.get("url")).into(p0.photo)
//        }

    }

    class HolderDataMhs(v: View) : RecyclerView.ViewHolder(v) {
        val txMesa = v.findViewById<TextView>(R.id.textMesa)
        val txDesc = v.findViewById<TextView>(R.id.textDesc)
//        val photo = v.findViewById<ImageView>(R.id.imgUp)
       // val butCesta = v.findViewById<ImageButton>(R.id.buttonCesta)
    }
}