package example01;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA
 *
 * @Author: mocas
 * @Date: 2020/4/10 14:17
 * @email: wangyuhang_mocas@163.com
 */
/*减肥计划if实现*/
public class ifjianfei {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("输入第几星期：");
        int week=sc.nextInt();

        /*选择每一阶段要做的事*/
        if (week==1)
        {
            System.out.println("跑步");
        }
        else if (week==2)
        {
            System.out.println("游泳");
        }
        else if (week==3)
        {
            System.out.println("慢走");{
            System.out.println("动感单车");
        }
        }
        else if(week==4)
        {
            System.out.println("动感单车");
        }
        else if (week==5)
        {
            System.out.println("爬山");
        }
        else if (week==6)
        {
            System.out.println("拳击");
        }
        else if (week==7)
        {
            System.out.println("好好吃一顿");
        }
        else
        {
            System.out.println("输入的有错误");
        }
    }
}
