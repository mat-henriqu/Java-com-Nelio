package construtoresSobrecargaEncapsulamento.encapsulamento;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner (System.in);


        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = scanner.next();
        System.out.print("Price: ");
        double price = scanner.nextInt();

        Product product = new Product(name,price);

        System.out.println();
        System.out.println("Product data: "+product);
        System.out.println();
        System.out.print("Enter the number of products to be added in stock: ");
        int quantity = scanner.nextInt();
        product.addProducts(quantity);
        System.out.println("Update data: "+ product);
        System.out.println();
        System.out.print("Enter the number of products to be removed in stock: ");
        quantity = scanner.nextInt();
        product.removeProducts(quantity);
        System.out.println("Update data: "+ product);
    }
}
