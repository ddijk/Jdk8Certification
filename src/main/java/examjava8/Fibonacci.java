/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examjava8;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 *
 * @author dick
 */
public class Fibonacci {

    static final int[] start = new int[]{0, 1};

    public static void main(String[] args) {
        Fibonacci fibo = new Fibonacci();
        Arrays.stream(fibo.solve(15, start)).forEach(System.out::println);
        System.out.println("***");
        Arrays.stream(fibo.solve2(8)).forEach(System.out::println);
    }

    int[] solve(int n, int[] tussenResultaat) {
        int len = tussenResultaat.length;
        if (len >= n) {
            return tussenResultaat;
        } else {
            int[] next = Arrays.copyOfRange(tussenResultaat, 0, len + 1);

            next[len] = next[len - 1] + next[len - 2];
            return solve(n, next);
        }
    }

    int[] solve2(int n) {
        return Stream.iterate(new int[]{0, 1}, i -> new int[]{i[1], i[0] + i[1]}).limit(n).mapToInt(j -> j[0]).toArray();
    }
}
