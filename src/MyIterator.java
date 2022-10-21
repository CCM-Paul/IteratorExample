import java.util.Iterator;

public class MyIterator implements Iterator<Integer> {

    private final int max;
    private int curr = 0;

    public MyIterator(int max) {
        this.max = max;
    }

    @Override
    public boolean hasNext() {
        return curr < max;
    }

    @Override
    public Integer next() {
        return curr++;
    }
}
