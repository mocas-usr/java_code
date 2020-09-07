package thread;

/**
 * Created with IntelliJ IDEA
 *
 * @Author: mocas
 * @Date: 2020/4/18 9:10
 * @email: wangyuhang_mocas@163.com
 */
public class sellticket implements Runnable {
    private int tickets=100;
    private  Object obj=new Object();

    @Override
    public void run() {
        while (true)
        {
            synchronized (obj){
                if (tickets>0)
                {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("正在出售第"+tickets+"张票");
                    tickets--;
                }
            }

        }
    }
}
