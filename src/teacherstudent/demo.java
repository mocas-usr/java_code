package teacherstudent;

/**
 * Created with IntelliJ IDEA
 *
 * @Author: mocas
 * @Date: 2020/4/13 10:45
 * @email: wangyuhang_mocas@163.com
 */
public class demo {
    public static void main(String[] args) {
        teacher t1=new teacher();
        t1.setAge(23);
        t1.setName("林青霞");
        t1.tech();

        teacher t2=new teacher();
        t2.setName("风清扬");
        t2.setAge(34);
        t2.tech();
    }
}
