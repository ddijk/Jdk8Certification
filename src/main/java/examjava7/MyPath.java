package examjava7;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MyPath {

    public static void main(String[] args) throws IOException {
        Path p = Paths.get("./src/../myFile.txt");

        System.out.println("p is " + p.normalize());
        System.out.println("p is " + p.toRealPath());
    }
}
