package introducao.poo.application;

import java.util.Locale;
import java.util.Scanner;
//Problema Exemplo
//Fazer um programa que leia as medidas dos lados de dois triangulos X e Y
//Em seguida mostrar o valor da area dos dois triangulos e dizer qual dos dois triangulos possui a maior area
//Formula de HERON
//Area=Vp(p-a)(p-b)(p-c)
//p=(a+b+c)/2
public class ProgramWithOutPoo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        double xA,xB,xC;
        double yA,yB,yC;
        System.out.println("Enter the measures of triangle X: ");
        xA = scanner.nextDouble();
        xB = scanner.nextDouble();
        xC = scanner.nextDouble();

        System.out.println("Enter the measures of triangle Y: ");
        yA = scanner.nextDouble();
        yB = scanner.nextDouble();
        yC = scanner.nextDouble();

        double pX = (xA+xB+xC)/2.0;
        double areaX = Math.sqrt(pX*(pX-xA)*(pX-xB)*(pX-xC));
        double pY = (yA+yB+yC)/2.0;
        double areaY = Math.sqrt(pY*(pY-yA)*(pY-yB)*(pY-yC));

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
