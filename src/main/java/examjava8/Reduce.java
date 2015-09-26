/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examjava8;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 *
 * @author dickdijk
 */
public class Reduce {

    public static void main(String[] args) {
        Stream<Integer> si = Arrays.asList(1, 3, 5).stream();

        Integer oi = si.reduce(75, (i, j) -> i + j);

        System.out.println("oi=" + oi);

        int val = IntStream.range(1, 10).reduce((i, j) -> i + j).getAsInt();
        System.out.println("val=" + val);

        List<Artist> artists = Arrays.asList(new Artist("Rush"), new Artist("Marillion"), new Artist("Julien Clerq"));

        // accumulator
        BiFunction<StringBuilder, Artist, StringBuilder> f1 = (sb, a) -> {
            if (sb.length() > 0) {
                sb.append(",");
            }
            sb.append(a.getNaam());
            return sb;
        };

        // combiner
        BinaryOperator<StringBuilder> bo1 = (i, j) -> {
            System.out.println("i=" + i);
            System.out.println("j=" + j);
            throw new RuntimeException("oops");
            //  i.append(j);
            //return new StringBuilder();
        };

        StringBuilder result = artists.stream().reduce(new StringBuilder(), f1, bo1);

        System.out.println("reduced artists:" + result);

    }
}

class Artist {

    private String naam;

    public Artist(String naam) {
        this.naam = naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getNaam() {
        return naam;
    }

}
