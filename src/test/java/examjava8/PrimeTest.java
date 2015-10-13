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
 * @author DickD
 */
public class PrimeTest {

    public PrimeTest() {
    }

    @Test
    public void testPrime() {

        Assert.assertTrue(Prime.isPrime(1));
        Assert.assertTrue(Prime.isPrime(2));
        Assert.assertTrue(Prime.isPrime(3));
        Assert.assertFalse(Prime.isPrime(4));
        Assert.assertTrue(Prime.isPrime(5));
        Assert.assertFalse(Prime.isPrime(6));
        Assert.assertTrue(Prime.isPrime(7));
        Assert.assertFalse(Prime.isPrime(8));
        Assert.assertFalse(Prime.isPrime(9));
        Assert.assertFalse(Prime.isPrime(10));
    }

    @Test
    public void testPrime2() {

     //   Assert.assertTrue(Prime.isPrime2(1));
        //   Assert.assertTrue(Prime.isPrime2(2));
        Assert.assertTrue(Prime.isPrime2(3));
        Assert.assertFalse(Prime.isPrime2(4));
        Assert.assertTrue(Prime.isPrime2(5));
        Assert.assertFalse(Prime.isPrime2(6));
        Assert.assertTrue(Prime.isPrime2(7));
        Assert.assertFalse(Prime.isPrime2(8));
        Assert.assertFalse(Prime.isPrime2(9));
        Assert.assertFalse(Prime.isPrime2(10));
    }

}
