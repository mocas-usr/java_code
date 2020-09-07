package thread;

/**
 * Created with IntelliJ IDEA
 *
 * @Author: mocas
 * @Date: 2020/4/18 9:08
 * @email: wangyuhang_mocas@163.com
 */
public class maipiao {
    public static void main(String[] args) {
        sellticket th=new sellticket();

        Thread t1=new Thread(th,"窗口1");
        Thread t2=new Thread(th,"窗口2");
        Thread t3=new Thread(th,"窗口3");

        t1.start();
        t2.start();
        t3.start();


    }
}
