package fanshe01;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Created with IntelliJ IDEA
 *
 * @Author: mocas
 * @Date: 2020/4/20 9:32
 * @email: wangyuhang_mocas@163.com
 */
public class reflect01 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> c=Class.forName("teacherstudent.student");

        Constructor<?> con=c.getConstructor(String.class,int.class);

//        con.newInstance();

        Object obj=con.newInstance("林青霞",30);
        System.out.println(obj);



    }
}
