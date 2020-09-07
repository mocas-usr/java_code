package class_package;

/**
 * Created with IntelliJ IDEA
 *
 * @Author: mocas
 * @Date: 2020/4/10 10:14
 * @email: wangyuhang_mocas@163.com
 */
/*方法的重载*/
public class chongzai {
    public static void main(String[] args) {
        System.out.println(compare(10,15));
        System.out.println(compare((byte)10,(byte)15));
    }

    public static boolean compare(int a,int b)
    {
        System.out.println("int");
        return a==b;
    }
    public static boolean compare(byte a,byte b)
    {
        System.out.println("byte");
        return a==b;
    }
    public static boolean compare(short a,short b)
    {
        System.out.println("short");
        return a==b;
    }
}
