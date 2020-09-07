package example01;

/**
 * Created with IntelliJ IDEA
 *
 * @Author: mocas
 * @Date: 2020/4/10 15:13
 * @email: wangyuhang_mocas@163.com
 */
/*求指定数组指定条件下的和*/
public class arraysum {
    public static void main(String[] args) {
        int[] arr={68,27,95,88,171,996,51,210};
        int sum=0;
        for (int i=0;i<arr.length;i++)
        {
            int ge=arr[i]%10;
            int shi=arr[i]/10%10;
            int ou=arr[i]%2;
            if (ge!=7 && shi!=7 && ou==0)
            {
                sum+=arr[i];
            }
        }

        System.out.println("sum="+sum);
    }
}
