import java.util.*;
import javax.print.attribute.IntegerSyntax;

public class Main {
    public static void main(String[] args){
        Set<Integer> ints = new LinkedHashSet<>();
        ints.add(1);
        ints.add(38);
        ints.add(5);
        ints.add(1);
        ints.add(20);
        ints.remove(20);

        for(Integer integer: ints) {
            System.out.println(integer);
        }
    }
}