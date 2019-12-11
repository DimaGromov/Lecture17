/*
        Найти все элементы, которые есть в одной колекции, но их нет в другой.
 */

import java.lang.reflect.Array;
import java.util.*;

public class Start {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 99, 4, 5, 77));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));

       // un(list1, list2);
       System.out.println(un(list1, list2));

    }

    static List<Integer> un(List<Integer> list1, List<Integer> list2){
        //Отсортируем листы.
        Collections.sort(list1);
        Collections.sort(list2);

        Set<Integer> treeSet1 = new TreeSet<>(list1);
        Set<Integer> treeSet2 = new TreeSet<>(list2);

        List<Integer> list = new ArrayList<>();

        boolean unic;
        for (int i = 0; i < treeSet1.size(); i++) {
            unic = true;
            for (int j = 0; j < treeSet2.size(); j++) {
                if(treeSet1.toArray()[i] == treeSet2.toArray()[j]){
                    unic = false;
                }
            }
            if (unic == true){
                list.add((Integer) treeSet1.toArray()[i]);
            }
        }
        return list;
    }


}
