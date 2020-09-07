/**
 * Created with IntelliJ IDEA
 *
 * @Author: mocas
 * @Date: 2020/4/9 15:14
 * @email: wangyuhang_mocas@163.com
 */

import java.util.Scanner;
public class test03 {
    public static void main(String[] args) {

        /*键盘录入三个和尚的身高*/
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入三个身高：,第一个身高：");
        int height1=sc.nextInt();
        System.out.println("请输入第二个身高：");
        int height2=sc.nextInt();
        System.out.println("请输入身高");
        int height3=sc.nextInt();

        /*保存和尚的最高身高*/
        int maxheight=height1>height2 ? height1:height2;
        maxheight=maxheight>height3 ?maxheight:height3;
        System.out.println("maxheight="+maxheight+"cm");


    }
}
