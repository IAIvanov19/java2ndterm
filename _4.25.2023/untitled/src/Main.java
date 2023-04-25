import java.util.*;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Function<String, Integer> parseToInt = element -> Integer.parseInt(element);

        List<Integer> integers = Arrays.stream(scanner.nextLine().split(", "))
                .map(Integer::parseInt)
                .toList();
        System.out.println("Count = " + integers.size());

        int sum = integers.stream().mapToInt(Integer::valueOf).sum();

        System.out.println("Sum = " + sum);
    }
}