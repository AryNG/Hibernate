package com.hibernate.model;

public class Product {
	private int idProduct;
	private String productName;
	private double productPrice;
	
	public Product() {}

	public Product (int idProduct, String productName, double productPrice) {
		this.idProduct =  idProduct;
		this.productName = productName;
		this.productPrice = productPrice;
		
		
	}

	public int getIdProduct() {
		return idProduct;
	}

	public void setIdProduct(int idProduct) {
		this.idProduct = idProduct;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	@Override
	public String toString() {
		return "product [idProduct="+idProduct+", productName="+productName+", productPrice="+productPrice+"]";
				
	}
}
