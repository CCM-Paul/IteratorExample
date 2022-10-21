import java.util.Iterator;

public class MyIntegers implements Iterable<Integer> {

    private final Integer[] numbers;

    public MyIntegers(Integer[] numbers) {
        this.numbers = numbers;
    }
    @Override
    public Iterator<Integer> iterator() {
        return new MyIterator();
    }

    private class MyIterator implements Iterator<Integer> {

        int currIndex = 0;

        @Override
        public boolean hasNext() {
            return currIndex < numbers.length;
        }

        @Override
        public Integer next() {
            return numbers[currIndex++];
        }
    }
}
