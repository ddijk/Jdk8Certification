/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examjava8;

import java.util.Optional;

/**
 *
 * @author dick
 */
public class MyOptional {
    
    public static void main(String[] args) {
       
        Optional<Integer> prop = Optional.of("4").map(Integer::parseInt);
        
        System.out.println("waarde plus 1 ="+ (prop.get()+1));
    }
    
    
    public static Integer getProp(String propVal) {
        return Optional.ofNullable(propVal).map(MyOptional::parse).filter(val->val>0).orElse(0);
    }
    
    
    public static Integer parse(String str) {
        try {
            return Integer.parseInt(str);
        } catch ( NumberFormatException nfe) {
            return 0;
        }
    }
}
