/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examjava7;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dickdijk
 */
public class InstanceInitializer {

    private static final List<String> names = new ArrayList<>();

    {
        {
            // instance initializer
            names.add("dick");
        }
    }

    ;

    public static void main(String[] args) {
        // InstanceInitializer inst = new InstanceInitializer();
        //System.out.println("hier komt ie:" + inst.names);
        System.out.println("hier komt ie:" + names);
        List<String> names2 = new ArrayList<>();

        {
            {
                names2.add("dickddd");
            }
        }
        System.out.println("n:" + names2);
    }
}
