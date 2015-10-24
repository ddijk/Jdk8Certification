/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examjava7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author dick
 */
public class WriteFile {
    
    
    public static void main(String[] args) {
        List<String> lines = Arrays.asList("hallo daar", "aap noot mies",  "NL niet naar EK");
        final Path path = Paths.get("lines.txt");
        
    
        try (BufferedWriter bw = Files.newBufferedWriter(path); PrintWriter pw = new PrintWriter(bw);){
            
            
            lines.stream().map(String::toUpperCase).forEach(pw::println);
            
        } catch (IOException ex) {
            System.err.println("Failed. "+ex);
        }
        
         try (BufferedReader br = Files.newBufferedReader(path); ){
            
            br.lines().forEach(System.out::println);
            
        } catch (IOException ex) {
            System.err.println("Failed. "+ex);
        }
         
         
         System.out.println("Aantal processors: "+Runtime.getRuntime().availableProcessors());
        
        
    }
}
