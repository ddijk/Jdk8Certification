/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examjava8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author dick
 */
public class SumTest {

    @Test
    public void testSum() {
        IntStream is = IntStream.range(0, 4);

        Assert.assertEquals(6, is.sum());
    }

    @Test
    public void testSum2() {
        List<String> ls = Arrays.asList("1", "2", "4");
        int n = ls.stream().mapToInt(i -> Integer.parseInt(i)).sum();
        Assert.assertEquals(7, n);
    }
}