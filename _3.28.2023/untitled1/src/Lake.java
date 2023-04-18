import java.util.Iterator;

public class Lake implements Iterable<Integer>{
    private int[] numbers;

    public Lake(int[] numbers) {
        this.numbers = numbers;
    }

    private class Frog implements Iterator<Integer> {
        private int index = 0;
        private int lastEvenIndex = numbers.length % 2 == 0 ? numbers.length - 2 : numbers.length - 1;

        @Override
        public boolean hasNext() {
            return index < numbers.length;
        }

        @Override
        public Integer next() {
            int number = numbers[index];
            if(index == lastEvenIndex) {
                index = 1;
            } else {
                index += 2;
            }

            return number;
        }
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Frog();
    }
}
