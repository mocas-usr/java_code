package doudizhu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/**
 * Created with IntelliJ IDEA
 *
 * @Author: mocas
 * @Date: 2020/4/17 16:52
 * @email: wangyuhang_mocas@163.com
 */
public class gaijindoudizhu {
    public static void main(String[] args) {
        /*创建hashmap，key是编号，value是牌*/
        HashMap<Integer,String> hm=new HashMap<Integer, String>();
        /*创建牌盒*/
        ArrayList<String> array=new ArrayList<String>();

        /*定义花色数组*/
        String[] colors={"&","*","%","#"};
        String[] nums={"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
        for (String col: colors)
            for(String num : nums)
            {
                array.add(col+num);

            }


        array.add("小王");
        array.add("大王");
        System.out.println(array);
        Collections.shuffle(array);


        /*发牌*/
        ArrayList<String> lqx=new ArrayList<String>();
        ArrayList<String> ly=new ArrayList<String>();
        ArrayList<String> fqy=new ArrayList<String>();
        ArrayList<String> dp=new ArrayList<String>();

        for (int i=0;i<array.size();i++)
        {
            String pocket=array.get(i);
            if (i>=array.size()-3)
            {
                /*底牌*/
                dp.add(pocket);
            }
            else if (i%3==0)
            {
                lqx.add(pocket);
            }
            else if(i%3==1)
            {
                ly.add(pocket);

            }
            else if (i%3==2)
            {
                fqy.add(pocket);
            }
        }
        /*发牌结束*/


        /*看牌*/
        look("林青霞",lqx);
        look("柳岩",ly);
        look("风清扬",fqy);
        look("底牌",dp);
    }
    public static void look(String name, ArrayList<String> arr)
    {
        System.out.println(name+"的牌是");
        for (String pock:arr)
        {
            System.out.println(pock+" ");
        }
//        System.out.println();
    }
}
