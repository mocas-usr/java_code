package hashmap;

import java.util.HashMap;
import java.util.Set;

/**
 * Created with IntelliJ IDEA
 *
 * @Author: mocas
 * @Date: 2020/4/16 12:07
 * @email: wangyuhang_mocas@163.com
 */
public class hashmapdemo {
    public static void main(String[] args) {
        HashMap<String ,student> hp=new HashMap<String ,student>();

        student s1=new student("林青霞",45);
        student s2=new student("王祖贤",25);
        student s3=new student("赵云",45);
        student s4=new student("赵云",25);

        hp.put("001",s1);
        hp.put("002",s2);
        hp.put("003",s3);

        Set<String> keyset=hp.keySet();
        for (String key :keyset)
        {
            student value=hp.get(key);
            System.out.println(value.getAge()+"，"+value.getName());
        }
        System.out.println("=======================");

        HashMap<student,String> hm=new HashMap<student,String>();
        hm.put(s1,"安徽");
        hm.put(s2,"江苏");
        hm.put(s3,"河南");
        hm.put(s4,"湖北");

        Set<student> skey=hm.keySet();
        for (student sk: skey)
        {
            String add=hm.get(sk);
            System.out.println(sk.getAge()+sk.getName()+"居住地："+add);
        }

    }
}
