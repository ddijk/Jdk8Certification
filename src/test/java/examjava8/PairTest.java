/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examjava8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static java.util.stream.Collectors.toList;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author dick
 */
public class PairTest {

    @Test
    public void test() {
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(3, 4);

        List<Integer[]> expected = Arrays.asList(new Integer[]{1, 3}, new Integer[]{1, 4},new Integer[]{2, 3}, new Integer[]{2, 4},new Integer[]{3, 3}, new Integer[]{3, 4});

        List<Integer[]> actual = Pair.pair(list1, list2).collect(toList());

        Assert.assertEquals("size komt niet overeen",actual.size(), expected.size());
        int n = actual.size();
        for (int i = 0; i < n; i++) {
            Assert.assertArrayEquals(expected.get(i), actual.get(i));
        }

    }
    
    @Test
    public void testPairsWhoseSumIsDividableBy3() {
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(3, 4);

        List<Integer[]> expected = Arrays.asList( new Integer[]{2, 4},new Integer[]{3, 3});

    //    List<Integer[]> actual = Pair.pair(list1, list2).filter(i->Arrays.stream(i).mapToInt(j->j).sum()%3==0).collect(toList());
       List<Integer[]> actual = Pair.pair(list1, list2).collect(toList());
         Assert.assertEquals("size komt niet overeen",actual.size(), expected.size());
        int n = actual.size();
        for (int i = 0; i < n; i++) {
            Assert.assertArrayEquals(expected.get(i), actual.get(i));
        }
    }

    @Test
    public void test2() {
        Integer[] ia = new Integer[]{1, 3};
        Integer[] ia2 = new Integer[]{1, 3};

        Assert.assertArrayEquals(ia, ia2);

    }

    @Test
    public void test3() {
        Integer[] ia = new Integer[]{1, 3};
        Integer[] ia2 = new Integer[]{1, 3};

        List<Integer[]> list1 = new ArrayList();
        list1.add(ia);

        List<Integer[]> list2 = new ArrayList();
        list2.add(ia2);

        Assert.assertEquals(list1.size(), list2.size());
        int n = list1.size();
        for (int i = 0; i < n; i++) {
            Assert.assertArrayEquals(list1.get(i), list2.get(i));
        }

    }

}
