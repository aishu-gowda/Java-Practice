package com.hashset;

import java.util.Objects;

public class Product {
	private int productId;
    private String productName;
    private double price;

    public Product(int productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }
    
    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }
    public double getPrice() {
        return price;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    @Override
    public String toString() {
        return productId + " " + productName + " ₹" + price;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(productId);
    }
    @Override
    public boolean equals(Object obj)
    {
        if(this == obj)
    	{
		return true;
    	}
    	if(obj==null||getClass()!=obj.getClass()) 
    	{
    		return false;
    	}
    	Product other = (Product)obj;
    		
    	return productId == other.productId;
    }
    
}
