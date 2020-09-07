package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created with IntelliJ IDEA
 *
 * @Author: mocas
 * @Date: 2020/4/15 16:07
 * @email: wangyuhang_mocas@163.com
 */
public class listdemo {
    public static void main(String[] args) {
        List<student> l=new ArrayList<student>();

        student s1=new student("林青霞",25);
        student s2=new student("张曼玉",18);
        student s3=new student("王祖贤",19);
        l.add(s1);
        l.add(s2);
        l.add(s3);

        Iterator<student> it=l.iterator();
        while (it.hasNext())
        {
            student s=it.next();
            System.out.println(s.getName()+","+s.getAge());

        }
        System.out.println("_________________________");
        for (int i=0;i<l.size();i++)
        {
            student s=l.get(i);
            System.out.println(s.getName()+","+s.getAge());
        }
        System.out.println("_________________________");
        for (student s:l)
        {
            System.out.println(s.getName()+","+s.getAge());
        }

    }
}
