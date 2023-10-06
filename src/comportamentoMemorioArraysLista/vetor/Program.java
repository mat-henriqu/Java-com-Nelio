package comportamentoMemorioArraysLista.vetor;

import java.util.Locale;
import java.util.Scanner;

//Fazer um programa para ler um numero inteiro N e a altura de N pessoas. Armazene as N alturas em um vetor.
//Em seguida, mostrar a altura media dessas pessoas.
public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.print("Digite um numero para ser o tamanho do seu quadro de pessoas: ");
        n = scanner.nextInt();

        double [] vect = new double[n];

        for (int i = 0; i < n;i++){
            System.out.print("Digite a altura da "+ (i+1) + "° pesssoa: ");
            vect [i] = scanner.nextDouble();
        }

        double sum = 0.0;

        for (int i=0; i<n; i++){
            sum+=vect[i];
        }

        double avg = sum / n;

        System.out.printf("A altura media e: %.2f", avg);

        scanner.close();
    }
}
