/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examjava6;

import java.util.Arrays;

/**
 *
 * @author dick
 */
public class StringSplitter {
    public static void main(String[] args) {
        String s = "hallo dick";
        
        System.out.println("length:"+s.split("").length);
        System.out.println("unieke chars:");
        Arrays.stream(s.split("")).filter(i->i.trim().length()>0).distinct().forEach(System.out::println);
    }
}
