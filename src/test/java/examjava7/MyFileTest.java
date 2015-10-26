/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examjava7;

import java.io.IOException;
import java.nio.file.FileStore;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Iterator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author DickD
 */
public class MyFileTest {

    public MyFileTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testMain() throws Exception {

        String input = "com.ibm.wsspi.bootstrap.WSPreLauncher -nosplash -application com.ibm.ws.bootstrap.WSLauncher com.ibm.ws.runtime.WsServer D:\\Program Files (x86)\\IBM\\WebSphere\\AppServer\\profiles\\AppSrv01\\config P-9020Node01Cell P-9020Node01 server1";
        String[] items = input.split(" ");

        Assert.assertEquals("server1", items[items.length - 1]);
    }

    @Test
    public void testIsSame() throws IOException {
        Path p1 = Paths.get("pom.xml");

        // BasicFileAttributeView attrs = Files.getFileAttributeView(p1, BasicFileAttributeView.class);      
        //   long size = attrs.readAttributes().size();
        BasicFileAttributes attrs = Files.readAttributes(p1, BasicFileAttributes.class);

        Assert.assertEquals(895L, attrs.size());
    }

    @Test
    public void testDefaultPath() throws IOException {
        Path p = Paths.get("");

        Iterator<FileStore> fs = FileSystems.getDefault().getFileStores().iterator();
        while (fs.hasNext()) {
            FileStore store = fs.next();
            System.out.println("name is " + store.name() + ", total space is " + store.getTotalSpace());
        }

        BasicFileAttributes attrs = Files.readAttributes(p, BasicFileAttributes.class);

        System.out.println("default path is " + p);
        System.out.println("Size is " + attrs.size() + ", is dir? " + attrs.isDirectory() + ", reg file?" + attrs.isRegularFile());

    }

    @Test
    public void testNormalize() {

        Path p = Paths.get("aap/../noot/mies");

        Assert.assertEquals(Paths.get("noot/mies"), p.normalize());
    }

    @Test
    public void testRelativize() {
        Path p1 = Paths.get("aap/noot/mies");

        Path p2 = Paths.get("aap/index.html");
        final Path p1ToP2 = p1.relativize(p2);

        Assert.assertEquals(Paths.get("..", "..", "index.html"), p1ToP2);
        Assert.assertEquals(Paths.get("../../index.html"), p1ToP2);

    }

    @Test
    public void testResolve() {
        Path p1 = Paths.get("aap/noot/mies");

        Path p2 = Paths.get("aap/index.html");
        final Path p1ToP2 = p1.relativize(p2);

        Assert.assertEquals(Paths.get("/tmp"), Paths.get("aap").resolve("/tmp"));
        Assert.assertEquals(Paths.get("aap/noot"), Paths.get("aap").resolve("noot"));
        Assert.assertEquals(Paths.get("aap/noot/mies/../../index.html"), p1.resolve(p1ToP2));
        Assert.assertEquals(p2, p1.resolve(p1ToP2).normalize());
    }
}
