package duotai;

/**
 * Created with IntelliJ IDEA
 *
 * @Author: mocas
 * @Date: 2020/4/13 17:16
 * @email: wangyuhang_mocas@163.com
 */
public class dog extends animal {
    public dog() {
    }

    public dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }
}
