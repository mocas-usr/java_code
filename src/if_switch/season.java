package if_switch;

/**
 * Created with IntelliJ IDEA
 *
 * @Author: mocas
 * @Date: 2020/4/9 16:30
 * @email: wangyuhang_mocas@163.com
 */
/*根据输入的月份来提示季节*/
import java.util.Scanner;
public class season {
    public static void main(String[] args) {

        /*输入月份*/
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入月份：");
        int month=sc.nextInt();

        switch (month)
        {
            case 1:
                System.out.println("冬天");
                break;
            case 2:
                System.out.println("冬天");
                break;
            case 3:
                System.out.println("春天");
                break;
            case 4:
                System.out.println("春天");
                break;
            case 5:
                System.out.println("春天");
                break;
            case 6:
                System.out.println("夏天");
                break;
            case 7:
                System.out.println("夏天");
                break;
            case 8:
                System.out.println("夏天");
                break;
            case 9:
                System.out.println("秋天");
                break;
            case 10:
                System.out.println("秋天");
                break;
            case 11:
                System.out.println("秋天");
                break;
            case 12:
                System.out.println("冬天");
                break;
            default:
                System.out.println("季节输入错误");
                break;

        }
    }
}
