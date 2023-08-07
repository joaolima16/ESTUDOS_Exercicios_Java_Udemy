package ExsInterfaces.Services;

import java.time.Duration;

import ExsInterfaces.Entities.CarRental;
import ExsInterfaces.Entities.Invoice;

public class RentalService {
    private double pricePerHour;
    private double pricePerDay;
    private TaxService taxService;
 

    public RentalService(double pricePerHour, double pricePerDay, TaxService taxService) {
        this.pricePerHour = pricePerHour;
        this.pricePerDay = pricePerDay;
        this.taxService = taxService;
    }
    public double getPricePerHour() {
        return pricePerHour;
    }
    public void setPricePerHour(double pricePerHour) {
        this.pricePerHour = pricePerHour;
    }
    public double getPricePerDay() {
        return pricePerDay;
    }
    public void setPricePerDay(double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }
    public void processInvoice(CarRental carRental){
        double minutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
        double hours = minutes / 60.0;
        double basicPayment;
        if( hours<=12.0){
            basicPayment = pricePerHour * Math.ceil(hours);
        }
        else{
            basicPayment = pricePerDay * Math.ceil(hours / 24.0);
        }
        double tax = taxService.tax(basicPayment);
        carRental.setInvoice(new Invoice(basicPayment, tax));
    }
}
