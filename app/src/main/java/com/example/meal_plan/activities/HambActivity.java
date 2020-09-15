package com.example.meal_plan.activities;

import androidx.appcompat.app.AppCompatActivity;

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

import com.example.meal_plan.R;

import java.util.ArrayList;
import java.util.List;

public class HambActivity extends AppCompatActivity implements View.OnClickListener {


    ImageView imgbackham;
    ArrayList<Integer> arrayimg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hamb);

        imgbackham = findViewById(R.id.imgbackham);
        imgbackham.setOnClickListener(this);

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