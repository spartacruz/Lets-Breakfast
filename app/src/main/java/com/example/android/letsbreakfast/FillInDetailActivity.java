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

            if (OrderFood1Activity.pilihanRoti == 1) {
                foodNameSpecify.setText("Tawar");
            } else {
                if (OrderFood1Activity.pilihanRoti == 2) {
                    foodNameSpecify.setText("Bollilo");
                } else {
                    if (OrderFood1Activity.pilihanRoti == 3) {
                        foodNameSpecify.setText("Challah");
                    } else {
                        if (OrderFood1Activity.pilihanRoti == 4) {
                            foodNameSpecify.setText("Croissant");
                        } else {
                            if (OrderFood1Activity.pilihanRoti == 5) {
                                foodNameSpecify.setText("Crumpet");
                            }
                        }
                    }
                }
            }
        } else {
            if (OrderFoodMenuActivity.pilihanMenu == 2) {
                foodName.setText("Bubur ");

                if (OrderFood1Activity.pilihanBubur == 1) {
                    foodNameSpecify.setText("Kacang Hijau");
                } else {
                    if (OrderFood1Activity.pilihanBubur == 2) {
                        foodNameSpecify.setText("Sumsum");
                    } else {
                        if (OrderFood1Activity.pilihanBubur == 3){
                            foodNameSpecify.setText("Ayam");
                        } else {
                            if (OrderFood1Activity.pilihanBubur == 4){
                                foodNameSpecify.setText("Kampiun");
                            }
                        }
                    }
                }
            } else {
                if (OrderFoodMenuActivity.pilihanMenu == 3) {
                    foodName.setText("Nasi ");


                    if (OrderFood1Activity.pilihanNasi == 1) {
                        foodNameSpecify.setText("Kacang Hijau");
                    } else {
                        if (OrderFood1Activity.pilihanNasi == 2) {
                            foodNameSpecify.setText("Sumsum");
                        } else {
                            if (OrderFood1Activity.pilihanNasi == 3){
                                foodNameSpecify.setText("Ayam");
                            } else {
                                if (OrderFood1Activity.pilihanNasi == 4){
                                    foodNameSpecify.setText("Kampiun");
                                }
                            }
                        }
                    }
                }
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
