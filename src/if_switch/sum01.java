package if_switch;

/**
 * Created with IntelliJ IDEA
 *
 * @Author: mocas
 * @Date: 2020/4/9 17:00
 * @email: wangyuhang_mocas@163.com
 */
/*求1-5的加和*/
public class sum01 {
    public static void main(String[] args) {
        /*把和存在一个变量*/
        int sum=0;
        /*从1-5的加和循环*/
        for (int i=1;i<=5;i++)
            sum=sum+i;

        System.out.println("sum="+sum);
    }
}
