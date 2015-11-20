package examjava8;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.IntStream;

public class Zip {

    public static void main(String[] args) {
        List<String> listA = Arrays.asList("aap", "noot", "mies");
        List<String> listB = Arrays.asList("nl", "be", "fr");

        IntStream.range(0, listA.size()).mapToObj(i -> listA.get(i) + listB.get(i)).forEach(System.out::println);

        List<Date> dates = Arrays.asList(new Date(), new Date());

        List<Double> values = Arrays.asList(3.3, 5.5);

    }
}

class Chart {

}
