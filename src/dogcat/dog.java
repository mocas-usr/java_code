package dogcat;

/**
 * Created with IntelliJ IDEA
 *
 * @Author: mocas
 * @Date: 2020/4/13 16:43
 * @email: wangyuhang_mocas@163.com
 */
public class dog extends animal{
    public dog() {
    }

    public dog(String name, int age) {
        super(name, age);
    }
    public  void dogmove()
    {
        System.out.println("狗看门");
    }
}
