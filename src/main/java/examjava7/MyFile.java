package examjava7;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MyFile {
//

    public static void main(String[] args) throws IOException {
        // createDummyFile();
        //readDeploymentConfig();

        readDeplomentConfig2();
    }

    private static void createDummyFile() throws IOException {
        Path file = FileSystems.getDefault().getPath("myFile.txt");
        Files.createFile(file);
        System.out.println("File created");
    }

    private static void readDeploymentConfig() throws IOException {
        Path file = FileSystems.getDefault().getPath("D:\\Program Files (x86)\\IBM\\WebSphere\\AppServer\\profiles\\AppSrv01", "servers", "null", "config", "deployment_config.properties");
        Files.readAllLines(file).stream().forEach(System.out::println);
        System.out.println("File created");
    }

    private static void readDeplomentConfig2() {
        String serverName = System.getenv("SERVER_NAME");
        System.out.println("SERVER_NAME=" + serverName);
        serverName = serverName != null ? serverName : "null";
        // String userDir = System.getProperty("user.dir");
        String userDir = "D:\\Program Files (x86)\\IBM\\WebSphere\\AppServer\\profiles\\AppSrv01";
        System.out.println("user.dir=" + userDir);
        String path = Paths.get(userDir, "servers", serverName, "config", "deployment_config.properties").toString();
        System.out.println("Path=" + path);
    }
}
