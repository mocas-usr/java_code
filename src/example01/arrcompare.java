package example01;

/**
 * Created with IntelliJ IDEA
 *
 * @Author: mocas
 * @Date: 2020/4/10 15:37
 * @email: wangyuhang_mocas@163.com
 */
/*比较数组是否相同*/
public class arrcompare {

    public static void main(String[] args) {
        int[] arr1={25,16,85,95,63};
        int[] arr2={25,16,85,95,63};
        boolean flag=compare(arr1,arr2);
        System.out.println("两个数组"+flag);


    }

    public static boolean compare(int[] arr1,int[] arr2) {
        if (arr1.length!=arr2.length)
        {
            return false;
        }
        else
        {
            for (int i=0;i<arr1.length;i++)
                if (arr1[i]==arr2[i])
                    continue;
                else
                {
                        return false;
                }
                return true;

        }

    }
}
