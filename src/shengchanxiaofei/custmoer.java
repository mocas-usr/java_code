package shengchanxiaofei;

/**
 * Created with IntelliJ IDEA
 *
 * @Author: mocas
 * @Date: 2020/4/18 10:47
 * @email: wangyuhang_mocas@163.com
 */
public class custmoer implements Runnable {
    private box b;
    public custmoer(box b)
    {
        this.b=b;
    }

    @Override
    public void run() {
        while (true)
        {
            b.get();
        }

    }
}
