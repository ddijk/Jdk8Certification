/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examjava8.datetime;

import java.time.DayOfWeek;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

/**
 *
 * @author dick
 */
public class NextWorkingDay implements TemporalAdjuster {

    @Override
    public Temporal adjustInto(Temporal temporal) {

        if (temporal.get(ChronoField.DAY_OF_WEEK) == DayOfWeek.SATURDAY.getValue()) {
            return temporal.plus(2, ChronoUnit.DAYS);
        }

        if (temporal.get(ChronoField.DAY_OF_WEEK) == DayOfWeek.FRIDAY.getValue()) {
            return temporal.plus(3, ChronoUnit.DAYS);
        }

        return temporal.plus(1, ChronoUnit.DAYS);
    }

}
