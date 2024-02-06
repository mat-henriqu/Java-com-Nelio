package interfaces.solucaoProblema.application;

import interfaces.solucaoProblema.model.entites.CarRental;
import interfaces.solucaoProblema.model.entites.Vehicle;
import interfaces.solucaoProblema.model.services.BrazilTaxServices;
import interfaces.solucaoProblema.model.services.RentalServices;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Entre com os dados do aluguel: ");
        System.out.print("Modelo do carro: ");
        String carModel = scanner.nextLine();
        System.out.print("Retirada: (dd/MM/yyy hh:mm): ");
        LocalDateTime start = LocalDateTime.parse(scanner.nextLine(), dateTimeFormatter);
        System.out.print("Retorno: (dd/MM/yyy hh:mm): ");
        LocalDateTime finish = LocalDateTime.parse(scanner.nextLine(), dateTimeFormatter);

        CarRental carRental = new CarRental(start, finish, new Vehicle(carModel));

        System.out.print("Entre com o preço por hora: ");
        double pricePerHour = scanner.nextDouble();
        System.out.print("Entre com o preço por dia: ");
        double pricePerDay = scanner.nextDouble();

        RentalServices rentalServices = new RentalServices(pricePerHour, pricePerDay, new BrazilTaxServices());
        rentalServices.processInvoice(carRental);

        System.out.println("FATURA: ");
        System.out.println("Pagamento basico: " + carRental.getInvoice().getBasicPayment());
        System.out.println("Imposto: " + carRental.getInvoice().getTax());
        System.out.println("Pagamento total: " + carRental.getInvoice().getTotalPayment());


        scanner.close();
    }
}
