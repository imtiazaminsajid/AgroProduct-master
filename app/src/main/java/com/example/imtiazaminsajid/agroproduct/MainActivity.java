package com.example.imtiazaminsajid.agroproduct;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    ArrayList<Product> productArrayList;
    Product product;
    ProductAdapter productAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView =findViewById(R.id.listview);
        product = new Product();
        productArrayList = product.getAllProduct();
        productAdapter = new ProductAdapter(this, productArrayList);
        listView.setAdapter(productAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this,ProductDetails.class);
                intent.putExtra("ProductName", listView.getItemIdAtPosition(position));
                startActivity(intent);
            }
        });
    }

}
