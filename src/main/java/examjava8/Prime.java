package examjava8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Prime {

    static List<Integer> primesBelow10 = Arrays.asList(1, 2, 3, 5, 7);

    static boolean isPrime(int n) {

        return IntStream.range(2, n).noneMatch(i -> n % i == 0);

    }

    static boolean isPrime2(int n) {

        return primesBelow10.stream().filter(i -> i > 1 && i < n).noneMatch(i -> n % i == 0);

    }

}
