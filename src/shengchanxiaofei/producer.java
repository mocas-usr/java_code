package shengchanxiaofei;

/**
 * Created with IntelliJ IDEA
 *
 * @Author: mocas
 * @Date: 2020/4/18 10:48
 * @email: wangyuhang_mocas@163.com
 */
public class producer implements Runnable {
    private  box b;
    public  producer (box b)
    {
        this.b=b;
    }
    @Override
    public void run() {
        for (int i=1;i<6;i++)
        {
            b.put(i);
        }
    }
}
