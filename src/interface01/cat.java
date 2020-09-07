package interface01;

/**
 * Created with IntelliJ IDEA
 *
 * @Author: mocas
 * @Date: 2020/4/14 14:32
 * @email: wangyuhang_mocas@163.com
 */
public class cat extends animal implements  jump {
    public cat() {
    }

    public cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void jump() {
        System.out.println("猫可以跳高了");
    }

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
}
