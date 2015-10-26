/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examjava7;

/**
 *
 * @author dickdijk
 */
public class MyException {

    static class FirstException extends Exception {
    }

    static class SecondException extends Exception {
    }

    public void rethrowException(String exceptionName) throws FirstException, SecondException {
        Exception eks;
        try {
            if (exceptionName.equals("First")) {
                throw new FirstException();
            } else {
                throw new SecondException();
            }
        } catch (Exception e) {
//            eks = e;
//            throw eks;
            throw e;
        }
    }
}
