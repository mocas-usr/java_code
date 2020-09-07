package loginstring;

import com.sun.org.apache.xpath.internal.objects.XString;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA
 *
 * @Author: mocas
 * @Date: 2020/4/11 10:16
 * @email: wangyuhang_mocas@163.com
 */
/*实现用户名密码登录，程序模拟用户登录，总共三次登录机会，登录之后给出用户提示
*思路：
*   1.用户名和密码是字符串
*   2.键盘录入用户名，密码，利用Scanner实现
*   3.利用键盘输入的用户名，密码和已知的的用户名密码比较，用equals方法实现比较
*   4.用循环实现多次机会，利用for循环实现三次输入机会，break结束循环
* */
public class login01 {
    public static void main(String[] args) {
        /*用户名和密码定义字符串*/
        String username="mocas";
        String password="12345";

        for (int i=0;i<3;i++)
        {
            /*键盘录入用户名密码*/
            Scanner sc=new Scanner(System.in);
            System.out.println("清输入用户名：");
            String name=sc.nextLine();

            System.out.println("请输入用户密码：");
            String word=sc.nextLine();

            /*判断用户名密码是否相同*/
            if (name.equals(username) && word.equals(password))
            {
                System.out.println("登录成功");
                break;
            }
            else
            {
                if ((2-i)==0)
                {
                    System.out.println("你的账户被锁定");
                }
                else
                    {
                        System.out.println("登录失败，你还有"+(2-i)+"次机会");
                    }

            }
        }




    }
}
