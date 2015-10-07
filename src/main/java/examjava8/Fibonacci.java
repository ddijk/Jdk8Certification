/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examjava8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 *
 * @author dick
 */
public class Fibonacci {

    static final int[] start = new int[]{0, 1};

    public static void main(String[] args) {
        Fibonacci fibo = new Fibonacci();
        Arrays.stream(fibo.solveRecursive(15, start)).forEach(System.out::println);
        System.out.println("***");
        Arrays.stream(fibo.solveWithStreams(8)).forEach(System.out::println);
    }

    int[] solveRecursive(int n, int[] tussenResultaat) {
        int len = tussenResultaat.length;
        if (len >= n) {
            return tussenResultaat;
        } else {
            int[] next = Arrays.copyOfRange(tussenResultaat, 0, len + 1);

            next[len] = next[len - 1] + next[len - 2];
            return solveRecursive(n, next);
        }
    }

    int[] solveWithStreams(int n) {
        return Stream.iterate(new int[]{0, 1}, i -> new int[]{i[1], i[0] + i[1]}).limit(n).mapToInt(j -> j[0]).toArray();
    }
    
    List<Integer> solveReduce(int num) {
        //int result  = Stream.of(1,3,4).reduce(100, (acc, i)-> acc+i).intValue();n
        List<Integer> initial = new ArrayList<>();
        initial.add(0);
        initial.add(1);
      //return Stream.iterate(0, i->i+1).limit(num).reduce(initial, (acc, i)->{int n =acc.get(acc.size()-1)+acc.get(acc.size()-2);acc.add(n); return acc;}, (i,j)-> { i.addAll(j); return i;});
        //return Stream.iterate(0,i->i).limit(num).reduce(initial, (acc, i)->{int n =acc.get(acc.size()-1)+acc.get(acc.size()-2);acc.add(n); return acc;}, (i,j)-> { i.addAll(j); return i;});
        return IntStream.range(0, num).mapToObj(i->i).reduce(initial, (acc, i)->{int n =acc.get(acc.size()-1)+acc.get(acc.size()-2);acc.add(n); return acc;}, (i,j)-> { i.addAll(j); return i;});
    //  return result.stream().mapToInt(i->i).sum();
    }
    
    
}
