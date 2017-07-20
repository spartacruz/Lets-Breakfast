package com.example.android.letsbreakfast;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import static com.example.android.letsbreakfast.OrderFood1Activity.quantity;

/**
 * Created by graphics on 5/26/17.
 */

public class FillInDetailActivity extends AppCompatActivity {
    private int basePrice = 13000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fillindetail);


/**********************************************************************************************************/
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
        }

/**********************************************************************************************************/
        // Find the View that shows the FOOD PRICE SUM
        TextView foodPriceSum = (TextView) findViewById(R.id.fid_foodpricesum);

        // Declaring price variable and initiating with return value from calculatePrice method
        int price = calculatePrice(OrderFoodMenuActivity.pilihanMenu);

        // Set text on FOOD NAME view depend on what food that user choose
        foodPriceSum.setText(String.valueOf(price));

/**********************************************************************************************************/

        // Find the View that shows the FOOD PRICE EACH
        TextView foodPriceEach = (TextView) findViewById(R.id.fid_foodpriceeach);

        // Set text on FOOD PRICE EACH view depend on what food that user choose
        foodPriceEach.setText(String.valueOf(basePrice));

/**********************************************************************************************************/

        // Find the View that shows the FOOD QUANTITY
        TextView foodQuantity = (TextView) findViewById(R.id.fid_foodquantity);

        // Set text on FOOD PRICE EACH view depend on how many quantity(ies) of food that user demand
        foodQuantity.setText(String.valueOf(quantity));

/**********************************************************************************************************/

        // Find the View that shows the FOOD GRAND TOTAL
        TextView foodGrandTotal = (TextView) findViewById(R.id.fid_foodgrandtotal);

        // Set text on FOOD GRAND TOTAL view after calculating the price
        foodGrandTotal.setText(String.valueOf(price));
    }

    /**
     * a private method for calculating food price
     *
     * @param pilihanMenu is food menu that chosen by user
     * @return total prices
     */
    private int calculatePrice(int pilihanMenu) {
//        int basePrice = 13000;

        if (OrderFoodMenuActivity.pilihanMenu == 1) {

            switch (OrderFood1Activity.pilihanRoti) {
                case 1: //tawar
                    basePrice = 13000;
                    break;

                case 2: //bollilo
                    basePrice = 8000;
                    break;

                case 3: //challah
                    basePrice = 8000;
                    break;

                case 4: //croissant
                    basePrice = 10000;
                    break;

                case 5: //crumpet
                    basePrice = 10000;
                    break;
            }
        } else {
            if (OrderFoodMenuActivity.pilihanMenu == 2) {

                switch (OrderFood1Activity.pilihanBubur) {
                    case 1: //Kacang Hijau
                        basePrice = 3000;
                        break;

                    case 2: //Sumsum
                        basePrice = 3000;
                        break;

                    case 3: //Ayam
                        basePrice = 8000;
                        break;

                    case 4: //Kampiun
                        basePrice = 3000;
                        break;
                }
            } else {
                if (OrderFoodMenuActivity.pilihanMenu == 3) {

                    switch (OrderFood1Activity.pilihanNasi) {
                        case 1: //Uduk
                        case 2: //Ulam
                        case 3: //Kuning
                            basePrice = 5000;
                            break;
                    }
                }
            }
        }
        return quantity * basePrice;
    }
}
