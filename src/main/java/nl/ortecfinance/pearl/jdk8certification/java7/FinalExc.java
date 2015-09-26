package nl.ortecfinance.pearl.jdk8certification.java7;

public class FinalExc {

    public static void main(String[] args) {

        try {
            throw new RuntimeException("foutje");

        } catch (final Exception ex) {
            System.out.println("my log");
            throw ex;
        }
    }
}
