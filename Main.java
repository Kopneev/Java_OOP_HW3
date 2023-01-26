package org.example;
import java.util.Iterator;
public class Main {
    public static void main(String[] args) {
        Integer[] ints = new Integer[]{1, 2, 3};

        Collection<Integer> collection = new Collection<>(ints);

        Iterator<Integer> itr = collection.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        for (Integer i : collection) {
            System.out.println(i);
        }
    }
}