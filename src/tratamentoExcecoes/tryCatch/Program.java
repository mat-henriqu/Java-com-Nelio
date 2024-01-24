package tratamentoExcecoes.tryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            String [] vector = scanner.nextLine().split(" ");
            int position = scanner.nextInt();
            System.out.println(vector[position]);
        } catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("Invalid position!");
        } catch (InputMismatchException exception){
            System.out.println("Input error");
        }


        System.out.println("End of program");
        scanner.close();
    }
}
