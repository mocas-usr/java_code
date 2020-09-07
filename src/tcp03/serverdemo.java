package tcp03;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created with IntelliJ IDEA
 *
 * @Author: mocas
 * @Date: 2020/4/19 11:16
 * @email: wangyuhang_mocas@163.com
 */
public class serverdemo {
    public static void main(String[] args) throws IOException {

        ServerSocket ss=new ServerSocket(1028);

        Socket s=ss.accept();

        /*接收数据*/
        BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
        /*将数据写入文本*/
        BufferedWriter bw=new BufferedWriter(new FileWriter("s.txt"));
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
