package introducaoPoo.exercise.student;

import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        Entities student = new Entities();

        student.name = scanner.nextLine();
        student.grade1 = scanner.nextDouble();
        student.grade2 = scanner.nextDouble();
        student.grade3 = scanner.nextDouble();

        System.out.printf("Final grade: %.2f%n", student.finalGrade());

        if (student.finalGrade() < 60.0) {
            System.out.println("Failed");
            System.out.printf("Missing %.2f points%n", student.missingPoints());
        } else {
            System.out.println("Pass");
        }
        scanner.close();
    }
}
