package Entities;

public class OutsourcedEmployee extends Employee{
	public Double additionalCharge;
	public Double getAdditionalCharge() {
		return additionalCharge;
	}
	public void setAdditionalCharge(Double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}
	public OutsourcedEmployee(String name, Integer hours, Double valuePerHour) {
		super(name, hours, valuePerHour);
		// TODO Auto-generated constructor stub
	}
	@Override
	public double payment() {
		return super.payment() + additionalCharge * 1.1;
		
	}
}
