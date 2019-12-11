/*
        Вернуть элемент, который встречается в списке один раз.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Start {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 1, 2, 3, 4, 5, 6, 5, 6, 7, 8, 10, 10, 11));
        List<Integer> list_new = unik(list);
        System.out.println(list_new);

    }

    // Метод, который возвращает ArrayList с уникальными значениями. В методе используется сортировка.
    static List<Integer> unik(List<Integer> list){
        // Создадим ArrayList для записи туда уникальных элементов.
        List<Integer> unik_list = new ArrayList<>();

        // Выполним сотировку исходного массива.
        Collections.sort(list);

        // Переменная флажок, сигнализирующая о том, что элемент встречался раньше.
        boolean flag = false;

        /*
                Обозначим логические условия:
                    ( list.get(i) != list.get(i+1) ) = A;
                    ( flag == false ) = B.
                При работе с отсортированным списком возможны три следующие варианта:
                    1: ( A = 1 )  и ( B = 1 ) ====> i-тый элемент не равен (i+1)-му, и i-тый элемент не встречался раньше;
                    2: ( A = 0 )  и ( B = 1 ) ====> i-тый элемент равен (i+1)-му, и i-тый элемент не встречался раньше;
                    3: ( A = 1 )  и ( B = 0 ) ====> i-тый элемент не равен (i+1)-му, и i-тый элемент встречался раньше;
                    4: ( A = 0 )  и ( B = 0 ) ====> i-тый элемент равен (i+1)-му, и i-тый элемент встречался раньше.
                Что необходимо сделать при каждом из вариантов:
                    1: Записываем элементв в list;
                    2: flag = true;
                    3: flag = false;
                    4: не делаем ничего.
         */
        boolean A, B;

        // Так как мы итерируемся по элементам листа, и нам необходимо сравнивать пары значений, это приводит к тому что
        // возникает исключение выхода за границы листа. Это значит что мы обратились к последнему элементу и сравнивать
        // его больше не с чем. Поместим основной цикл в блок try, и на выходе выдем ловить исключение выхода за границы
        // листа. В блоке catch проверим flagб и если он равен false, добавим последний элемент unik_list.
        try{
            // Цикл, итерирующийся по элементам массива.
            for (int i = 0; i < list.size(); i++) {
                A = list.get(i) != list.get(i + 1);
                B = flag;

                if (A & (!B)) {
                    unik_list.add(list.get(i));
                } else if ((!A) & B) {
                    flag = true;
                } else if (A & B) {
                    flag = false;
                } else if ((!A) & (!B)){
                    flag = true;
                }
            }
        } catch (IndexOutOfBoundsException ex){
            if (flag == false){
                unik_list.add(list.get(list.size()-1));
            }
        }


        return unik_list;
    }

}
