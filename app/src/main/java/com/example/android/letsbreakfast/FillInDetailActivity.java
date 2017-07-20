package com.example.android.letsbreakfast;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by graphics on 5/26/17.
 */

public class FillInDetailActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fillindetail);

        // Find the View that shows the FOOD NAME
        TextView foodName = (TextView) findViewById(R.id.fid_foodname);
        // Find the View that shows the FOOD NAME SPECIFY
        TextView foodNameSpecify = (TextView) findViewById(R.id.fid_foodname_specify);

        // Set text on FOOD NAME view depend on what food that user choose
        if (OrderFoodMenuActivity.pilihanMenu == 1) {
            foodName.setText("Roti ");

            switch (OrderFood1Activity.pilihanRoti) {
                case 1:
                    foodNameSpecify.setText("Tawar");
                    break;

                case 2:
                    foodNameSpecify.setText("Bollilo");
                    break;

                case 3:
                    foodNameSpecify.setText("Challah");
                    break;

                case 4:
                    foodNameSpecify.setText("Croissant");
                    break;

                case 5:
                    foodNameSpecify.setText("Crumpet");
                    break;
            }
        } else {
            if (OrderFoodMenuActivity.pilihanMenu == 2) {
                foodName.setText("Bubur ");

                switch (OrderFood1Activity.pilihanBubur) {
                    case 1:
                        foodNameSpecify.setText("Kacang Hijau");
                        break;

                    case 2:
                        foodNameSpecify.setText("Sumsum");
                        break;

                    case 3:
                        foodNameSpecify.setText("Ayam");
                        break;

                    case 4:
                        foodNameSpecify.setText("Kampiun");
                        break;
                }

            } else {
                if (OrderFoodMenuActivity.pilihanMenu == 3) {
                    foodName.setText("Nasi ");

                    switch (OrderFood1Activity.pilihanNasi) {
                        case 1:
                            foodNameSpecify.setText("Uduk");
                            break;

                        case 2:
                            foodNameSpecify.setText("Ulam");
                            break;

                        case 3:
                            foodNameSpecify.setText("Kuning");
                            break;
                    }

                }

            }

//    private void calculatePrice() {
//        int basePrice;
//
//        if (OrderFoodMenuActivity.pilihanMenu)
//
//        return OrderFood1Activity.quantity * basePrice;
//    }

        }
    }
}
