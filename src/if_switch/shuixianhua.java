package if_switch;

import java.security.spec.RSAOtherPrimeInfo;

/**
 * Created with IntelliJ IDEA
 *
 * @Author: mocas
 * @Date: 2020/4/9 17:21
 * @email: wangyuhang_mocas@163.com
 */

/*水仙花案例*/
public class shuixianhua {
    public static void main(String[] args) {
        int count=0;
        for (int i=1;i<1000;i++)
        {
            int ge=i%10;
            int shi=i/10%10;
            int bai=i/10/10%10;
            if (ge*ge*ge+shi*shi*shi+bai*bai*bai==i)
                {
                    System.out.println(i);
                    count++;
                }
        }
        System.out.println("count:"+count);


    }
}
