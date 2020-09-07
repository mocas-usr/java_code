package basketball;

/**
 * Created with IntelliJ IDEA
 *
 * @Author: mocas
 * @Date: 2020/4/14 14:57
 * @email: wangyuhang_mocas@163.com
 */
public abstract class player extends person{
    public player() {
    }

    public player(String name, int age) {
        super(name, age);
    }
    public abstract void study();
}
