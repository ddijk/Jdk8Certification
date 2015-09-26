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
public class LambdaInstanceMethod {

    public static void main(String[] args) {
        Runnable r1 = () -> {
            System.out.print("hi dick");
        };
        Thread t1 = new Thread(() -> {
            System.out.print("hi dick");
        });
        t1.start();

        Person p1 = new Person();
        Thread t2 = new Thread(p1::print);
        t2.start();

    }
}
