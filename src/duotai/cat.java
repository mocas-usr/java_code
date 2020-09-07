package duotai;

/**
 * Created with IntelliJ IDEA
 *
 * @Author: mocas
 * @Date: 2020/4/13 17:07
 * @email: wangyuhang_mocas@163.com
 */
public class cat extends animal{
    public cat() {
    }

    public cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }



}
