/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examjava8;

/**
 *
 * @author dick
 */
 @FunctionalInterface
public interface Formula {
    
    default double sqrt(double d) { return Math.sqrt(d);}
    
   
    double calculate(double d);
}
