import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Arrays.stream(scanner.nextLine().split("\\s+"))
                .filter(word -> word.length() <= n).forEach(System.out::println);

        // int[] numbers = {1, 2, 3, 4};
//
// System.out.println(Arrays.stream(numbers).map(e -> e * 2).max().getAsInt());
//
// Arrays.stream(numbers).forEach(System.out::println);

// Scanner scanner = new Scanner(System.in);
// System.out.println(Arrays.stream(scanner.nextLine().split("\\s+"))
// .mapToInt(Integer::parseInt)
// .min()
// .getAsInt());

// Scanner scanner = new Scanner(System.in);
// List<Integer> numbers = Arrays.stream(scanner.nextLine()
// .split("\\s+")).map(Integer::parseInt)
// .collect(Collectors.toList());
//
// int n = Integer.parseInt(scanner.nextLine());
//
// Collections.reverse(numbers);
//
// numbers.stream().filter(e -> e % n!= 0).forEach(e->System.out.print(e + " "));
// System.out.println();
// System.out.println("-----");
// numbers.stream().forEach(e->System.out.print(e + " "));

    }
}
