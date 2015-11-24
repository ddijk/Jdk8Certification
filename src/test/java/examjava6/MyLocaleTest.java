/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examjava6;

import java.text.DecimalFormatSymbols;
import java.util.Locale;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author DickD
 */
public class MyLocaleTest {

    @Test
    public void testMain() {
        Locale loc = Locale.CANADA_FRENCH;

        System.out.println("loc=" + loc);

        Locale loc2 = new Locale("fr", "CA");

        Assert.assertEquals(loc2, loc);
    }

    @Test
    public void testSeparator() {

        DecimalFormatSymbols dfs = new DecimalFormatSymbols(Locale.ENGLISH);
        Assert.assertEquals('.', dfs.getDecimalSeparator());
        Assert.assertEquals(',', dfs.getGroupingSeparator());

        DecimalFormatSymbols dfs2 = new DecimalFormatSymbols(Locale.GERMAN);
        Assert.assertEquals(',', dfs2.getDecimalSeparator());
        Assert.assertEquals('.', dfs2.getGroupingSeparator());
    }
}
