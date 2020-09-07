package example01;

/**
 * Created with IntelliJ IDEA
 *
 * @Author: mocas
 * @Date: 2020/4/10 15:02
 * @email: wangyuhang_mocas@163.com
 */
/*多层循环实现三元一次方程
*
* x+y+z=100
* 5x+3y+z/3=100
*
* 0<x<20  0<y<33  0<z<100*/
public class duocengfor {
    public static void main(String[] args) {


        for (int i=0;i<=20;i++)
            for (int j=0;j<=33;j++)
                for (int k=0;k<=100;k++)
                    if (i+j+k==100 && 5*i+3*j+k/3==100 && k%3==0)
                    {
                        System.out.println("列出有："+i+","+j+","+k);
                    }
    }
}
