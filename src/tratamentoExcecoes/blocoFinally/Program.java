package tratamentoExcecoes.blocoFinally;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Matheus Henrique\\OneDrive\\Área de Trabalho\\Teste.txt");
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
            while(scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException fileNotFoundException){
            System.out.println("Error opening file: "+ fileNotFoundException.getMessage());
        } finally {
            if (scanner != null){
                scanner.close();
            }
        }
    }
}
