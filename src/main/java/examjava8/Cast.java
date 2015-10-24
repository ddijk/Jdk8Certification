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
public class Cast {
    

    public static void method(Runnable r) {
        System.out.println("Runnable called. ");
         r.run();
    }
    
      public static void method(Task t) {
        System.out.println("Task called");
        t.doit();
    }
    
    
    
    public static void main(String[] args) {
        
       Cast.method((Task)()-> System.out.println("method aangeroepen"));
       Cast.method((Runnable)()-> System.out.println("method aangeroepen"));
    }
}


 interface Task {
    
    void doit();
}