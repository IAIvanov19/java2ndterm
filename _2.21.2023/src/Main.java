import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\iaivanov19\\source\\repos\\random.txt";
        FileInputStream inputStream = new FileInputStream(path);
        String outputPath = "C:\\Users\\iaivanov19\\source\\repos\\random.txt";
        FileOutputStream outputStream = new FileOutputStream(outputPath);
        int oneByte = inputStream.read();
        while (oneByte >= 0) {
            outputStream.write(oneByte);
            oneByte = inputStream.read();
        }
    }
}