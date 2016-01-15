/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examjava8.warburton;

import examjava8.MyIntStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.DoubleStream;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author dickdijk
 */
public class MyIntStreamTest {

    /**
     * Test of generate1 method, of class MyIntStream.
     */
    @Test
    public void testGenerate1() {
        System.out.println("generate1");
        MyIntStream instance = new MyIntStream();
        List<Integer> expResult = Arrays.asList(1, 6, 11, 2, 7, 12, 3, 8, 13);
        List<Integer> result = instance.generate1();
        assertEquals(expResult, result);

    }

    @Test
    public void testStreamFromArray() {
        long n = DoubleStream.of(1.0, 1.2, 1.3).count();

        Double[] da = new Double[]{3.3, 3.4, 2.5};
        List<Double> doubleList = Arrays.asList(da);

        assertEquals(3.4, Collections.max(doubleList), 0.01d);
        //     Stream<Double> sd = Arrays.stream(da);
        assertEquals(3.4d, Arrays.asList(da).stream().max(Comparator.comparingDouble(i -> i.doubleValue())).get(), 0.01d);
        Comparator<Double> naturalOrder = Comparator.naturalOrder();
        Comparator<Double> reversedNaturalOrder = naturalOrder.reversed();
        assertEquals(2.5d, Arrays.asList(da).stream().max(reversedNaturalOrder).get(), 0.01d);
        assertEquals(3, Arrays.asList(da).stream().count());
    }

}
