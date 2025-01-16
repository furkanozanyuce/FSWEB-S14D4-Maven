package org.example.model;

public class Chocolate extends ProductForSale{
    private String milkType;

    public Chocolate(String type, int price, String description) {
        super(type, price, description);
    }

    public Chocolate(String type, int price, String description, String milkType) {
        super(type, price, description);
        this.milkType = milkType;
    }

    public String getMilkType() {
        return milkType;
    }

    @Override
    public void showDetails() {
        System.out.println("Type: " + getType() + ", Price: " + getPrice() + ", Description: " + getDescription() + ", Milk Type: " + getMilkType());
    }
}
