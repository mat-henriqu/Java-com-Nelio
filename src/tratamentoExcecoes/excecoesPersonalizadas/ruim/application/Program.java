package tratamentoExcecoes.excecoesPersonalizadas.ruim.application;

import tratamentoExcecoes.excecoesPersonalizadas.ruim.entites.Reservation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Room number: ");
        int roomNumber = scanner.nextInt();
        System.out.print("Check-in date (dd/MM/yyyy): ");
        Date checkIn = simpleDateFormat.parse(scanner.next());
        System.out.print("Check-out date (dd/MM/yyyy): ");
        Date checkOut = simpleDateFormat.parse(scanner.next());

        if (checkOut.before(checkIn)) {
            System.out.println("Error in reservation: Check-out date must be after check-in date");
        } else {
            Reservation reservation = new Reservation(roomNumber, checkIn, checkOut);
            System.out.println("Reservation: " + reservation);
            System.out.println("\nEnter data to update the reservation: ");
            System.out.print("Check-in date (dd/MM/yyyy): ");
            checkIn = simpleDateFormat.parse(scanner.next());
            System.out.print("Check-out date (dd/MM/yyyy): ");
            checkOut = simpleDateFormat.parse(scanner.next());

            String error = reservation.updateDates(checkIn, checkOut);
            if (error != null) {
                System.out.println(error);
            } else {
                System.out.println("Reservation: " + reservation);
            }

        }
        scanner.close();
    }
}