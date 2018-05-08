package com.example.imtiazaminsajid.agroproduct;

import java.util.ArrayList;

public class Product {
    private String productName;
    private String productPrice;
    private int productImage;

    public Product(String productName, String productPrice, int productImage) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productImage = productImage;
    }

    public Product(String productName, String productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
    }


    public Product() {
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
    }

    public int getProductImage() {
        return productImage;
    }

    public void setProductImage(int productImage) {
        this.productImage = productImage;
    }

    public ArrayList<Product> getAllProduct(){
        ArrayList<Product>product = new ArrayList<>();
        product.add(new Product("Imtiaz Amin", "01677006082", R.id.productImage));
        product.add(new Product("Imtiaz Amin", "01677006082"));
        product.add(new Product("Imtiaz Amin", "01677006082"));
        product.add(new Product("Imtiaz Amin", "01677006082"));
        product.add(new Product("Imtiaz Amin", "01677006082"));
        product.add(new Product("Imtiaz Amin", "01677006082"));
        product.add(new Product("Imtiaz Amin", "01677006082"));
        product.add(new Product("Imtiaz Amin", "01677006082"));
        product.add(new Product("Imtiaz Amin", "01677006082"));
        product.add(new Product("Imtiaz Amin", "01677006082"));

        return product;

    }
}
