/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examjava8.optional;

import java.util.Optional;

class Outer {

    Nested nested;
    
    

    public static void main(String[] args) {
        final Outer outer = new Outer();
        final Nested nested1 = new Nested();
        nested1.inner = new Inner();
     
        outer.nested = nested1;
//        Outer outer = new Outer();
//        if (outer != null && outer.nested != null && outer.nested.inner != null) {
//            System.out.println(outer.nested.inner.foo);
//        }
        Optional.of(outer)
                .flatMap(o -> { System.out.println("in flatMap o"); return Optional.ofNullable(o.nested);} )
                .flatMap(n -> { System.out.println("in flatMap n"); return Optional.ofNullable(n.inner);} )
                .flatMap(i -> { System.out.println("in flatMap i"); return Optional.ofNullable(i.foo);} )
                .ifPresent(System.out::println);
    }
}

class Nested {

    Inner inner;
}

class Inner {

    String foo;
}
