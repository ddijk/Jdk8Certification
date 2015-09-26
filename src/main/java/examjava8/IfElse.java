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
public class IfElse {

    public static void main(String[] args) {
        int aNumber = Integer.parseInt(args[0]);
        if (aNumber >= 0) {
            if (aNumber == 0) {
                System.out.println("first string");
            } else {
                System.out.println("second string");
            }
        }

//        if (aNumber >= 0)
//              if (aNumber == 0)
//                  System.out.println("first string");
//        else System.out.println("second string");
//        System.out.println("third string");
        System.out.println("third string");
    }

}
