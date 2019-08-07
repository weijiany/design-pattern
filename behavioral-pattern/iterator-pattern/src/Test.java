import java.util.*;

public class Test {

    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        vector.add(1);
        vector.add(2);
        vector.add(3);
        show(vector.iterator());

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        show(list.iterator());

        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        show(stack.iterator());
    }

    private static void show(Iterator iterator) {
        while (iterator.hasNext())
            System.out.print(iterator.next() + " ");
        System.out.println();
    }
}
