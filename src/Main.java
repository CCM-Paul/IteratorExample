import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        MyIntegers nums = new MyIntegers(new Integer[] {2, 3, 4});
        Iterator i1 = nums.iterator();
        for (int i : nums) {
            for (int j : nums) {
                System.out.println(i + " " + j);
            }
        }
//        Iterator i1 = new MyIterator(5);
//        Iterator i2 = new MyIterator(2);
//        System.out.println(i1.next());
//        System.out.println(i2.next());
//        System.out.println(i2.next());
//        System.out.println(i1.next());

//        System.out.println(i1.next());
//        System.out.println(i1.next());
//        System.out.println(i1.next());
//        System.out.println(i1.next());
//        System.out.println(i1.next());
//
//        while (i1.hasNext()) {
//
//            System.out.println(i1.next());
//        }
    }
}