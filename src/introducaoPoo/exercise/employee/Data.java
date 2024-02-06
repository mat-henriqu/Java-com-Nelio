package introducaoPoo.exercise.employee;

import java.util.Locale;
import java.util.Scanner;

public class Data {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        Employee employee = new Employee();

        System.out.print("Name: ");
        employee.name=scanner.nextLine();
        System.out.print("Gross Salary: ");
        employee.grossSalary=scanner.nextDouble();
        System.out.print("Tax: ");
        employee.tax=scanner.nextDouble();

        System.out.println();
        System.out.println("Employee "+employee);

        System.out.println();
        System.out.print("Which percentage to increase salary: ");
        double percentage = scanner.nextDouble();
        employee.increaseSalary(percentage);

        System.out.println();
        System.out.println("Update data: "+ employee);




    }
}
