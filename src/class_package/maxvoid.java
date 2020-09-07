package class_package;

/**
 * Created with IntelliJ IDEA
 *
 * @Author: mocas
 * @Date: 2020/4/10 10:24
 * @email: wangyuhang_mocas@163.com
 */
/*利用方法求数组最大值*/
public class maxvoid {
    public static void main(String[] args) {
        int[] arr={10,25,36,85,63,78};
        int maxnum=getMAX(arr);
        System.out.println(maxnum);
    }

    public static int getMAX(int[] arr) {
        int maxnum=arr[0];
        for (int i=0;i<arr.length;i++)
        {
            if (arr[i]>maxnum)
            {
                maxnum=arr[i];
            }
        }
        return maxnum;

    }
}
