package examjava6;

import java.util.Locale;

public class MyLocale {

    public static void main(String[] args) {
        Locale loc = Locale.CANADA_FRENCH;

        System.out.println("loc=" + loc);

        Locale loc2 = new Locale("fr", "CA");
    }
}
