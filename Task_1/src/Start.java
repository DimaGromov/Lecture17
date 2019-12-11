/*
        Найти количество вхождений объекта в List.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Start {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 10, 50, 40, 40));

        int num = 10;
        int counter = 0;

        for (Integer i: list) {
            if(i == num){ counter++; }
        }

        System.out.println("Количество вхождений числа " + num + " в List равно " + counter);
    }
}
