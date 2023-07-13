package com.booleanuk.extension;

public class BagelExt {


    private SKU sku;
    private String name;
    private double price;


    public BagelExt(SKU sku, String name, double price) {
        this.sku = sku;
        this.name = name;
        this.price = price;
    }


    public SKU getSku() {
        return sku;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
