package dogcat;

/**
 * Created with IntelliJ IDEA
 *
 * @Author: mocas
 * @Date: 2020/4/13 16:44
 * @email: wangyuhang_mocas@163.com
 */
public class animaldemo {
    public static void main(String[] args) {
        cat c1=new cat("加菲猫",25);
        dog d1=new dog("泰迪狗",15);
        System.out.println(c1.getAge()+"，"+c1.getName());
        System.out.println(d1.getName()+","+d1.getAge());

    }
}
