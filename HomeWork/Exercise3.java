package module10.HomeWork;

import java.util.*;
import java.util.stream.Collectors;


public class Exercise3 {
    public static void arrayToString(String[] elements) {
        String collect = Arrays.stream(elements)
                .flatMap(element -> Arrays.stream(element.split(", ")))
                .sorted()
                .collect(Collectors.joining(", "));
        System.out.println(collect);
    }
    public static void main(String[] args) {
        String[] el = {"1, 2, 0", "4, 5"};
//        Получить из массива все числа, вернуть в отсортированном виде,
//        разделенные запятой, то есть
//        "0, 1, 2, 4, 5
        arrayToString(el);


    }

}
