package comparestr;

import com.sun.org.apache.xpath.internal.objects.XString;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created with IntelliJ IDEA
 *
 * @Author: mocas
 * @Date: 2020/4/14 18:26
 * @email: wangyuhang_mocas@163.com
 */
public class comparedemo {
    public static void main(String[] args) {

        String s="25 63 65 23 16 75";
        String[] str=s.split(" ");
        for (int i=0;i<str.length;i++)
        {
            System.out.println(str[i]);
        }

        /*将字符串转换成int型*/
        int[] arr=new int[str.length];
        for (int i=0;i<str.length;i++)
        {
            arr[i]=Integer.parseInt(str[i]);
        }
//        for (int i=0;i<str.length;i++)
//        System.out.println("转换数组之后"+arr[i]);
        Arrays.sort(arr);

        /*将int型转换成string型*/
        StringBuilder sb=new StringBuilder();
        for (int i=0;i<arr.length;i++)
        {
            if (i==arr.length-1)
            {
                sb.append(arr[i]);
            }
            else
            {
                sb.append(arr[i]).append(",");
            }
        }
        String ss=sb.toString();
        System.out.println("转换后结果"+ss);


    }
}
