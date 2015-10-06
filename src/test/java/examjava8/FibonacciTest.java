package examjava8;

import java.util.Arrays;
import java.util.List;
import static java.util.stream.Collectors.toList;
import java.util.stream.IntStream;
import org.junit.Assert;
import org.junit.Test;

public class FibonacciTest {

    @Test
    public void testFibo() {
        List<Integer> expected = Arrays.asList(2, 4, 6, 8);
        List<Integer> actual = IntStream.iterate(0, n -> n + 2).limit(4).boxed().collect(toList());//forEach(System.out::println);

        Assert.assertEquals(expected, actual);
    }
}
