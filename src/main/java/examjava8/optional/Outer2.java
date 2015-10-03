/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examjava8.optional;

import java.util.Optional;

/**
 *
 * @author dick
 */
public class Outer2 {

    Nested2 nested;

    public static void main(String[] args) {
        Outer2 outer = new Outer2();

       Optional<String> oo = Optional.of(outer).flatMap(o -> Optional.ofNullable(o.nested)
                .flatMap(n -> Optional.ofNullable(n.inner)
                        .flatMap(i -> Optional.ofNullable(i.foo))));
       
        System.out.println("String is "+ oo.orElse("leeg"));
    }

}

class Nested2 {

    Inner2 inner;
}

class Inner2 {

    String foo;
}
