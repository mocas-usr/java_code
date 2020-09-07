package tcp02;

import java.io.*;
import java.net.Socket;

/**
 * Created with IntelliJ IDEA
 *
 * @Author: mocas
 * @Date: 2020/4/19 10:25
 * @email: wangyuhang_mocas@163.com
 */
public class cilentdemo {
    public static void main(String[] args) throws IOException {

        Socket s=new Socket("127.0.0.1",10001);
        /*键盘录入*/
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        /*封装输出流对象*/
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

        String line;
        while ((line=br.readLine())!=null)
        {
            if ("886".equals(line))
            {
                break;
            }
            bw.write(line);
            bw.newLine();
            bw.flush();
        }

    }
}
