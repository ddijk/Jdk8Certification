/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examjava6;

/**
 *
 * @author dickdijk
 */
public class StaticNestedClass {

    static String greeting = "hallo";

    static class Nested {

        public static void print() {
            System.out.println("hi " + greeting);
        }
    }

    public static void main(String[] args) {
      //  StaticNestedClass.Nested inst = new StaticNestedClass.Nested();
        // inst.print();

        StaticNestedClass.Nested.print();
    }
}
