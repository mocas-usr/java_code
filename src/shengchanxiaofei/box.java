package shengchanxiaofei;

/**
 * Created with IntelliJ IDEA
 *
 * @Author: mocas
 * @Date: 2020/4/18 10:41
 * @email: wangyuhang_mocas@163.com
 */
public class box {
    private int milk;

    /*定义成员变量，表示奶箱的状态*/
    private boolean state=true;


    public synchronized void put(int milk)
    {
        if (state==true)
        {
             try {
                 wait();
             } catch (InterruptedException e) {
                 e.printStackTrace();
             }
        }

        /*这就是在生产牛奶*/
        this.milk=milk;
        System.out.println("送奶工将第"+this.milk+"瓶牛奶放进奶箱");
        state=true;
        notifyAll();
    }
    public synchronized  void get()
    {
        if (!state)
        {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("用户拿到第"+this.milk+"瓶奶");
        state=false;
        notifyAll();
    }

}
