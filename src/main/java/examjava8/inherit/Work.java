/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examjava8.inherit;

/**
 *
 * @author dick
 */
public interface Work {
     default void program() {
       System.out.println("lekker hobbyen");
   }
}
