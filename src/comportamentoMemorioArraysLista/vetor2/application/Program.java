package comportamentoMemorioArraysLista.vetor2.application;
//Fazer um programa para ler um numero inteiro N e os ddos de N produtos. Armazene os N produtos em um vetor.
//Em seguida, mostrar o preço medio dos produtos.
import comportamentoMemorioArraysLista.vetor2.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        int n;
        System.out.print("Digite o numero para ser a quantidade de produtos a serem lidos: ");
        n = scanner.nextInt();

        Product[] vect = new Product[n];

        for (int i=0; i< vect.length; i++){
            scanner.nextLine();
            System.out.print("Digite o "+(i+1)+"° nome do produto: ");
            String name = scanner.nextLine();
            System.out.print("Digite o preço do "+(i+1)+"° produto: ");
            double price = scanner.nextDouble();
            vect [i] = new Product(name, price);
        }

        double sum = 0.0;

        for (int i=0; i< vect.length; i++){
            sum+= vect[i].getPrice();
        }

        double avg = sum / vect.length;

        System.out.printf("A media dos preços e: %.2f", avg);

        scanner.close();
    }
}
