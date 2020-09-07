package class_package;

/**
 * Created with IntelliJ IDEA
 *
 * @Author: mocas
 * @Date: 2020/4/10 10:06
 * @email: wangyuhang_mocas@163.com
 */
/*带返回值的方法*/
public class retur {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int result=getMax(a,b);
        System.out.println(result);
        System.out.println(getMax(a,b));
    }

    public static int getMax(int a,int b)
    {
        if (a>b)
            return a;
        else
            return b;

    }
}

