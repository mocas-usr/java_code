package loginstring;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA
 *
 * @Author: mocas
 * @Date: 2020/4/11 11:08
 * @email: wangyuhang_mocas@163.com
 */
/*将字符串反转*/
public class strfanzhuan {
    public static void main(String[] args) {
        /*录入字符串*/
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入字符串：");
        String str=sc.nextLine();
        String s=reverse(str);
        System.out.println(s);

    }

    public static String reverse(String str) {

        String ss="";
        for (int i=str.length()-1;i>=0;i--)
        {
            ss+=str.charAt(i);
        }
        return  ss;
    }


}
