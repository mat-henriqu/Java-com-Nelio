package membros.estaticos.three;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = scanner.nextDouble();
        double c = CalculatorTwo.circumference(radius);
        double v = CalculatorTwo.volume(radius);
        System.out.println();
        System.out.printf("Circumference %.2f\n", c);
        System.out.printf("Volume %.2f\n", v);
        System.out.printf("PI value %.2f\n", CalculatorTwo.PI);
    }
}
