package basketball;

/**
 * Created with IntelliJ IDEA
 *
 * @Author: mocas
 * @Date: 2020/4/14 15:05
 * @email: wangyuhang_mocas@163.com
 */
public class basketballcoach extends coach {
    public basketballcoach() {
    }

    public basketballcoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("教练教运球");

    }

    @Override
    public void eat() {
        System.out.println("教练吃好的");
    }
}
