/**
 * Created with IntelliJ IDEA.
 *
 * @Author: mocas
 * @Date: 2020/4/9 14:57
 * @email: wangyuhang_mocas@163.com
 */

/*三个和尚进行比较，
保存三个和尚的最高身高*/
public class test02 {
    public static void main(String[] args) {

        int height1=180;
        int height2=175;
        int height3=190;

        int maxheight=height1>height2 ? height1 : height2;
        maxheight=maxheight>height3 ? maxheight: height3;
        System.out.println("naxheight="+maxheight);
    }


}
