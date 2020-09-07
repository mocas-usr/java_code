package example01;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA
 *
 * @Author: mocas
 * @Date: 2020/4/10 16:10
 * @email: wangyuhang_mocas@163.com
 */
/*寻找相同元素并定位*/
public class arrsearch {

    public static void main(String[] args) {
        int[] arr={19,20,15,68,29};
        Scanner sc=new Scanner(System.in);
        System.out.println("输入数值：");
        int num=sc.nextInt();
        int index=-1;

        for (int i=0;i<arr.length;i++)
        {
            if (num==arr[i])
            {
                index=i;
                System.out.println("找到对应元素"+arr[i]);
                System.out.println("对应位置"+index);
            }

        }
        if (index==-1)
        {
            System.out.println("没有找到对应元素");
        }

    }

}
