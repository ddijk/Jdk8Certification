/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examjava7;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author DickD
 */
public class MyFileTest {

    public MyFileTest() {
    }

    @Test
    public void testMain() throws Exception {

        String input = "com.ibm.wsspi.bootstrap.WSPreLauncher -nosplash -application com.ibm.ws.bootstrap.WSLauncher com.ibm.ws.runtime.WsServer D:\\Program Files (x86)\\IBM\\WebSphere\\AppServer\\profiles\\AppSrv01\\config P-9020Node01Cell P-9020Node01 server1";
        String[] items = input.split(" ");

        Assert.assertEquals("server1", items[items.length - 1]);
    }

}
