package com.example.meal_plan.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.renderscript.Allocation;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.meal_plan.AdapterHamb;
import com.example.meal_plan.ListItem;
import com.example.meal_plan.R;
import com.example.meal_plan.RestauranteClass;

import java.util.ArrayList;
import java.util.List;

public class HambActivity extends AppCompatActivity implements View.OnClickListener {


    ImageView imgbackham;
    RecyclerView rvHamb;
    RecyclerView.Adapter adapter;

    private List<RestauranteClass> listItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hamb);

        imgbackham = findViewById(R.id.imgbackham);
        imgbackham.setOnClickListener(this);

        rvHamb = findViewById(R.id.rv_hamb);
        rvHamb.setHasFixedSize(true);
        rvHamb.setLayoutManager(new LinearLayoutManager(this));

        listItems = new ArrayList<>();

        RestauranteClass res = new RestauranteClass("Comida 1", "Descrição 1", R.mipmap.montar);
        RestauranteClass res2 = new RestauranteClass("Comida 2", "Descrição 2", R.mipmap.montar);
        RestauranteClass res3 = new RestauranteClass("Comida 3", "Descrição 3", R.mipmap.montar);
        RestauranteClass res4 = new RestauranteClass("Comida 4", "Descrição 4", R.mipmap.montar);

        listItems.add(res);
        listItems.add(res2);
        listItems.add(res3);
        listItems.add(res4);

        rvHamb.setAdapter(new AdapterHamb(listItems, this));
    }


    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.imgbackham) {
            backMenu();
        }
    }

    private void backMenu() {
        Intent intent = new Intent(getApplicationContext(), Menu1Activity.class);
        startActivity(intent);

    }
}