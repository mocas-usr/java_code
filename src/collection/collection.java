package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Created with IntelliJ IDEA
 *
 * @Author: mocas
 * @Date: 2020/4/15 15:32
 * @email: wangyuhang_mocas@163.com
 */
public class collection {
    public static void main(String[] args) {
        Collection<student> c=new ArrayList<student>();

        student s1=new student("林青霞",25);
        student s2=new student("王宇航",26);
        student s3=new student("moacs",18);

        c.add(s1);
        c.add(s2);
        c.add(s3);
        Iterator<student> it=c.iterator();
        while (it.hasNext())
        {
            student s=it.next();
            System.out.println(s.getAge()+","+s.getName());
        }


    }
}
