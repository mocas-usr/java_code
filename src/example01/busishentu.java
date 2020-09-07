package example01;

/**
 * Created with IntelliJ IDEA
 *
 * @Author: mocas
 * @Date: 2020/4/10 14:44
 * @email: wangyuhang_mocas@163.com
 */
/*实现斐波那契数列f0=1 f1=1 f2=f0+f1,用数组实现*/
public class busishentu {
    public static void main(String[] args) {
        /*动态初始化*/
        int[] arr= new int[20];
        arr[0]=1;
        arr[1]=1;

        for (int i=2;i<20;i++)
        {
            arr[i]=arr[i-1]+arr[i-2];
        }

        System.out.println("第二十个里面有："+arr[19]);


    }


}
