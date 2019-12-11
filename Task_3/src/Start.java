/*
        Проверить равенство двух колекций.
 */

import java.util.*;

public class Start {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 8, 6, 7, 5, 9));
        List<Integer> list3 = new ArrayList<>(Arrays.asList(1, 2, 5, 4, 3, 6, 7, 8, 9));
        List<Integer> list4 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 7));

        // Если необходимо сравнить колекции и порядок элементов, можно воспользоваться методом equals().
        //System.out.println( list1.equals(list2) + " " + list2.equals(list3) + " " + list3.equals(list4) );

        // Если необходимо проверить колекции на содержимое без учёта порядка.
        System.out.println(sr(list3, list2));


    }

    static boolean sr(List<Integer> list1, List<Integer> list2){
        if(list1.size() != list2.size()) {
            return false;
        }
        Collections.sort(list1);
        Collections.sort(list2);
        for (int i = 0; i <list1.size() ; i++) {
            if(list1.get(i) != list2.get(i)){
                return false;
            }
        }
        return true;
    }
}
