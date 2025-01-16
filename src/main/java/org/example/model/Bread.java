package org.example.model;

public class Bread extends ProductForSale{
    private String breadType;

    public Bread(String type, int price, String description) {
        super(type, price, description);
    }

    public Bread(String type, int price, String description, String breadType) {
        super(type, price, description);
        this.breadType = breadType;
    }

    public String getBeadType() {
        return breadType;
    }

    @Override
    public void showDetails() {
        System.out.println("Type: " + getType() + ", Price: " + getPrice() + ", Description: " + getDescription() + ", Bread Type: " + getBeadType());
    }
}
