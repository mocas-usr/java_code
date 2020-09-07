package udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * Created with IntelliJ IDEA
 *
 * @Author: mocas
 * @Date: 2020/4/18 15:41
 * @email: wangyuhang_mocas@163.com
 */
public class receivedemo {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds=new DatagramSocket(12344);
        while (true)
        {
            byte[] bys=new byte[1024];
            DatagramPacket dp=new DatagramPacket(bys,bys.length);

            ds.receive(dp);
            System.out.println("数据是"+new String(dp.getData(),0,dp.getLength()));


        }
//        ds.close();

    }
}
