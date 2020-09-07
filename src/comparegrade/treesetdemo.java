package comparegrade;

import com.sun.deploy.uitoolkit.impl.fx.AppletStageManager;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * Created with IntelliJ IDEA
 *
 * @Author: mocas
 * @Date: 2020/4/16 9:45
 * @email: wangyuhang_mocas@163.com
 */
public class treesetdemo {
    public static void main(String[] args) {
        TreeSet<student> ts=new TreeSet<student>(new Comparator<student>() {
            @Override
            public int compare(student s1, student s2) {
                int num=s2.getSum()-s1.getSum();
                int num1=num==0 ?s1.getChinese()-s2.getChinese() :num;
                int num2=num1==0 ? s1.getName().compareTo(s2.getName()) :num1;
                return num2;
            }
        });
        student s1=new student("林青霞",85,89);
        student s2=new student("令狐冲",95,96);
        student s3=new student("任我行",85,99);
        student s4=new student("岳不群",95,95);
        student s5=new student("东方不败",95,95);


        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);
        for (student s: ts)
        {
            System.out.println(s.getName()+","+s.getChinese()+s.getMath());
        }


    }
}
