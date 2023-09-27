package introducao.poo.exercise.rectangles;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        Rectangles rectangles = new Rectangles();

        System.out.println("Enter the rectangle width and heigth: ");
        rectangles.width = scanner.nextDouble();
        rectangles.height = scanner.nextDouble();

        System.out.printf("Area: %.2f\n", rectangles.area());
        System.out.printf("Perimeter: %.2f\n", rectangles.perimeter());
        System.out.printf("Diagonal: %.2f\n",rectangles.diagonal());
    }
}
