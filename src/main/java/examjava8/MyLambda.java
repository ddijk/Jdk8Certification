/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examjava8;

import java.util.function.DoubleSupplier;
import java.util.function.Supplier;

/**
 *
 * @author dickdijk
 */
public class MyLambda {

    String name;
    Double age;

    public MyLambda(String name, Double age) {
        this.name = name;
        this.age = age;
    }

    public Double getAge() {
        return age;
    }

    public void setAge(Double age) {
        this.age = age;
    }

    public static void main(String[] args) {

        MyLambda m = new MyLambda("dick", null);

        // Supplier<Double> mysup = m::getAge;
        DoubleSupplier mysup = m::getAge;

        System.out.println("age is " + mysup.getAsDouble());

    }

}
