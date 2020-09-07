package example01;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA
 *
 * @Author: mocas
 * @Date: 2020/4/10 14:27
 * @email: wangyuhang_mocas@163.com
 */
/*switc实现减肥*/
public class switchjianfei {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入星期几：");
        int week=sc.nextInt();

        /*case实现减肥计划*/
        switch (week)
        {
            case 1:
            {
                System.out.println("跑步");
                break;
            }
            case 2:
            {
                System.out.println("游泳");
                break;
            }
            case 3:
            {
                System.out.println("慢走");
                break;
            }
            case 4:
            {
                System.out.println("动感单车");
                break;
            }
            case 5:
            {
                System.out.println("爬山");
                break;
            }
            case 6:
            {
                System.out.println("拳击");
                break;
            }
            case 7:
            {
                System.out.println("好好吃一顿");
                break;
            }
            default:
            {
                System.out.println("输入的有错误");
                break;
            }
        }
    }
}
