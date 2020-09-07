package loginstring;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA
 *
 * @Author: mocas
 * @Date: 2020/4/11 10:54
 * @email: wangyuhang_mocas@163.com
 */
/*统计字符串个数*/
public class strsum {
    public static void main(String[] args) {
        /*输入字符串*/
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入字符串");
        String str=sc.nextLine();

        int bigCount=0;
        int smCount=0;
        int numCount=0;


        for (int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if ('a'<ch && ch<'z')
            {
                smCount++;
            }
            if ('A'<ch && ch<'Z')
            {
                bigCount++;
            }
            if ('1'<ch && ch<'9')
            {
                numCount++;
            }
        }
        System.out.println("大写字母个数："+bigCount);
        System.out.println("小写字母个数有："+smCount);
        System.out.println("数字个数有："+numCount);


    }
}
