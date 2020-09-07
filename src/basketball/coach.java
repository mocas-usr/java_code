package basketball;

/**
 * Created with IntelliJ IDEA
 *
 * @Author: mocas
 * @Date: 2020/4/14 14:55
 * @email: wangyuhang_mocas@163.com
 */
public abstract  class coach extends person{
    public coach() {
    }

    public coach(String name, int age) {
        super(name, age);
    }
    public abstract void teach();
}
