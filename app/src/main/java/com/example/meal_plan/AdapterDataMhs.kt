package com.example.meal_plan

import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdapterDataMhs (val dataMhs: List<HashMap<String, String>>) :
        RecyclerView.Adapter<AdapterDataMhs.HolderDataMhs>(){
    override fun onCreateViewHolder(
        p0: ViewGroup,
        p1: Int
    ): AdapterDataMhs.HolderDataMhs {
        val v = LayoutInflater.from(p0.context).inflate(R.layout.row_mhs,p0, false)
        return HolderDataMhs(v)
    }

    override fun getItemCount(): Int {
        return dataMhs.size
    }

    override fun onBindViewHolder(p0: AdapterDataMhs.HolderDataMhs, p1: Int) {
        val data = dataMhs.get(p1)
        p0.txAlimento.setText(data.get("food_name"))
        p0.txDesc.setText(data.get("food_desc"))
        p0.photo.setImageURI(Uri.parse(data.get("url")))
    }

    class HolderDataMhs(v: View) : RecyclerView.ViewHolder(v){
       val txAlimento = v.findViewById<TextView>(R.id.textAlimento)
       val txDesc = v.findViewById<TextView>(R.id.textDesc)
       val photo = v.findViewById<ImageView>(R.id.imgUp)
    }
}