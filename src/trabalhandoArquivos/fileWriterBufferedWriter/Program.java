package trabalhandoArquivos.fileWriterBufferedWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {
    public static void main(String[] args) {
        String[] lines = new String[]{
                "Good morning",
                "Good afternoon",
                "Good night"
        };
        String path = "C:\\out.txt";
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path))){
            for (String line : lines){
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
