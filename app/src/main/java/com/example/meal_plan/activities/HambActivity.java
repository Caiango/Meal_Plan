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

import java.util.ArrayList;
import java.util.List;

public class HambActivity extends AppCompatActivity implements View.OnClickListener {


    ImageView imgbackham;
    RecyclerView rvHamb;
    RecyclerView.Adapter adapter;

    private List<String> testelist;

    private List<ListItem> listItems;

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
        testelist = new ArrayList<>();

        for (int x = 1; x <= 11; x++) {
            testelist.add("Titulo " + x);
        }

        for (int i = 0; i <= 10; i++) {
            ListItem listItem = new ListItem(
                    testelist.get(i),
                    "Loren ipsum dummy text. \nEssa é a descrição do produto."
            );

            listItems.add(listItem);
        }
        adapter = new AdapterHamb(listItems, this);

        rvHamb.setAdapter(adapter);
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