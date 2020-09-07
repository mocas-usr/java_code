package if_switch;

/**
 * Created with IntelliJ IDEA
 *
 * @Author: mocas
 * @Date: 2020/4/9 17:48
 * @email: wangyuhang_mocas@163.com
 */
/*猜中数字是否符合，自动提示大小*/
import java.util.Random;
import java.util.Scanner;
public class guassnum {
    public static void main(String[] args) {
        /*构建要进行猜想的数字*/
        Random r=new Random();
        int num=r.nextInt(100)+1;
        /*自己心中输入的数字*/
        Scanner sc=new Scanner(System.in);

        while (true)
        {
            System.out.println("请输入你猜想的数字：");
            int guass_num=sc.nextInt();
            if (guass_num>num)
                {
                    System.out.println("你猜的数字大了");
                 }
            else if (guass_num<num)
                {
                    System.out.println("你猜的数字小了");
                }
            else
                {
                    System.out.println("恭喜你猜中了，吼吼");
                    break;
                }

        }

    }
}
