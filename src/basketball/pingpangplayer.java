package basketball;

/**
 * Created with IntelliJ IDEA
 *
 * @Author: mocas
 * @Date: 2020/4/14 15:16
 * @email: wangyuhang_mocas@163.com
 */
public class pingpangplayer extends player implements speakengl {
    public pingpangplayer() {
    }

    public pingpangplayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("乒乓球运动员学 打球");
    }

    @Override
    public void eat() {
        System.out.println("乒乓球运动员吃的好");
    }

    @Override
    public void speak() {
        System.out.println("乒乓球运动员要说英语");
    }
}
