package org.example.model;

public class Store {
    public static void main(String[] args) {

        ProductForSale chocolate = new Chocolate("Snack", 40, "High quality chocolate", "Cow Milk");
        ProductForSale coke = new Coke("Drink", 25, "High acidic heaven", "High Sugar");
        ProductForSale bread = new Bread("Food", 10, "Nicely done, high gluten bread", "White Bread");

        ProductForSale[] products = {chocolate, coke, bread};
        listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {
        for (ProductForSale product: products) {
            product.showDetails();
        }
    }
}