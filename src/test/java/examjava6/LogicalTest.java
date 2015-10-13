/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examjava6;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author DickD
 */
public class LogicalTest {

    public LogicalTest() {
    }

    @Test
    public void testMain() {

        boolean a = false;
        a |= 1 == 1;
        Assert.assertTrue(a);
    }

    @Test
    public void testMain2() {

        boolean a = true;
        a |= boolMethod();  // not short-circuit!
        // a = a || boolMethod();
        Assert.assertTrue(a);
    }

    private boolean boolMethod() {
        throw new RuntimeException("dummy throw");
    }
}
