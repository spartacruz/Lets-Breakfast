package com.example.android.letsbreakfast;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import static com.example.android.letsbreakfast.OrderFoodMenuActivity.pilihanMenu;

/**
 * Created by graphics on 5/24/17.
 */

public class OrderFood1Activity extends AppCompatActivity implements OnItemSelectedListener {

    public static String titleActionBar;
    public static int imageHeader;

    public static int quantity = 1;
    public static int pilihanRoti;
    public static int pilihanBubur;
    public static int pilihanNasi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orderfood1);


        setTitle(titleActionBar);
        ImageView image = (ImageView) findViewById(R.id.image_orderfood1);
        image.setImageResource(imageHeader);

        TextView orderTV = (TextView) findViewById(R.id.ordertextview);

        if (pilihanMenu == 1) {
            orderTV.setText("Roti");
        } else {
            if (pilihanMenu == 2) {
                orderTV.setText("Bubur");
            } else {
                if (pilihanMenu == 3) {
                    orderTV.setText("Nasi");
                }
            }
        }


        // Spinner element
        Spinner spinner = (Spinner) findViewById(R.id.meal_spinner);


        if (pilihanMenu == 1) {
            // Spinner click listener
            spinner.setOnItemSelectedListener(this);

            // Spinner Drop down elements
            List<String> categories = new ArrayList<String>();
            categories.add("Tawar");
            categories.add("Bolillo");
            categories.add("Challah");
            categories.add("Croissant");
            categories.add("Crumpet");

            // Creating adapter for spinner
            ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories);

            // Drop down layout style - list view with radio button
            dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

            // attaching data adapter to spinner
            spinner.setAdapter(dataAdapter);
        } else {
            if (pilihanMenu == 2) {
                // Spinner click listener
                spinner.setOnItemSelectedListener(this);

                // Spinner Drop down elements
                List<String> categories = new ArrayList<String>();
                categories.add("Kacang Hijau");
                categories.add("Sumsum");
                categories.add("Ayam");
                categories.add("Kampiun");

                // Creating adapter for spinner
                ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories);

                // Drop down layout style - list view with radio button
                dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                // attaching data adapter to spinner
                spinner.setAdapter(dataAdapter);
            } else {
                if (pilihanMenu == 3) {
                    // Spinner click listener
                    spinner.setOnItemSelectedListener(this);

                    // Spinner Drop down elements
                    List<String> categories = new ArrayList<String>();
                    categories.add("Uduk");
                    categories.add("Kuning");
                    categories.add("Ulam");

                    // Creating adapter for spinner
                    ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories);

                    // Drop down layout style - list view with radio button
                    dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                    // attaching data adapter to spinner
                    spinner.setAdapter(dataAdapter);
                }
            }
        }

        Button nextStep = (Button) findViewById(R.id.nextstep);

        // Set a click listener on that View
        nextStep.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the NUMBER View is clicked on.
            @Override
            public void onClick(View view) {
                Intent orderFoodIntent = new Intent(OrderFood1Activity.this, FillInDetailActivity.class);
                startActivity(orderFoodIntent);
            }
        });


    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        // On selecting a spinner item
        String item = parent.getItemAtPosition(position).toString();


        ImageView image = (ImageView) findViewById(R.id.image_orderfood1);

        TextView displayHargaSatuan = (TextView) findViewById(R.id.displayHargaSatuan);
        displayHargaSatuan.setTypeface(displayHargaSatuan.getTypeface(), Typeface.BOLD_ITALIC);

        TextView displayIsiSatuan = (TextView) findViewById(R.id.displayIsiSatuan);
        displayIsiSatuan.setTypeface(displayIsiSatuan.getTypeface(), Typeface.BOLD_ITALIC);

        TextView displayDYK = (TextView) findViewById(R.id.didyouknowinfo);


        if (pilihanMenu == 1) {
            // Showing selected spinner item
            Toast.makeText(parent.getContext(), "Kamu melilih roti : " + item, Toast.LENGTH_LONG).show();


            if (item.equals("Tawar")) {
                image.setImageResource(R.drawable.rotitawar);
                displayHargaSatuan.setText("Harga Satuan : Rp. 13.000");
                displayIsiSatuan.setText("Isi 12 Potong Roti");
                quantity = 1;
                displayQuantity(quantity);
                pilihanRoti = 1;
                displayDYK.setText(getString(R.string.RotiTawarDYK));

            } else {
                if (item.equals("Bolillo")) {
                    image.setImageResource(R.drawable.rotibolillo);
                    displayHargaSatuan.setText("Harga Satuan : Rp. 8.000");
                    displayIsiSatuan.setText("Isi 5 Potong Roti");
                    quantity = 1;
                    displayQuantity(quantity);
                    pilihanRoti = 2;
                    displayDYK.setText(getString(R.string.RotiBolilloDYK));
                } else {
                    if (item.equals("Challah")) {
                        image.setImageResource(R.drawable.rotichallah);
                        displayHargaSatuan.setText("Harga Satuan : Rp. 8.000");
                        displayIsiSatuan.setText("Isi 5 Potong Roti");
                        quantity = 1;
                        displayQuantity(quantity);
                        pilihanRoti = 3;
                        displayDYK.setText(getString(R.string.RotiChallahDYK));
                    } else {
                        if (item.equals("Croissant")) {
                            image.setImageResource(R.drawable.roticroissant);
                            displayHargaSatuan.setText("Harga Satuan : Rp. 10.000");
                            displayIsiSatuan.setText("Isi 5 Potong Roti");
                            quantity = 1;
                            displayQuantity(quantity);
                            pilihanRoti = 4;
                            displayDYK.setText(getString(R.string.RotiCroissantDYK));
                        } else {
                            if (item.equals("Crumpet")) {
                                image.setImageResource(R.drawable.roticrumpet);
                                displayHargaSatuan.setText("Harga Satuan : Rp. 10.000");
                                displayIsiSatuan.setText("Isi 5 Potong Roti");
                                quantity = 1;
                                displayQuantity(quantity);
                                pilihanRoti = 5;
                                displayDYK.setText(getString(R.string.RotiCrumpetDYK));
                            }
                        }
                    }
                }
            }
        } else {
            if (pilihanMenu == 2) {
                // Showing selected spinner item
                Toast.makeText(parent.getContext(), "Kamu melilih bubur : " + item, Toast.LENGTH_LONG).show();


                if (item.equals("Kacang Hijau")) {
                    image.setImageResource(R.drawable.buburkacanghijau);
                    displayHargaSatuan.setText("Harga Seporsi : Rp. 3.000");
                    displayIsiSatuan.setText("1 Mangkung Ukuran Sedang");
                    quantity = 1;
                    displayQuantity(quantity);
                    pilihanBubur = 1;
                    displayDYK.setText(getString(R.string.BuburKacangHijauDYK));

                } else {
                    if (item.equals("Sumsum")) {
                        image.setImageResource(R.drawable.bubursumsum);
                        displayHargaSatuan.setText("Harga Seporsi : Rp. 3.000");
                        displayIsiSatuan.setText("1 Mangkung Ukuran Sedang");
                        quantity = 1;
                        displayQuantity(quantity);
                        pilihanBubur = 2;
                        displayDYK.setText(getString(R.string.BuburSumsumDYK));
                    } else {
                        if (item.equals("Ayam")) {
                            image.setImageResource(R.drawable.buburayamori);
                            displayHargaSatuan.setText("Harga Seporsi : Rp. 8.000");
                            displayIsiSatuan.setText("1 Mangkung Ukuran Sedang");
                            quantity = 1;
                            displayQuantity(quantity);
                            pilihanBubur = 3;
                            displayDYK.setText(getString(R.string.BuburAyamDYK));
                        } else {
                            if (item.equals("Kampiun")) {
                                image.setImageResource(R.drawable.buburkampiun);
                                displayHargaSatuan.setText("Harga Seporsi : Rp. 3.000");
                                displayIsiSatuan.setText("1 Mangkung Ukuran Sedang");
                                quantity = 1;
                                displayQuantity(quantity);
                                pilihanBubur = 4;
                                displayDYK.setText(getString(R.string.BuburKampiunDYK));
                            }
                        }
                    }
                }
            } else {
                if (pilihanMenu == 3) {
                    // Showing selected spinner item
                    Toast.makeText(parent.getContext(), "Kamu melilih nasi : " + item, Toast.LENGTH_LONG).show();

                    displayHargaSatuan.setText("Harga Seporsi : Rp. 5.000");
                    displayIsiSatuan.setText("1 Piring Ukuran Sedang");

                    if (item.equals("Uduk")) {
                        image.setImageResource(R.drawable.nasiudukori);
                        quantity = 1;
                        displayQuantity(quantity);
                        pilihanNasi = 1;
                        displayDYK.setText(getString(R.string.NasiUdukDYK));

                    } else {
                        if (item.equals("Ulam")) {
                            image.setImageResource(R.drawable.nasiulam);
                            quantity = 1;
                            displayQuantity(quantity);
                            pilihanNasi = 2;
                            displayDYK.setText(getString(R.string.NasiUlamDYK));
                        } else {
                            if (item.equals("Kuning")) {
                                image.setImageResource(R.drawable.nasikuning);
                                quantity = 1;
                                displayQuantity(quantity);
                                pilihanNasi = 3;
                                displayDYK.setText(getString(R.string.NasiKuningDYK));
                            }
                        }
                    }
                }
            }
        }
    }


    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    public void displayQuantity(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

    public void increment(View view) {
        if (quantity == 100) {
            //Show an error message as a toast
            Toast.makeText(this, "You cannot order more than 100 qty", Toast.LENGTH_SHORT).show();
            //Exit this method early because there's nothing left to do
            return;
        }
        quantity = quantity + 1;
        displayQuantity(quantity);
    }

    /**
     * decrement
     */
    public void decrement(View view) {
        if (quantity == 1) {
            //Show an error message as a toast
            Toast.makeText(this, "Minimum order is 1 qty", Toast.LENGTH_SHORT).show();
            //Exit this method early because there's nothing left to do
            return;
        }
        quantity = quantity - 1;
        displayQuantity(quantity);
    }

}
