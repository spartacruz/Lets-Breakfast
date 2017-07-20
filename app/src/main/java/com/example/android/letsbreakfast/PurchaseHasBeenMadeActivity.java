package com.example.android.letsbreakfast;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by phi3d on 7/20/2017.
 */

public class PurchaseHasBeenMadeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_purchasehasbeenmade);

        Button continueAfterPurchase = (Button) findViewById(R.id.continue_after_purchase);

        // Set a click listener on that View
        continueAfterPurchase.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the CONTINUE button is clicked on.
            @Override
            public void onClick(View view) {
                Intent ContinueAfterPurchaseIntent = new Intent(PurchaseHasBeenMadeActivity.this, OrderFoodMenuActivity.class);
                ContinueAfterPurchaseIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(ContinueAfterPurchaseIntent);
            }
        });
    }
    //Overriding back button behaviour to do another behaviour (back to Activity_OrderFoodMenu instead of Activity_fillindetail)
    @Override
    public void onBackPressed() {
        // TODO Auto-generated method stub
        super.onBackPressed();
        Intent ContinueAfterPurchaseIntent = new Intent(PurchaseHasBeenMadeActivity.this, OrderFoodMenuActivity.class);
        ContinueAfterPurchaseIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(ContinueAfterPurchaseIntent);
    }
}
