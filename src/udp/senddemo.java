package udp;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

import static java.lang.System.in;

/**
 * Created with IntelliJ IDEA
 *
 * @Author: mocas
 * @Date: 2020/4/18 15:00
 * @email: wangyuhang_mocas@163.com
 */
public class senddemo {
    public static void main(String[] args)  throws IOException {
        /*创建发送端socket对象*/
        DatagramSocket ds=new DatagramSocket();
        /*自己封装键盘录入数据*/
        BufferedReader br=new BufferedReader(new InputStreamReader(in));
        String line;
        while ((line=br.readLine())!=null)
        {
            if ("886".equals(line))
            {
                break;
            }
            /*创建数据，将数据打包*/
            byte[] bys=line.getBytes();
            DatagramPacket dp=new DatagramPacket(bys,bys.length, InetAddress.getByName("127.0.0.1"),12344);
            ds.send(dp);

        }
        ds.close();

    }
}
