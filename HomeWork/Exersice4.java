package module10.HomeWork;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exersice4 {

    private long a;
    private long c;
    private long m;
    private long seed;
    private int limit;

    public Exersice4(long a, long c, long m, long seed, int limit) {
        this.a = a;
        this.c = c;
        this.m = m;
        this.seed = seed;
        this.limit = limit;
    }

    public static Stream<Long> randomNumbersStream(long a, long c, long m, long seed) {
        boolean calculate = isCalculate(a, c, m, seed);
        if (calculate) {
            Stream<Long> iterate = Stream.iterate(seed, x -> ((a * x + c) % m));
            return iterate;
        } else
        throw new IllegalArgumentException("Wrong args!!!");
    }

    private static boolean isCalculate(long a, long c, long m, long seed) {
        boolean calculate = false;
        if (a >= 0 && a < m) {
            calculate = true;
        }
        if (c >= 0 && c < m) {
            calculate = true;
        }
        if (seed >= 0 && seed < m) {
            calculate = true;
        }
        return calculate;
    }


    public static void main(String[] args) {
        System.out.println(randomNumbersStream(25214903917l, 12, (long) Math.pow(2, 48), 10)
                .limit(10)
                .collect(Collectors.toList()));
    }
}
