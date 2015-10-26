/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examjava7;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author dickdijk
 */
public class RadixTest {

    @Test
    public void testHex() {
        int a = 0xF;
        Assert.assertEquals(16, (a + 1));
    }

    @Test
    public void testBinary() {
        int a = 0b101;
        Assert.assertEquals(5, a);
    }

    @Test
    public void testSwitch() {
        Assert.assertEquals("nul", calc(0));
        Assert.assertEquals("nul", calc(0b0));
        Assert.assertEquals("nul", calc(0x0));
        Assert.assertEquals("een", calc(1));
        Assert.assertEquals("een", calc(0b1));
        Assert.assertEquals("twee", calc(2));
        Assert.assertEquals("twee", calc(0b10));
        Assert.assertEquals("twee", calc(0x2));
        Assert.assertEquals("zeven", calc(7));
        Assert.assertEquals("zeven", calc(0b111));
        Assert.assertEquals("zeven", calc(0x7));

    }

    private String calc(int input) {
        switch (input) {
            case 0:
                return "nul";
            case 1:
                return "een";
            case 2:
                return "twee";
            case 7:
                return "zeven";
            default:
                return "tien";

        }
    }
}
