package loginstring;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA
 *
 * @Author: mocas
 * @Date: 2020/4/11 10:48
 * @email: wangyuhang_mocas@163.com
 */
/*遍历字符串*/
public class bianli {
    public static void main(String[] args) {

        /*输入字符串*/
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入字符串");
        String str=sc.nextLine();

        for (int i=0;i<str.length();i++)
        {
            System.out.println(str.charAt(i));
        }

    }
}
