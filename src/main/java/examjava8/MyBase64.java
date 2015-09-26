/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examjava8;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Base64;
import javax.xml.bind.DatatypeConverter;
//import java.util.MyBase64;

/**
 *
 * @author dickdijk
 */
public class MyBase64 {

    public static void main(String[] args) throws UnsupportedEncodingException {
        String encodedDuke = DatatypeConverter.printBase64Binary("duke".getBytes("UTF-8"));
        System.out.println("duke:" + encodedDuke);
        System.out.println("duke:" + Arrays.toString(Base64.getEncoder().encode("duke".getBytes())));
    }
}
