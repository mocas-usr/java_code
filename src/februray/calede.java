package februray;

import java.util.Calendar;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA
 *
 * @Author: mocas
 * @Date: 2020/4/15 11:02
 * @email: wangyuhang_mocas@163.com
 */
public class calede {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入年份");
        int year=sc.nextInt();
        Calendar dat=Calendar.getInstance();
        dat.set(year,2,1);
        dat.add(Calendar.DATE,-1);
        System.out.println("当前日期"+dat.getTime());
        int date=dat.get(Calendar.DATE);
        System.out.println("今年的2月份一共有："+date+"天");
    }
}
