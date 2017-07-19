package com.example.android.letsbreakfast;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RelativeLayout;

import static com.example.android.letsbreakfast.OrderFood1Activity.imageHeader;
import static com.example.android.letsbreakfast.OrderFood1Activity.titleActionBar;

/**
 * Created by graphics on 5/24/17.
 */


public class OrderFoodMenuActivity extends AppCompatActivity{

    public static int pilihanMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orderfoodmenu);

      // Find the View that shows the NUMBERS category
        RelativeLayout anekaRoti = (RelativeLayout) findViewById(R.id.AnekaRoti);

        // Set a click listener on that View
        anekaRoti.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the NUMBER View is clicked on.
            @Override
            public void onClick(View view) {
                titleActionBar = "Aneka Roti";
                imageHeader = R.drawable.rotiori;
                pilihanMenu = 1;
                Intent orderFoodIntent = new Intent(OrderFoodMenuActivity.this, OrderFood1Activity.class);
                startActivity(orderFoodIntent);
            }
        });

        RelativeLayout anekaBubur = (RelativeLayout) findViewById(R.id.AnekaBubur);

        // Set a click listener on that View
        anekaBubur.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the NUMBER View is clicked on.
            @Override
            public void onClick(View view) {
                titleActionBar = "Aneka Bubur";
                imageHeader = R.drawable.buburayamori;
                pilihanMenu = 2;
                Intent orderFoodIntent = new Intent(OrderFoodMenuActivity.this, OrderFood1Activity.class);
                startActivity(orderFoodIntent);
            }
        });

        RelativeLayout anekaNasi = (RelativeLayout) findViewById(R.id.AnekaNasi);

        // Set a click listener on that View
        anekaNasi.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the NUMBER View is clicked on.
            @Override
            public void onClick(View view) {
                titleActionBar = "Aneka Nasi";
                imageHeader = R.drawable.nasiudukori;
                pilihanMenu = 3;
                Intent orderFoodIntent = new Intent(OrderFoodMenuActivity.this, OrderFood1Activity.class);
                startActivity(orderFoodIntent);
            }
        });
    }
}
