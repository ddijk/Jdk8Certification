/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examjava8;

import java.util.List;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.toList;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 *
 * @author dickdijk
 */
public class MyIntStream {

    public static void main(String[] args) {
        IntStream myStream = IntStream.rangeClosed(1, 3).flatMap(i -> IntStream.iterate(i, j -> j).limit(i));
        Stream<Character> characterStream = myStream.mapToObj(k -> (char) (k + 96));

        // characterStream.forEach(System.out::print);
        String result = characterStream.map(m -> m.toString()).collect(Collectors.joining(","));
        System.out.println("result=" + result);
    }

    public List<Integer> generate1() {

        return IntStream.rangeClosed(1, 3).flatMap(i -> IntStream.iterate(i, j -> j + 5).limit(3)).boxed().collect(toList());
        // Collectors.s
    }
}
