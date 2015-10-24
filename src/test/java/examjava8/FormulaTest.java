/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examjava8;

import java.util.function.DoubleUnaryOperator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author dick
 */
public class FormulaTest {
    
    public FormulaTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testSqrt() {
    }

    @Test
    public void testCalculate() {
        
      Formula form  = (f) -> f;
      //  DoubleUnaryOperator form = f->f;
        
        MyClass mc = new MyClass(2.2);
        
     //   Assert.assertEquals(3.2 , mc.doIt(f->f),0.1);
           Assert.assertEquals(3.2 , mc.doIt(form),0.1);
    }

    public class FormulaImpl implements Formula {

        public double calculate(double d) {
            return 0.0;
        }
    }
    
}

class MyClass {
    
    double a;

    public MyClass(double a) {
        this.a = a;
    }
    
    
    
    
    double doIt(Formula duo) {
        return duo.calculate(a)+1.0;
    }
}
