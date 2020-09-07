package lambda03;

/**
 * Created with IntelliJ IDEA
 *
 * @Author: mocas
 * @Date: 2020/4/20 8:58
 * @email: wangyuhang_mocas@163.com
 */
public class adddemo {
    public static void main(String[] args) {
        add((int x,int y) ->
        {
            return  x+y;
        });
    }
    public static void add(addable a)
    {
        int sum=a.add(10,20);
        System.out.println(sum);
    }
}
