package class_package;

/**
 * Created with IntelliJ IDEA
 *
 * @Author: mocas
 * @Date: 2020/4/10 9:55
 * @email: wangyuhang_mocas@163.com
 */
/*形参传递，方法应用*/
public class argsmax {
    public static void main(String[] args) {
        getMax(10,20);
    }

    public static void getMax(int a,int b )
    {
        if (a>b)
        {
            System.out.println(a);
        }
        else
        {
            System.out.println(b);
        }
    }
}
