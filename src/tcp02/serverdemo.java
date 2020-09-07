package tcp02;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created with IntelliJ IDEA
 *
 * @Author: mocas
 * @Date: 2020/4/19 10:47
 * @email: wangyuhang_mocas@163.com
 */
public class serverdemo  {

    public static void main(String[] args) throws IOException {
        ServerSocket ss=new ServerSocket(10001);
        Socket s=ss.accept();

        /*获取输入流*/
        InputStream is=s.getInputStream();
        InputStreamReader isr=new InputStreamReader(is);
        BufferedReader br=new BufferedReader(isr);

        String line;
        while ((line=br.readLine())!=null)
        {
            System.out.println(line);
        }
        ss.close();

    }
}
