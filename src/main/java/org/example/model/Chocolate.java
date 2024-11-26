package org.example.model;

public class Chocolate extends  ProductForSale{
private String color;
private boolean hasSugar;

    public Chocolate(String type, double price, String description) {
        super(type, price, description);
    }

    public Chocolate(String type, double price, String description, String color, boolean hasSugar) {
        this(type, price, description);
        this.color = color;
        this.hasSugar = hasSugar;
    }

    @Override
    public void showDetails() {
        System.out.println(super.toString() + this);

    }
}
