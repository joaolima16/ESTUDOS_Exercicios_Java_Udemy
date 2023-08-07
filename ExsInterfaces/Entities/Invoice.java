package ExsInterfaces.Entities;

public class Invoice {
    private Double basicPayment;
    private Double tax;
    private Double totalPayment;
    public Invoice(Double basicPayment, Double tax) {
        this.basicPayment = basicPayment;
        this.tax = tax;

    }
    public Double getBasicPayment() {
        return basicPayment;
    }
    public void setBasicPayment(Double basicPayment) {
        this.basicPayment = basicPayment;
    }
    public Double getTax() {
        return tax;
    }
    public void setTax(Double tax) {
        this.tax = tax;
    }
    public Double getTotalPayment() {
        return getBasicPayment() + getTax();
    }
    public void setTotalPayment(Double totalPayment) {
        this.totalPayment = totalPayment;
    }

}
