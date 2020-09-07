package example01;

import sun.plugin2.main.client.PluginMain;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA
 *
 * @Author: mocas
 * @Date: 2020/4/10 16:25
 * @email: wangyuhang_mocas@163.com
 */
/*评委得分，去掉最高分，最低分之后
* 4个评分平均得分*/
public class judge {
    public static void main(String[] args) {
        /*定义动态数组*/
        int len=6;
        int[] arr=new int[len];
        Scanner sc=new Scanner(System.in);
        System.out.println("清输入数组");
        /*给数组赋值*/
        for (int i=0;i<arr.length;i++)
        {
            System.out.println("请输入各评委打分：");
            arr[i]=sc.nextInt();
        }
        System.out.println("打分结束");
        int arrsum=getSum(arr);
        int arrmax=getMax(arr);
        int arrmin=getMin(arr);
        double avg=(double)(arrsum-arrmax-arrmin)/(arr.length-2);
        System.out.println("评分最大值："+arrmax);
        System.out.println("评分最小值："+arrmin);
        System.out.println("评分得分"+avg);


    }
    /*求和*/
    public static int getSum(int[] arr)
    {

        int sum=0;
        for (int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
        }
        return sum;

    }
    /*求最大数值*/
    public static int getMax(int[] arr)
    {
        int max=arr[0];
        for (int i=0;i<arr.length;i++)
        {
            if (arr[i]>max)
                max=arr[i];
        }
       return max;
    }
    public static  int getMin(int[] arr)
    {
        int min=arr[0];
        for (int i=0;i<arr.length;i++)
        {
            if (arr[i]<min)
                min=arr[i];
        }
        return min;
    }
}
