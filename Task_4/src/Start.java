/*
        Проверить наличие хотя бы одного общего элемента у коллекций.
 */


import java.util.*;

public class Start {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(4, 5, 6));
        List<Integer> list3 = new ArrayList<>(Arrays.asList(7, 8, 1));

        System.out.println(union(list1, list2));
        System.out.println(union(list1, list3));

    }

    static boolean union(List<Integer> coll1, List<Integer> coll2){
        for (int i = 0; i <coll1.size() ; i++) {
            for (int j = 0; j <coll2.size() ; j++) {
                if(coll1.get(i) == coll2.get(j)){
                    return true;
                }
            }
        }
        return false;
    }
}
