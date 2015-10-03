/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examjava8;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import org.junit.Assert;
import org.junit.Test;
/**
 *
 * @author dick
 */
public class JoinTest {
    
    
    @Test
    public void test() {
        
        String expected = "aap, noot, mies";
           String expected2 = "aapnootmies";
        
           
        
        
        Assert.assertEquals(expected, Stream.of("aap", "noot", "mies").collect(Collectors.joining(", ")));
         Assert.assertEquals(expected2, Stream.of("aap", "noot", "mies").collect(Collectors.joining()));
    }
        
}
