package charsum;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

/**
 * Created with IntelliJ IDEA
 *
 * @Author: mocas
 * @Date: 2020/4/17 14:48
 * @email: wangyuhang_mocas@163.com
 */
public class chardemo {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入字符");
        String line=sc.nextLine();

        HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
        /*遍历字符串，得到每一个字符*/
        /*key-value  key是字符 value是出现字数*/
        for (int i=0;i<line.length();i++)
        {
            char ch=line.charAt(i);
            Integer value=hm.get(ch);
            if (value==null)
            {
                hm.put(ch,1);

            }
            else
            {
                value++;
                hm.put(ch,value);

            }

        }

        StringBuilder sb=new StringBuilder();
        Set<Character> keyset=hm.keySet();
        for (Character key:keyset)
        {
            Integer value =hm.get(key);
            sb.append(key).append("{").append(value).append("}");

        }
        String  result=sb.toString();
        System.out.println(result);


    }
}
