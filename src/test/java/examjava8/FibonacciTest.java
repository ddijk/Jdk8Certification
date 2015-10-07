package examjava8;

import java.util.Arrays;
import java.util.List;
import static java.util.stream.Collectors.toList;
import java.util.stream.IntStream;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class FibonacciTest {


    @Test
    public void testFibo() {
        List<Integer> expected = Arrays.asList(0, 2, 4, 6, 8);
        List<Integer> actual = IntStream.iterate(0, n -> n + 2).limit(5).boxed().collect(toList());//forEach(System.out::println);

        Assert.assertEquals(expected, actual);
    }


    /**
     * Test of solveRecursive method, of class Fibonacci.
     */
    @Test
    public void testSolve2() {
        System.out.println("solve");
        int n = 2;
     
        Fibonacci instance = new Fibonacci();
        int[] expResult = new int[]{0,1};
        int[] result = instance.solveRecursive(n, Fibonacci.start);
        assertArrayEquals(expResult, result);
        assertArrayEquals(expResult, instance.solveWithStreams(n));
        
    }
    
     @Test
    public void testSolve3() {
        System.out.println("solve");
        int n = 3;
    
        Fibonacci instance = new Fibonacci();
        int[] expResult = new int[]{0,1,1};
        int[] result = instance.solveRecursive(n, Fibonacci.start);
        assertArrayEquals(expResult, result);
        assertArrayEquals(expResult, instance.solveWithStreams(n));
        
    }
    
      @Test
    public void testSolve8() {
        System.out.println("solve");
        int n = 8;
      
        Fibonacci instance = new Fibonacci();
        int[] expResult = new int[]{0,1,1,2,3,5,8,13};
        int[] result = instance.solveRecursive(n, Fibonacci.start);
        assertArrayEquals(expResult, result);
          assertArrayEquals(expResult, instance.solveWithStreams(n));
    }
    
    @Test
    public void testReduce() {
         Fibonacci instance = new Fibonacci();
        final List<Integer> result = instance.solveReduce(6);
        System.out.println("result:"+  result);
         List<Integer> expResult = Arrays.asList(0,1,1,2,3,5,8,13);
       assertEquals(expResult, result);
    }
}
