/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examjava8;
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
        return artists.map(a -> a.getNaam()+ ", " + a.getPlaceOfOrigin()).collect(Collectors.toList());
    }

}
