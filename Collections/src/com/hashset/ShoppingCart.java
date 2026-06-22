package com.hashset;
import java.util.HashSet;
import java.util.Iterator;

public class ShoppingCart {

    HashSet<Product> products = new HashSet<>();

    // Add Product
    public void addProduct(Product product) {

        if (products.add(product)) {
            System.out.println("Product Added Successfully");
        } else {
            System.out.println("Duplicate Product ID. Product Not Added");
        }
    }

    // Display Products
    public void displayProducts() {

        if (products.isEmpty()) {
            System.out.println("Cart is Empty");
            return;
        }

        for (Product p : products) {
            System.out.println(p);
        }
    }

    // Search Product
    public void searchProduct(int id) {

        for (Product p : products) {

            if (p.getProductId() == id) {
                System.out.println("Product Found");
                System.out.println(p);
                return;
            }
        }

        System.out.println("Product Not Found");
    }

    // Remove Product
    public void removeProduct(int id) {

        Iterator<Product> itr = products.iterator();

        while (itr.hasNext()) {

            Product p = itr.next();

            if (p.getProductId() == id) {

                itr.remove();

                System.out.println("Product Removed");

                return;
            }
        }

        System.out.println("Product Not Found");
    }

    // Update Product
    public void updateProduct(int id, String newName, double newPrice) {

        for (Product p : products) {

            if (p.getProductId() == id) {

                p.setProductName(newName);
                p.setPrice(newPrice);

                System.out.println("Product Updated");

                return;
            }
        }

        System.out.println("Product Not Found");
    }
}