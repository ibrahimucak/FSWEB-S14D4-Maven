package org.example.model;

public class Bread extends  ProductForSale{
private String flourType;
private String color;
    public Bread(String type, int price, String description) {
        super(type, (double) price, description);
    }





    public Bread(String type, double price, String description, String flourType) {
        super(type, price, description);
        this.flourType = flourType;
    }

    @Override
    public void showDetails() {
        System.out.println(super.toString() + this);
    }


}
