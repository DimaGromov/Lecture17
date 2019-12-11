/*
        Найти все общие элементы в коллекциях.
 */

import java.util.*;

public class Start {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 1, 2, 3, 4));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(7, 8, 2, 9, 4, 2, 10, 4));

        System.out.println(union(list1, list2));
    }

    static List<Integer> union(List<Integer> list1, List<Integer> list2) {
        Collection<Integer> unionSet = new TreeSet<>();
        for (int i = 0; i < list1.size(); i++) {
            for (int j = 0; j < list2.size(); j++) {
                if(list1.get(i) == list2.get(j)){
                    unionSet.add(list1.get(i));
                }
            }
        }
        List<Integer> list = new ArrayList<>(unionSet);
        return list;
    }

}
