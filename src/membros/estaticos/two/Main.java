package membros.estaticos.two;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = scanner.nextDouble();
        double c = calculator.circumference(radius);
        double v = calculator.volume(radius);
        System.out.println();
        System.out.printf("Circumference %.2f\n", c);
        System.out.printf("Volume %.2f\n", v);
        System.out.printf("PI value %.2f\n", calculator.PI);


    }
}
