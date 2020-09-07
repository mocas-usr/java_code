package yichang;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA
 *
 * @Author: mocas
 * @Date: 2020/4/15 14:43
 * @email: wangyuhang_mocas@163.com
 */
public class teachtest {
    public static void main(String[] args) throws excep {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入分数");

        int score=sc.nextInt();
        teach t=new teach();
        try
        {
            t.check(score);
        }
        catch (excep e)
        {
            e.printStackTrace();
        }
    }
}
