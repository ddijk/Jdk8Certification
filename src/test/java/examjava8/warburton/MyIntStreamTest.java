/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examjava8.warburton;

import examjava8.MyIntStream;
import java.util.Arrays;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

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

}
