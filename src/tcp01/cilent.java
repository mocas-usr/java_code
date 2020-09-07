package tcp01;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * Created with IntelliJ IDEA
 *
 * @Author: mocas
 * @Date: 2020/4/18 16:34
 * @email: wangyuhang_mocas@163.com
 */
public class cilent {
    public static void main(String[] args) throws IOException {
        /*创建客户端对象*/
        Socket s=new Socket("127.0.0.1",1000);
        /*向socket输出数据*/
        OutputStream os=s.getOutputStream();
        os.write("hello,我来了".getBytes());

        /*接受服务器反馈*/
        InputStream is=s.getInputStream();
        /*读取is的数据流*/
        byte[] bys=new byte[1024];
        int len=is.read(bys);
        String data=new String(bys,0,len);
        /*data就是从is读出的数据*/
        System.out.println("客户端"+data);

        s.close();
    }
}
