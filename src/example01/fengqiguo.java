package example01;

/**
 * Created with IntelliJ IDEA
 *
 * @Author: mocas
 * @Date: 2020/4/10 14:34
 * @email: wangyuhang_mocas@163.com
 */
/*1-100数字里面遇到7的话要跳过
* 逢七过*/
public class fengqiguo {
    public static void main(String[] args) {

        for (int i=1;i<100;i++)
        {
            int ge=i%10;
            int shi=i/10%10;
            int bei=i%7;
            if (ge==7 || shi==7 || bei==0)
            {
                System.out.println("遇到了："+i+"跳过");
            }


        }


    }
}
