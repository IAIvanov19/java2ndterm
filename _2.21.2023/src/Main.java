import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\VRKirov19\\source\\repos\\txtFile.txt";
        String outputPath = "C:\\Users\\VRKirov19\\source\\repos\\Output.txt"
        FileReader fileReader = new FileReader(path);
        BufferedReader reader = new BufferedReader(fileReader);
        FileWriter fileWriter = new FileWriter(outputPath);
        BufferedWriter writer = new BufferedWriter(new FileWriter(outputPath));
        String currentLine = reader.readLine();
        while (currentLine != null) {
            int sum = 0;
            for (int i = 0; i < currentLine.length(); i++) {
                sum += currentLine.charAt(i);
            }
            fileWriter.write(String.valueOf(sum));
            writer.write("\n");
            currentLine = reader.readLine();
        }
    }
}