package herancaPolimorfismo.polimorfismo.application;

import herancaPolimorfismo.polimorfismo.entities.Employee;
import herancaPolimorfismo.polimorfismo.entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        List<Employee> employeeList = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        int n = scanner.nextInt();

        for (int i = 1; i <=n; i++){
            System.out.println("Employee #"+i+" data: ");
            System.out.print("Outsourced (y/n)? ");
            char ch = scanner.next().charAt(0);
            System.out.print("Name: ");
            scanner.nextLine();
            String name = scanner.nextLine();
            System.out.print("Hours: ");
            int hours = scanner.nextInt();
            System.out.print("Value per hour: ");
            double valuePerHour = scanner.nextDouble();
            if (ch == 'y'){
                System.out.print("Additional charge: ");
                double additionalCharge = scanner.nextDouble();
                employeeList.add(new OutsourcedEmployee(name, hours,valuePerHour,additionalCharge));
            } else {
                employeeList.add(new Employee(name, hours,valuePerHour));
            }
        }

        System.out.println("\nPAYMENTS");
        for (Employee employee : employeeList ){
            System.out.println(employee.getName()+" - $" + String.format("%.2f", employee.payment()));
        }


        scanner.close();
    }
}
