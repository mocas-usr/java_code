package tcp04;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created with IntelliJ IDEA
 *
 * @Author: mocas
 * @Date: 2020/4/19 16:12
 * @email: wangyuhang_mocas@163.com
 */
public class serverdemo4 {
    public static void main(String[] args) throws IOException {
        ServerSocket ss=new ServerSocket(1108);

        Socket s=ss.accept();

        /*接收数据*/
        BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
        /*将数据写入文本*/
        BufferedWriter bw=new BufferedWriter(new FileWriter("copy.txt"));
        String line;
        while((line=br.readLine())!=null)
        {
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        bw.close();
        ss.close();
    }
}
