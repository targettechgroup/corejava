package com.targettech.corejava;

public class Sale {

    private int sale_id;
    private int sale_total;
    private String sale_date;

    public Sale(int sale_id, int sale_total, String sale_date) {
        this.sale_id = sale_id;
        this.sale_total = sale_total;
        this.sale_date = sale_date;
    }

    @Override
    public String toString() {
        return "Sale{" +
                "sale_id=" + sale_id +
                ", sale_total=" + sale_total +
                ", sale_date='" + sale_date + '\'' +
                '}';
    }
}
