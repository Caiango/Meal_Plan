package com.example.meal_plan.ui.pendant

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.example.meal_plan.AdapterDataMhs
import com.example.meal_plan.R
import org.json.JSONArray

class PendenteFragment : Fragment() {

    private lateinit var homeViewModel: PendenteViewModel
    var daftarMhs = mutableListOf<HashMap<String, String>>()
    var url = "http://192.168.25.239/meal_plan/show_data.php"
    lateinit var mhsAdapter: AdapterDataMhs

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        homeViewModel =
            ViewModelProviders.of(this).get(PendenteViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_pendant, container, false)
//        val textView: TextView = root.findViewById(R.id.text_home
        mhsAdapter = AdapterDataMhs(daftarMhs)
        val lista: RecyclerView = root.findViewById(R.id.listaPed)
        lista.layoutManager = LinearLayoutManager(context)
        lista.adapter = mhsAdapter
        showDataMhs()
        return root
    }

    fun showDataMhs() {
        val request = StringRequest(Request.Method.POST, url,
            Response.Listener { response ->
                val jsonArray = JSONArray(response)
                for (x in 0..(jsonArray.length() - 1)) {
                    val jsonObject = jsonArray.getJSONObject(x)
                    var mhs = HashMap<String, String>()
                    mhs.put("food_name", jsonObject.getString("food_name"))
                    mhs.put("food_desc", jsonObject.getString("food_desc"))
                    mhs.put("url", jsonObject.getString("url"))
                    daftarMhs.add(mhs)
                }
                mhsAdapter.notifyDataSetChanged()
            },
            Response.ErrorListener { error ->
                Toast.makeText(context, error.toString(), Toast.LENGTH_LONG).show()
            })
        val queue = Volley.newRequestQueue(context)
        queue.add(request)
    }
}