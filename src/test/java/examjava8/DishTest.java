/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examjava8;

import java.util.Arrays;
import java.util.List;
import java.util.function.ToIntFunction;
import static java.util.stream.Collectors.toList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dickdijk
 */
public class DishTest {

    /**
     * Test of getName method, of class Dish.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");

        List<Dish> dishes = Arrays.asList(new Dish("macaronie", DishType.FISH, 33));

        dishes.stream().forEach(d -> d.setCalories(10));

        int actual = dishes.stream().collect(toList()).get(0).getCalories();

        ToIntFunction<Dish> tif = Dish::getCalories;

        assertEquals(3, actual);

    }

}
