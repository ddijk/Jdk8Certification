/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examjava8;

/**
 *
 * @author dickdijk
 */
public class Assoc {

    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        int z = x++;
        int a = --y;
        int b = z--;
        b += ++z;
        int answ = x > a ? y > b ? y : b : x > z ? x : z;
        //   int answ = x > a ? (y > b ? y : b) : (x > z ? x : z);
        System.out.println(answ);

        // y > b ? y : b : x > z ? x
        // System.out.println(x>a?b:x>y);
    }
}
