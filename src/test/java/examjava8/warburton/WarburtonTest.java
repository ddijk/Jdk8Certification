/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examjava8.warburton;

import com.insightfullogic.java8.examples.chapter1.Album;
import com.insightfullogic.java8.examples.chapter1.Artist;
import com.insightfullogic.java8.examples.chapter1.SampleData;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.toList;
import java.util.stream.Stream;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

/**
 *
 * @author dickdijk
 */
public class WarburtonTest {

    static List<Album> input;

    @BeforeClass
    public static void init() {
        input = SampleData.albums2.collect(toList());
    }

    /**
     * Test of addUp method, of class Warburton.
     */
    @Test
    public void testAddUp() {
        System.out.println("addUp");
        Stream<Integer> numbers = Stream.of(1, 2, 3);
        Warburton instance = new Warburton();
        int expResult = 6;
        int result = instance.addUp(numbers);
        assertEquals(expResult, result);

    }

    @Test
    public void testAddUp2() {
        System.out.println("addUp");
        Stream<Integer> numbers = Stream.of(1, 2, 3, 4, 5);
        Warburton instance = new Warburton();
        int expResult = 15;
        int result = instance.addUp(numbers);
        assertEquals(expResult, result);

    }

    @Test
    public void testMapArtists() {

        Stream<Artist> artists = SampleData.threeArtists();
        Warburton instance = new Warburton();
        List<String> expectedResult = Arrays.asList("John Coltrane, US", "John Lennon, UK", "The Beatles, UK");

        assertEquals(expectedResult, instance.mapArtists(artists));

    }

    @Test
    public void testFilterAlbumsWithAtMostOneTrack() {

        List<String> albums = input.stream().filter(i -> i.getTrackList().size() <= 1).map(i -> i.getName()).collect(toList());

        List<String> expectedResult = Arrays.asList("sample Short Album");

        assertEquals(expectedResult, albums);
    }

    @Test
    public void testFilterAlbumsWithAtMostTwoTracks() {

        List<String> albums = input.stream().filter(i -> i.getTrackList().size() <= 2).map(i -> i.getName()).collect(toList());

        List<String> expectedResult = Arrays.asList("sample Short Album", "A Love Supreme");
        expectedResult.sort((i, j) -> i.compareTo(j));
        albums.sort((i, j) -> i.compareTo(j));

        assertEquals(expectedResult, albums);

    }

    @Test
    public void testFilterAlbumsWithAtMostThreeTracks() {

        List<String> albums = input.stream().filter(i -> i.getTrackList().size() <= 3).map(i -> i.getName()).collect(toList());

        List<String> expectedResult = Arrays.asList("sample Short Album", "A Love Supreme");
        expectedResult.sort((i, j) -> i.compareTo(j));
        albums.sort((i, j) -> i.compareTo(j));

        assertEquals(expectedResult, albums);

    }

    @Test
    public void testCountAllMembersOfArtists() {
        List<Artist> artists = SampleData.getFourArtists();

        assertEquals(7L, artists.stream().map(i -> i.getMembers().count()).collect(Collectors.summingLong(i -> i)).longValue());
    }
}
