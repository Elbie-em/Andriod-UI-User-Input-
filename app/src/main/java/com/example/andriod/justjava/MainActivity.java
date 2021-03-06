package com.example.andriod.justjava;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {

    int numberOfCoffees = 0;
    double price = 5.23;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        String msg = "Total $" + numberOfCoffees * price;

    }


    /**
     * This method increments the given quantity on the screen.
     */

    public void increment(View view) {
        numberOfCoffees += 1;
        display(numberOfCoffees);
    }

    /**
     * This method decrements the given quantity on the screen.
     */

    public void decrement(View view){
        numberOfCoffees -= 1;
        if(numberOfCoffees < 0) {
            numberOfCoffees = 0;
        }
        display(numberOfCoffees);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }


    /**
     * This method displays the given price on the screen.
     */
    private void displayPrice(int number) {
        TextView priceTextView = findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }


}
