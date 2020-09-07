package nimingclass;

/**
 * Created with IntelliJ IDEA
 *
 * @Author: mocas
 * @Date: 2020/4/14 16:30
 * @email: wangyuhang_mocas@163.com
 */
public class jumpdemo {
    public static void main(String[] args) {
        jumpoperator jo=new jumpoperator();
        jump j=new cat();
        jo.method(j);

        jump j2=new dog();
        jo.method(j2);
        System.out.println("_______________");
        jo.method(new jump()
        {
            @Override
            public void jump() {
                System.out.println("猫又可以跳高了");
            }
        });

        jo.method(new jump() {
            @Override
            public void jump() {
                System.out.println("狗又可以跳高了");
            }
        });

    }
}
