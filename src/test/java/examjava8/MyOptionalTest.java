/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examjava8;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author dick
 */
public class MyOptionalTest {

    @Test
    public void test() {

        Assert.assertEquals(0, MyOptional.getProp("a").intValue());
        Assert.assertEquals(6, MyOptional.getProp("6").intValue());
        Assert.assertEquals(0, MyOptional.getProp("-4").intValue());
        Assert.assertEquals(0, MyOptional.getProp(null).intValue());
    }

}
