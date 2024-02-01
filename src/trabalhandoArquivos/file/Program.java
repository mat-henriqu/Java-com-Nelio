package trabalhandoArquivos.file;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        File file = new File("C:\\texto.txt");
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
        } catch (IOException ioException){
            System.out.println("Error: " + ioException.getMessage());
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }
}
