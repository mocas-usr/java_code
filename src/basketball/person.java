package basketball;

/**
 * Created with IntelliJ IDEA
 *
 * @Author: mocas
 * @Date: 2020/4/14 14:53
 * @email: wangyuhang_mocas@163.com
 */
public abstract class person {
    private String name;
    private  int age;

    public person() {
    }

    public person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public abstract void eat();
}
