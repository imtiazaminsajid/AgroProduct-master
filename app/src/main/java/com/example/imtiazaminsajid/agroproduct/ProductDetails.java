package com.example.imtiazaminsajid.agroproduct;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ProductDetails extends AppCompatActivity {
    ImageView imageView;
    TextView textViewName;
    TextView details;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_details);

        imageView = findViewById(R.id.SecondImage);
        textViewName = findViewById(R.id.nameofProduct);
        details = findViewById(R.id.details);

        Bundle bundle = getIntent().getExtras();
        if(bundle !=null){
             
        }
    }
}
