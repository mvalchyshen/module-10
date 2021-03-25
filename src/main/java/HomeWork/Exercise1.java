package module10.HomeWork;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise1 {
//    Метод принимает на вход список имен. Вернуть строку в виде: "1. Ivan, 3. Peter ...", с именами из списка,
//    стоящими под нечетным индексом (1, 3 и т.д.).
    static List<String> names = Arrays.asList("Maksym", "Vlad", "Olia", "Yaroslav", "Sasha", "Plumba"
        , "Nikolay", "Evgeniy", "Umnik", "Ira");
    public String oddIndexNames(List<String> names) {
        String collect = (String) names.stream()
                .filter(name -> names.indexOf(name) % 2 != 0)
                .map(name ->names.indexOf(name)+". "+ name)
                .collect(Collectors.joining(", ","","."));
        return collect;
    }

    public static void main(String[] args) {
        Exercise1 exercise1 = new Exercise1();
        System.out.println(exercise1.oddIndexNames(names));
    }
}


