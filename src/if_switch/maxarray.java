package if_switch;

/**
 * Created with IntelliJ IDEA
 *
 * @Author: mocas
 * @Date: 2020/4/10 9:19
 * @email: wangyuhang_mocas@163.com
 */
/*求数组的最大值*/
public class maxarray {
    public static void main(String[] args) {
        int[] arr={12,58,6,96,28,48};
        int max=arr[0];
        for (int i=0;i<arr.length;i++)
            {
                if (arr[i]>max)
                    {
                        max=arr[i];
                    }
            }
        System.out.println(max);
    }
}
