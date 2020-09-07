package basketball;

/**
 * Created with IntelliJ IDEA
 *
 * @Author: mocas
 * @Date: 2020/4/14 15:14
 * @email: wangyuhang_mocas@163.com
 */
public class basketballplayer extends player {
    public basketballplayer() {
    }

    public basketballplayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("篮球运动员学运球，打球");
    }

    @Override
    public void eat() {
        System.out.println("篮球 运动员吃牛肉");
    }
}
