package if_switch;

/**
 * Created with IntelliJ IDEA
 *
 * @Author: mocas
 * @Date: 2020/4/9 17:39
 * @email: wangyuhang_mocas@163.com
 */
/*定义好纸的厚度，纸折叠多少次能达到珠穆朗玛峰的高度*/
public class zhumulangma {
    public static void main(String[] args) {
        /*定义计数*/
        int count=0;
        /*定义纸张厚度*/
        double paper=0.1;
        /*定义珠峰的高度*/
        int zf=8844430;
        while(paper<zf)
            {
                paper=paper*2;
                count+=1;
            }




    }
}
