package if_switch;

/**
 * Created with IntelliJ IDEA
 *
 * @Author: mocas
 * @Date: 2020/4/9 16:02
 * @email: wangyuhang_mocas@163.com
 */

import java.util.Scanner;
public class score01 {
    public static void main(String[] args) {
        /*小明的考试成绩可以由键盘输入得到*/
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个分数：");
        int score=sc.nextInt();

        /*由于奖励较多，分成多个分支进行奖励*/
        /*要考虑错误数据*/
        if (score>100 || score<0)
            System.out.println("你输入的数据有误");
        else if (score>95 && score<=100)
            System.out.println("山地自行车一辆");
        else if(score>80 && score<=95)
            System.out.println("游乐园一日游");
        else if (score>60 && score<=80)
            System.out.println("玩具");
        else
            System.out.println("胖揍一顿");


    }
}
