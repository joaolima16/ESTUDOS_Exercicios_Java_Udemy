package ExsInterfaces.Application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import ExsInterfaces.Entities.CarRental;
import ExsInterfaces.Entities.Vehicle;
import ExsInterfaces.Services.RentalService;
import ExsInterfaces.Services.TaxService;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        System.out.println("-------------------- Entre com os dados do aluguel ---------------------------");
        System.out.println("Modelo do carro");
        String carModel = sc.nextLine();
        System.out.println("Data de entrada(dd/mm/yyyy)");
        LocalDateTime start = LocalDateTime.parse(sc.nextLine(), dtf);
        System.out.println("Data de saída(dd/mm/yyyy)");
        LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), dtf);
        CarRental cr = new CarRental(start, finish, new Vehicle(carModel));
        TaxService _tax = new TaxService();
        System.out.println("Digite o preço da hora: ");
        double valuePerHour = sc.nextDouble();
        System.out.println("Digite o preço da diaria: ");
        double valuePerDay = sc.nextDouble();
        RentalService rentalService = new RentalService(valuePerHour, valuePerDay, new TaxService());
        rentalService.processInvoice(cr);
        System.out.println("FATURA: ");
        System.out.println("PAGAMENTO BASICO: " + cr.getInvoice().getBasicPayment());
        System.out.println("Imposto: " + cr.getInvoice().getTax());
        System.out.println("PAGAMENTO TOTAL: "  + cr.getInvoice().getTotalPayment());

    }
}
