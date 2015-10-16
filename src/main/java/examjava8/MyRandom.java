package examjava8;

import java.util.Random;

public class MyRandom {

    public static void main(String[] args) {
        Random random = new Random();
        random.ints(0, 10).limit(10).forEach(System.out::println);
    }

}
