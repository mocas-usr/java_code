package duotai;

/**
 * Created with IntelliJ IDEA
 *
 * @Author: mocas
 * @Date: 2020/4/13 17:17
 * @email: wangyuhang_mocas@163.com
 */
public class demo {
    public static void main(String[] args) {
        animal cat1=new cat();
        cat1.setAge(5);
        cat1.setName("加菲猫");
        System.out.println(cat1.getAge()+","+cat1.getName());

        cat1.eat();


        
    }
}
