package teacherstudent;

/**
 * Created with IntelliJ IDEA
 *
 * @Author: mocas
 * @Date: 2020/4/13 11:03
 * @email: wangyuhang_mocas@163.com
 */
public class persondemo {
    public static void main(String[] args) {
        teacherpe t1=new teacherpe();
        t1.setName("林青霞");
        t1.setAge(29);
        System.out.println(t1.getName()+","+t1.getAge());
        t1.tech();

        /*带参构造*/
        teacherpe t2=new teacherpe("风清扬",33);
        System.out.println(t2.getName()+","+t2.getAge());
        t2.tech();


    }

}
