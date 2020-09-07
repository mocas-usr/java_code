package chouxiang;

/**
 * Created with IntelliJ IDEA
 *
 * @Author: mocas
 * @Date: 2020/4/14 14:00
 * @email: wangyuhang_mocas@163.com
 */
public class demo {
    public static void main(String[] args) {
        cat c1=new cat("加菲猫",25);
        System.out.println(c1.getAge()+c1.getName());
        c1.eat();

        dog d1=new dog("大狼狗",4);
        d1.eat();
    }
}
