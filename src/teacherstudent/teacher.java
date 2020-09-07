package teacherstudent;

/**
 * Created with IntelliJ IDEA
 *
 * @Author: mocas
 * @Date: 2020/4/13 10:34
 * @email: wangyuhang_mocas@163.com
 */
/*老师类*/
public class teacher {
    private String name;
    private int age;

    public teacher() {
    }

    public teacher(String name, int age) {
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
    public  void tech()
    {
        System.out.println("用爱教育学生");
    }


}
