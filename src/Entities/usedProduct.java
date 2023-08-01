package Entities;

import java.util.Date;

public class usedProduct extends Product {
	private Date manufactureDate;
	
	public usedProduct(String name, Double price, Date manufactureDate) {
		super(name, price);
		setManufactureDate(manufactureDate);
		// TODO Auto-generated constructor stub
	}

	public Date getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	
}
