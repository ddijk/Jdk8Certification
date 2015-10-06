/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examjava8;

import java.util.List;
import static java.util.stream.Collectors.toList;
import java.util.stream.Stream;

/**
 *
 * @author dick
 */
public class Pair {
    
    public static Stream<Integer[]> pair(List<Integer> left, List<Integer> right) {
        
        return left.stream().flatMap(i->createArray(i,right));
    }

    private static Stream<Integer[]> createArray(Integer i, List<Integer> right) {
       return  right.stream().filter(j->(j+i)%3==0).map(j-> new Integer[] {i,j} );
    }
    
}
