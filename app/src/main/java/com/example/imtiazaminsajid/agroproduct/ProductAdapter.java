package com.example.imtiazaminsajid.agroproduct;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ProductAdapter extends ArrayAdapter<Product> {

    public Context context;
    public ArrayList<Product> productArrayList;

    public ProductAdapter(@NonNull Context context, ArrayList<Product> productArrayList) {
        super(context,R.layout.row_layout, productArrayList);
        this.context = context;
        this.productArrayList = productArrayList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        convertView = inflater.inflate(R.layout.row_layout,parent,false);

        TextView nameTV = convertView.findViewById(R.id.productName);
        TextView phoneTV = convertView.findViewById(R.id.productPrice);
        ImageView imageTV = convertView.findViewById(R.id.productImage);

        nameTV.setText(productArrayList.get(position).getProductName());
        phoneTV.setText(productArrayList.get(position).getProductPrice());
        imageTV.setImageResource(productArrayList.get(position).getProductImage());

        return convertView;
    }
}
