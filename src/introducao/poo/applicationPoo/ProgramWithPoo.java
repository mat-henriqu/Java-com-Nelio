package introducao.poo.applicationPoo;

import java.util.Locale;
import java.util.Scanner;

public class ProgramWithPoo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        Triangule x,y;
        x = new Triangule();
        y = new Triangule();

        System.out.println("Enter the measures of triangle X: ");
        x.a = scanner.nextDouble();
        x.b = scanner.nextDouble();
        x.c = scanner.nextDouble();

        System.out.println("Enter the measures of triangle Y: ");
        y.a = scanner.nextDouble();
        y.b = scanner.nextDouble();
        y.c = scanner.nextDouble();

        double pX = (x.a+x.b+x.c)/2.0;
        double areaX = Math.sqrt(pX*(pX-x.a)*(pX-x.b)*(pX-x.c));
        double pY = (y.a+y.b+y.c)/2.0;
        double areaY = Math.sqrt(pY*(pY-y.a)*(pY-y.b)*(pY-y.c));

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
