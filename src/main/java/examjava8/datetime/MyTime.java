/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examjava8.datetime;

import java.time.Duration;
import java.time.Period;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author dick
 */
public class MyTime {

    public static void main(String[] args) {

        Period p = Period.of(1, 2, 3);
        System.out.println("p=" + p.negated());

        //   Duration d = Duration.ofDays(1);//.ofHours(5);
        Duration d = Duration.ofMinutes(23);

        System.out.println("d=" + d.negated());

    }

}
