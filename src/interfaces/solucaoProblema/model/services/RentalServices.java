package interfaces.solucaoProblema.model.services;

import interfaces.solucaoProblema.model.entites.CarRental;
import interfaces.solucaoProblema.model.entites.Invoice;
import org.jetbrains.annotations.NotNull;

import java.time.Duration;

public class RentalServices {
    private Double pricePerHour;
    private Double pricePerDay;
    private TaxSerivces taxServices;

    public RentalServices() {
    }

    public RentalServices(Double pricePerHour, Double pricePerDay, TaxSerivces taxServices) {
        this.pricePerHour = pricePerHour;
        this.pricePerDay = pricePerDay;
        this.taxServices = taxServices;
    }

    public void processInvoice(@NotNull CarRental carRental) {
        double minutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
        double hours = minutes / 60.0;
        double basicPayment = (hours <= 12.0)
                ? (basicPayment = pricePerHour * Math.ceil(hours))
                : (basicPayment = pricePerDay * Math.ceil(hours / 24.0));
        double tax = taxServices.tax(basicPayment);
        carRental.setInvoice(new Invoice(basicPayment, tax));
    }

    public Double getPricePerHour() {
        return pricePerHour;
    }

    public void setPricePerHour(Double pricePerHour) {
        this.pricePerHour = pricePerHour;
    }

    public Double getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(Double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public TaxSerivces getTaxServices() {
        return taxServices;
    }

    public void setTaxServices(TaxSerivces taxServices) {
        this.taxServices = taxServices;
    }
}
