/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examjava8.warburton;

import com.insightfullogic.java8.examples.chapter1.Artist;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author dickdijk
 */
public class Warburton {

    int addUp(Stream<Integer> numbers) {
        return numbers.collect(Collectors.summingInt(i -> (i)));
    }

    List<String> mapArtists(Stream<Artist> artists) {
        return artists.map(a -> a.getName() + ", " + a.getNationality()).collect(Collectors.toList());
    }

}
