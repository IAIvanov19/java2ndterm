import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String[] inputNumbers = scanner.nextLine().split(", ");
        int[] numbers = new int[inputNumbers.length];
        for(int i = 0; i < inputNumbers.length; i++){
            numbers[i] = Integer.parseInt(inputNumbers[i]);
        }
        Lake lake = new Lake(numbers);

        String end = scanner.nextLine();
        StringBuilder builder = new StringBuilder();

        for (int number : lake){
            System.out.println(number + ", ");
        }

        String finalResult = builder.substring(0, builder.length() -2);
        System.out.println(finalResult);

    }
}