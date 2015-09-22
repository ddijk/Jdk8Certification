package nl.ortecfinance.pearl.jdk8certification.java7;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

public class TryWith {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        URL url = new URL("http://www.nu.nl");

        try (OutputStream out = new FileOutputStream("myfile.html");
                InputStream is = url.openStream()) {
            byte[] buf = new byte[4096];
            int len;
            while ((len = is.read(buf)) > 0) {
                out.write(buf, 0, len);
            }
        }
    }

}
