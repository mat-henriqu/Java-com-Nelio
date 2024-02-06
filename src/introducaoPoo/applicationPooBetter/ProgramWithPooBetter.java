package introducaoPoo.applicationPooBetter;

import java.util.Locale;
import java.util.Scanner;

public class ProgramWithPooBetter {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        Triangules x,y;
        x = new Triangules();
        y = new Triangules();

        System.out.println("Enter the measures of triangle X: ");
        x.a = scanner.nextDouble();
        x.b = scanner.nextDouble();
        x.c = scanner.nextDouble();

        System.out.println("Enter the measures of triangle Y: ");
        y.a = scanner.nextDouble();
        y.b = scanner.nextDouble();
        y.c = scanner.nextDouble();


        double areaX = x.area();
        double areaY = y.area();

        System.out.printf("Triangle X area %.4f\n",areaX);
        System.out.printf("Triangle Y area %.4f\n",areaY);

        if (areaX>areaY){
            System.out.printf("Larger area: X %.4f", areaX);
        }else {
            System.out.printf("Larger area: Y %.4f", areaY);
        }

        scanner.close();
    }
}
