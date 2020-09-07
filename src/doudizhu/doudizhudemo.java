package doudizhu;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.*;

/**
 * Created with IntelliJ IDEA
 *
 * @Author: mocas
 * @Date: 2020/4/17 15:41
 * @email: wangyuhang_mocas@163.com
 */
public class doudizhudemo {
    public static void main(String[] args) {

        /*创建hashmap，key是编号，value是牌*/
        HashMap<Integer,String> hm=new HashMap<Integer, String>();
        /*创建牌盒*/
        ArrayList<Integer> array=new ArrayList<Integer>();

        /*定义花色数组*/
        String[] colors={"&","*","%","#"};
        String[] nums={"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
        int index=0;
        for (String num: nums)
            for(String col : colors)
            {
                hm.put(index,col+num);
                array.add(index);
                index++;

            }
        hm.put(index,"小王");
        array.add(index);
        hm.put(index,"大王");
        array.add(index);
        /*洗牌*/
        Collections.shuffle(array);


        /*发牌*/
        TreeSet<Integer> lqx=new TreeSet<Integer>();
        TreeSet<Integer> ly=new TreeSet<Integer>();
        TreeSet<Integer> fqy=new TreeSet<Integer>();
        TreeSet<Integer> dp=new TreeSet<Integer>();

        for (int i=0;i<array.size();i++)
        {
            int x= array.get(i);
            if (i>=array.size()-3)
            {
                /*底牌*/
                dp.add(x);
            }
            else if (i%3==0)
            {
                lqx.add(x);
            }
            else if(i%3==1)
            {
                ly.add(x);

            }
            else if (i%3==2)
            {
                fqy.add(x);
            }
        }
        /*发牌结束*/


        /*看牌*/
        lookpock("林青霞",lqx,hm);
        lookpock("柳岩",ly,hm);
        lookpock("风清扬",fqy,hm);
        lookpock("底牌",dp,hm);

    }

    public static void lookpock(String name, TreeSet<Integer> ts,HashMap<Integer,String> hm)
    {
        System.out.println(name+"的牌是");
        for (Integer key:ts)
        {
            String pocker=hm.get(key);
            System.out.print(pocker+" ");
        }
        System.out.println();
    }

}
