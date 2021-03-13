package module10.HomeWork;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise2 {
//    Метод принимает на вход список из строк (можно список из Задания 1).
//    Возвращает список этих строк в верхнем регистре и отсортированные по убыванию (от Z до А).
    static List<String> names = Arrays.asList("Maksym", "Vlad", "Olia", "Yaroslav", "Sasha", "Plumba"
        , "Nikolay", "Evgeniy", "Umnik", "Ira");
    static List<String> sortedElementsZtoA(List<String> names) {
        List<String> result = names.stream()
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        return result;
    }

    public static void main(String[] args) {
        System.out.println(sortedElementsZtoA(names));
    }
}
