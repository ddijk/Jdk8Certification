/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examjava8.datetime;

import java.time.LocalDate;
import java.time.Month;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author dick
 */
public class NextWorkingDayTest {

    public NextWorkingDayTest() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testAdjustInto() {

        LocalDate monday = LocalDate.of(2015, Month.OCTOBER, 5);

        LocalDate expected = LocalDate.of(2015, Month.OCTOBER, 6);

        Assert.assertEquals(expected, monday.with(new NextWorkingDay()));

    }

    @Test
    public void testAdjustInto2() {

        LocalDate monday = LocalDate.of(2015, Month.OCTOBER, 6);

        LocalDate expected = LocalDate.of(2015, Month.OCTOBER, 7);

        Assert.assertEquals(expected, monday.with(new NextWorkingDay()));

    }

    @Test
    public void testAdjustInto3() {

        LocalDate monday = LocalDate.of(2015, Month.OCTOBER, 7);

        LocalDate expected = LocalDate.of(2015, Month.OCTOBER, 8);

        Assert.assertEquals(expected, monday.with(new NextWorkingDay()));

    }

    @Test
    public void testAdjustInto4() {

        LocalDate monday = LocalDate.of(2015, Month.OCTOBER, 8);

        LocalDate expected = LocalDate.of(2015, Month.OCTOBER, 9);

        Assert.assertEquals(expected, monday.with(new NextWorkingDay()));

    }

    @Test
    public void testAdjustInto5() {

        LocalDate monday = LocalDate.of(2015, Month.OCTOBER, 9);

        LocalDate expected = LocalDate.of(2015, Month.OCTOBER, 12);

        Assert.assertEquals(expected, monday.with(new NextWorkingDay()));

    }

    @Test
    public void testAdjustInto6() {

        LocalDate monday = LocalDate.of(2015, Month.OCTOBER, 10);

        LocalDate expected = LocalDate.of(2015, Month.OCTOBER, 12);

        Assert.assertEquals(expected, monday.with(new NextWorkingDay()));

    }

    @Test
    public void testAdjustInto7() {

        LocalDate monday = LocalDate.of(2015, Month.OCTOBER, 11);

        LocalDate expected = LocalDate.of(2015, Month.OCTOBER, 12);

        Assert.assertEquals(expected, monday.with(new NextWorkingDay()));

    }

}
