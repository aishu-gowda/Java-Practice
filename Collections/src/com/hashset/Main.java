package com.hashset;

public class Main {

    public static void main(String[] args) {

        ShoppingCart cart = new ShoppingCart();

        cart.addProduct(new Product(101, "Laptop", 60000));

        cart.addProduct(new Product(102, "Mouse", 700));

        cart.addProduct(new Product(103, "Keyboard", 1200));

        // Duplicate ID
        cart.addProduct(new Product(101, "Gaming Laptop", 90000));

        System.out.println();

        cart.displayProducts();

        System.out.println();

        cart.searchProduct(102);

        System.out.println();

        cart.updateProduct(102, "Wireless Mouse", 1500);

        System.out.println();

        cart.displayProducts();

        System.out.println();

        cart.removeProduct(103);

        System.out.println();

        cart.displayProducts();
    }
}
