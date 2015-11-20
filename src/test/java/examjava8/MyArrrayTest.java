package examjava8;

import java.util.Arrays;
import java.util.List;
import static java.util.stream.Collectors.toList;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;
import org.junit.Assert;
import org.junit.Test;

public class MyArrrayTest {

    @Test
    public void test() {
        double[] da = new double[]{1.1, 3.3};

        List<Double> result = DoubleStream.of(da).mapToObj(i -> i * -1).collect(toList());

        Assert.assertEquals(Arrays.asList(-1.1d, -3.3d), result);
    }

    @Test
    public void test2() {
        double[] da = new double[]{1.1, 3.3};
        double[] result = DoubleStream.of(da).map(i -> i * -1).toArray();

        Assert.assertArrayEquals(new double[]{-1.1, -3.3}, result, 0.0);
    }

    @Test
    public void testString() {
        String[] sa = new String[]{"aap", "noot", "mies"};

        String[] expected = new String[]{"AAP", "NOOT", "MIES"};

        Assert.assertArrayEquals(expected, Stream.of(sa).map(i -> i.toUpperCase()).toArray());

    }
}
