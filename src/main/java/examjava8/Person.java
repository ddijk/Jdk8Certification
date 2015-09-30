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
public class Person implements IPerson {
    
    String naam;
    int age;

    public Person(String naam, int age) {
        this.naam = naam;
        this.age = age;
    }

    public String getNaam() {
        return naam;
    }

    public int getAge() {
        return age;
    }
    
    

    @Override
    public void print() {
        System.out.println("person printed");
    }

    @Override
    public String toString() {
       return "naam="+naam+", age="+age;
    }

    
}
