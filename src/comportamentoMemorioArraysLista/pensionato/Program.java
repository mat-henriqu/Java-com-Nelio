package comportamentoMemorioArraysLista.pensionato;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        Rent[] vect = new Rent[10];

        System.out.print("How many room will be rented? ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++){
            System.out.println("\nRent # " +(i+1)+":");
            System.out.print("Name: ");
            scanner.nextLine();
            String name = scanner.nextLine();
            System.out.print("Email: ");
            String email = scanner.nextLine();
            System.out.print("Room: ");
            int roomNumber = scanner.nextInt();

            vect[roomNumber] = new Rent(name, email);
        }

        System.out.println("Busy rooms: ");
        for (int i = 0; i < vect.length; i++){
            if (vect[i]!=null){
                System.out.println(i+": "+ vect[i]);
            }
        }

        scanner.close();
    }
}
