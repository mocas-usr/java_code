package tcp01;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created with IntelliJ IDEA
 *
 * @Author: mocas
 * @Date: 2020/4/18 16:45
 * @email: wangyuhang_mocas@163.com
 */
public class serversocket {
    public static void main(String[] args) throws IOException {
        /*创建服务器端的socket对象*/
        ServerSocket ss=new ServerSocket(1000);

        /*监听客户端连接，建立socket*/
        Socket s=ss.accept();

        /*获取输入流，将数据显示在控制台上*/
        InputStream is=s.getInputStream();
        byte[] bys=new byte[1024];
        int len=is.read(bys);
        String data=new String(bys,0,len);
        System.out.println("服务器数据"+data);


        /*给出反馈*/
        OutputStream os=s.getOutputStream();
        os.write("数据已经收到".getBytes());
        ss.close();


        
    }
}
