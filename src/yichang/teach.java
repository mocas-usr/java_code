package yichang;

/**
 * Created with IntelliJ IDEA
 *
 * @Author: mocas
 * @Date: 2020/4/15 14:35
 * @email: wangyuhang_mocas@163.com
 */
public class teach {
    public void  check(int score) throws excep
    {
        if (score>100 ||score<0)
        {
            throw new excep("输入分数超出范围");
        }
        else
        {
            System.out.println("输入正常");
        }
    }
}
