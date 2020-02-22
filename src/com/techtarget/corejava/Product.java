package com.targettech.corejava;

public class Product {

    private int product_id;
    private String product_type;
    private int product_rate;

    public Product(int product_id, String product_type, int product_rate) {
        this.product_id = product_id;
        this.product_type = product_type;
        this.product_rate = product_rate;
    }

    @Override
    public String toString() {
        return "Product{" +
                "product_id=" + product_id +
                ", product_type='" + product_type + '\'' +
                ", product_rate=" + product_rate +
                '}';
    }
}
