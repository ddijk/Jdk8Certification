/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examjava8.datetime;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author dick
 */
public class MyTimeTest {

    public MyTimeTest() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testMain() {

        Period p1 = Period.of(1, 6, 5);

        Period p2 = Period.from(p1);

        Period p3 = p2.minusDays(5);

        Period p4 = Period.of(1, 6, 0);

        Assert.assertEquals(p3, p4);
    }

    @Test
    public void testPlus() {

        LocalTime t1 = LocalTime.now();

        Duration d1 = Duration.of(2, ChronoUnit.HOURS).plusMinutes(30);

        LocalTime t2 = t1.plus(d1);

        System.out.println(t2);
    }

    @Test
    public void testNegativeDuration() {
        Duration d1 = Duration.ofHours(1);

        Assert.assertFalse(d1.isNegative());
        Duration d2 = d1.minusMinutes(70);

        Assert.assertTrue(d2.isNegative());
    }

    @Test
    public void testNegativePeriod() {
        Period p1 = Period.ofDays(1);
        Assert.assertFalse(p1.isNegative());
        Assert.assertTrue(p1.minusDays(2).isNegative());

    }

    @Test
    public void testFirstTuesdayInNextMonth() {

        LocalDate expected = LocalDate.of(2015, 11, 3);

        LocalDate now = LocalDate.now();
        LocalDate actual = now.plusMonths(1).with(TemporalAdjusters.firstInMonth(DayOfWeek.TUESDAY));

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test3rdTuesdayInSeptember() {

        LocalDate expected = LocalDate.of(2015, 9, 15);

//        LocalDate now = LocalDate.now();
//        LocalDate actual = now.with(ChronoField.MONTH_OF_YEAR, 9).with(TemporalAdjusters.firstInMonth(DayOfWeek.TUESDAY)).plusWeeks(2);
        LocalDate actual = LocalDate.of(2015, Month.SEPTEMBER, 1).with(TemporalAdjusters.firstInMonth(DayOfWeek.TUESDAY)).plusWeeks(2);
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testDayOfWeekInMonth() {

        LocalDate expected = LocalDate.of(2015, 9, 15);
        //      LocalDate actual = LocalDate.now().with(ChronoField.MONTH_OF_YEAR, 9).with(TemporalAdjusters.dayOfWeekInMonth(3, DayOfWeek.TUESDAY));
        LocalDate actual = LocalDate.of(2015, Month.SEPTEMBER, 1).with(TemporalAdjusters.dayOfWeekInMonth(3, DayOfWeek.TUESDAY));
        Assert.assertEquals(expected, actual);
    }
}
