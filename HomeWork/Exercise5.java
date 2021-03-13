package module10.HomeWork;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.asList;

public class Exercise5 {
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        List<T> concat = Stream.concat(first, second)
                .collect(Collectors.toList());
        Collections.shuffle(concat);
        return concat.stream();
    }
    public static void main(String[] args) {
        List<String> list = asList("A", "B", "C", "D");
        List<String> list1 = asList("E", "F", "H", "M");

        List<String> collect = zip(list.stream(), list1.stream()).collect(Collectors.toList());
        System.out.println(collect);
    }
}
