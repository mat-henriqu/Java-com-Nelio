package comportamentoMemorioArraysLista.negativos;

import java.util.Locale;
import java.util.Scanner;

//Faça um programa que leia um numero inteiro positivo N (Maximo = 10) e depois N numeros inteiros
//e armazene em um vetor.
//Em seguida, mostrar na tela todos os numeros negativos lidos.
public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        System.out.print("Quantos numeros voce vai digitar? ");
        int n = scanner.nextInt();

        int [] vet = new int[n];

        for (int i = 0 ; i < vet.length; i++){
            System.out.print("Digite um numero: ");
            vet[i] = scanner.nextInt();
        }

        System.out.println("Numeros negativos: ");
        for (int i = 0; i < vet.length; i++){
            if (vet[i] < 0) {
                System.out.println(vet[i]);
            }
        }
    }
}
