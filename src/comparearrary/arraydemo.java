package comparearrary;

/**
 * Created with IntelliJ IDEA
 *
 * @Author: mocas
 * @Date: 2020/4/14 16:50
 * @email: wangyuhang_mocas@163.com
 */
/*冒泡排序
* 一种排序方式，对要进行排序的数据中相邻的数据两两比较，将较大的数据放在后面
* 依次对所有数据进行排序操作，直至所有数据完成排序*/
public class arraydemo {
    public static void main(String[] args) {
        int[] arr={24,65,39,85,76,15};
        System.out.println("排序前"+arrToString(arr));
        /*进行四次排序，从右向左选出数值*/
        for (int x=0;x<arr.length-1;x++)
        {
            for (int i = 0; i < arr.length - 1-x; i++) {
                if (arr[i] > arr[i + 1]) {
                    /*互换数值*/
                    int tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;

                }
            }
        }
        System.out.println("排序后的排序"+arrToString(arr));

    }

    /*把数组变成字符串，中间加上逗号*/
    public static  String arrToString(int[] arr)
    {
        StringBuilder sb=new StringBuilder();
        sb.append("[");
        for (int i=0;i<arr.length;i++)
        {
            if (i==arr.length-1)
            {
                sb.append(arr[i]);
            }
            else
            {
                sb.append(arr[i]).append(",");
            }
        }
        sb.append("]");
        String s=sb.toString();
        return s;

    }

}
