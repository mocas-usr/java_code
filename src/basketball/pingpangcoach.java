package basketball;

/**
 * Created with IntelliJ IDEA
 *
 * @Author: mocas
 * @Date: 2020/4/14 15:07
 * @email: wangyuhang_mocas@163.com
 */
public class pingpangcoach extends coach implements speakengl{
    public pingpangcoach() {
    }

    public pingpangcoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("乒乓球教练");
    }

    @Override
    public void eat() {
        System.out.println("乒乓球教练吃的 不好");
    }

    @Override
    public void speak() {
        System.out.println("乒乓球教练要说英语");
    }
}
