/*
        Получить объединение двух колекций.
 */

import java.util.*;

public class Start {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12));

        Set<Integer> set = new HashSet<>();
        set.addAll(list1);
        set.addAll(list2);

        System.out.println(list1);
        System.out.println(list2);
        System.out.println(set);
    }
}
