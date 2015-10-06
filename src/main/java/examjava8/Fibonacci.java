/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examjava8;

import java.util.Arrays;

/**
 *
 * @author dick
 */
public class Fibonacci {
    
    static final int[] start = new int[]{0,1};
    
    
    public static void main(String[] args) {
        Fibonacci fibo = new Fibonacci();
       Arrays.stream( fibo.solve(15, start)).forEach(System.out::println);
    }
    
    int[] solve(int n, int[] tussenResultaat) {
        int len = tussenResultaat.length;
        if ( len >= n ) {
            return tussenResultaat;
        } else {
            int[] next = Arrays.copyOfRange(tussenResultaat, 0, len+1);
            
            next[len]=next[len-1]+next[len-2];
            return solve(n, next);
        }
    }
}
