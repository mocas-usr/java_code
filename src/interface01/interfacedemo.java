package interface01;

/**
 * Created with IntelliJ IDEA
 *
 * @Author: mocas
 * @Date: 2020/4/14 14:31
 * @email: wangyuhang_mocas@163.com
 */
public class interfacedemo {
    public static void main(String[] args) {
        jump j=new cat("加菲猫",5);
        animal a=new cat("橘猫",3);
        cat c=new cat("普通猫",1);
        j.jump();
        a.eat();
        c.eat();
        c.jump();


    }
}
