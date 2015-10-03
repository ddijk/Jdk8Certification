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
public class Dick implements Work, Hobby{

  public void program() {
       System.out.println("lekkerrrr hobbyen");
   }
    public static void main(String[] args) {
        Dick d = new Dick() ;
        d.program();
    }
    
}
