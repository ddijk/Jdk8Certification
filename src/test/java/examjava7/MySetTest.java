/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examjava7;

import java.util.HashSet;
import java.util.Set;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author dickdijk
 */
public class MySetTest {

    @Test
    public void testAdd() {

        Set<Integer> mySet = new HashSet<>();

        Assert.assertTrue(mySet.add(5));
        Assert.assertFalse("5 already in set", mySet.add(5));
    }
}
