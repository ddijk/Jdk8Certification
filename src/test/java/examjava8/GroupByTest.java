/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examjava8;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import static java.util.stream.Collectors.groupingBy;
import org.junit.Assert;
import org.junit.Test;
/**
 *
 * @author dick
 */
public class GroupByTest {
    
    
    @Test
    public void groupByTest() {
        final Person dick = new Person("dick", 42);
        final Person jens = new Person("Jens", 10);
        final Person gertjan = new Person("Gertjan", 42);
        
        List<Person> persons = Arrays.asList(dick, jens, gertjan);
        
        Map<Integer, List<Person>> mapAgeToPersons = new HashMap<>();
        mapAgeToPersons.put(42, Arrays.asList( dick,  gertjan));
        mapAgeToPersons.put(10, Arrays.asList(jens));
       
        
        //Collector<Person, ?, Map<Integer, Person>> coll = 
        
   //     Assert.assertEquals(mapAgeToPersons, persons.stream().collect(groupingBy((person) -> person.getAge())));
         Assert.assertEquals(mapAgeToPersons, persons.stream().collect(groupingBy(Person::getAge)));
    }
}
