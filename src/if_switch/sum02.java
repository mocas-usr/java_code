package if_switch;

/**
 * Created with IntelliJ IDEA
 *
 * @Author: mocas
 * @Date: 2020/4/9 17:14
 * @email: wangyuhang_mocas@163.com
 */
/*求偶数和*/
public class sum02 {
    public static void main(String[] args) {
        int sum=0;
        for (int i=1;i<100;i++)
            if (i%2==0)
                sum=sum+i;

        System.out.println("sum="+sum);
    }
}
