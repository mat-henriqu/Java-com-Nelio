package tratamentoExcecoes.pilhaChamMetodo;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        method1();
        System.out.println("End of program");
    }

    public static void method1(){
        System.out.println("***Method1 start***");
        method2();
        System.out.println("***Method1 end***");

    }

    public static void method2(){
        System.out.println("***Method2 start***");
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
        scanner.close();
        System.out.println("***Method2 end***");
    }
}
