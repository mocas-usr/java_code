package lambda02;

/**
 * Created with IntelliJ IDEA
 *
 * @Author: mocas
 * @Date: 2020/4/19 16:51
 * @email: wangyuhang_mocas@163.com
 */
public class flydemo {
    public static void main(String[] args) {
        /*匿名内部了*/
        usefly(new flyable() {
            @Override
            public void fly(String s) {
                System.out.println(s);
                System.out.println("匿名飞翔，找不到我");
            }
        });

        usefly((String s) ->
        {
            System.out.println(s);
            System.out.println("这次高级飞行");
        });
    }

    public static void  usefly(flyable f)
    {
        f.fly("风和日丽，适合起飞");
    }
}
