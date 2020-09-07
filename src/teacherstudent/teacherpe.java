package teacherstudent;

/**
 * Created with IntelliJ IDEA
 *
 * @Author: mocas
 * @Date: 2020/4/13 10:52
 * @email: wangyuhang_mocas@163.com
 */
public class teacherpe extends person{

    public  teacherpe()
    {

    }
        /*这是带参构造方法*/
    public teacherpe(String name, int age)
    {
        super(name,age);
    }
    public  void tech()
    {
        System.out.println("用爱成就每个学员pro");
    }
}
