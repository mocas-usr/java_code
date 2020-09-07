package lambda01;

/**
 * Created with IntelliJ IDEA
 *
 * @Author: mocas
 * @Date: 2020/4/19 16:27
 * @email: wangyuhang_mocas@163.com
 */
public class eatdemo {
    public static void main(String[] args) {
        eatapp e=new eataimp();
        useapp(e);

        useapp(new eatapp() {
            @Override
            public void eat() {
                System.out.println("一天一苹果，这是匿名类");
            }
        });

        useapp(() ->{
            System.out.println("一天一苹果，医生远离我");
        });

    }
    public static void  useapp(eatapp e)
    {
        e.eat();
    }
}
