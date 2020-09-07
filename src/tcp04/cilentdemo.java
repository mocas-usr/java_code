package tcp04;

import java.io.*;
import java.net.Socket;
import java.net.SocketException;

/**
 * Created with IntelliJ IDEA
 *
 * @Author: mocas
 * @Date: 2020/4/19 16:03
 * @email: wangyuhang_mocas@163.com
 */
public class cilentdemo {
    public static void main(String[] args) throws IOException {
        /*创建socket对象*/
        Socket s=new Socket("127.0.0.1",1108);

        /*封装文本文件*/
        BufferedReader br=new BufferedReader(new FileReader("s.txt"));
        /*封装输出流写数据*/
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        String line;
        while ((line=br.readLine())!=null)
        {
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        bw.close();
        s.close();

    }
}
