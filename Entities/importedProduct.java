package Entities;

public class importedProduct extends Product {
	private Double customsFee;
	
	public importedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		setCustomsFee(customsFee);
		// TODO Auto-generated constructor stub
	}

	public Double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}
	public double totalPrice() {
		 return super.getPrice() + getCustomsFee();
	}
	@Override
	public double price() {
		return super.getPrice() + getCustomsFee();
	}
}
