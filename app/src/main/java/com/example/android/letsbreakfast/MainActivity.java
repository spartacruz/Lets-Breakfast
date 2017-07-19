package com.example.android.letsbreakfast;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the View that shows the NUMBERS category
        TextView orderFood = (TextView) findViewById(R.id.orderFood);

        // Set a click listener on that View
        orderFood.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the NUMBER View is clicked on.
            @Override
            public void onClick(View view) {
                Intent orderFoodIntent = new Intent(MainActivity.this, OrderFoodMenuActivity.class);
                startActivity(orderFoodIntent);
            }
        });

    }
}
