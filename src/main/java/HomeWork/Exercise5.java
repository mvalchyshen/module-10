package src.main.java.HomeWork;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.asList;

public class Exercise5 {
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        Iterator<T> firstStream = first.iterator();
        Iterator<T> secondStream = second.iterator();
        Stream<T> concat = Stream.empty();
        while (firstStream.hasNext() || secondStream.hasNext()) {
            concat = Stream.concat(concat,Stream.of(firstStream.next(), secondStream.next()));
        }
        return concat.collect(Collectors.collectingAndThen(Collectors.toList(), list -> {
           Collections.shuffle(list);
           return list.stream();
        }));
    }
    public static void main(String[] args) {
        List<String> list = asList("A", "B", "C", "D");
        List<String> list1 = asList("E", "F", "H", "M");

        List<String> collect = zip(list.stream(), list1.stream()).collect(Collectors.toList());
        System.out.println(collect);
    }
}
