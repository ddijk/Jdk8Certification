/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examjava8;

import java.util.stream.Stream;

/**
 *
 * @author dick
 */
public class FibonacciTuple {

    public static void main(String[] args) {
        Stream.iterate(new int[]{0, 1}, n -> new int[]{ n[1],n[0]+n[1]})
                .limit(20)
                .forEach(t -> System.out.println("(" + t[0] + "," + t[1] + ")"));
    }

}
