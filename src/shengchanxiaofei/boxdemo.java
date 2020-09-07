package shengchanxiaofei;

/**
 * Created with IntelliJ IDEA
 *
 * @Author: mocas
 * @Date: 2020/4/18 10:48
 * @email: wangyuhang_mocas@163.com
 */
public class boxdemo {
    public static void main(String[] args) {
        box b=new box();

        producer p= new producer(b);
        custmoer c=new custmoer(b);

        Thread t1=new Thread(p);
        Thread t2=new Thread(c);

        t1.start();
        t2.start();

    }
}
