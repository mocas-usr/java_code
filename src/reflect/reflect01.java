package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/**
 * Created with IntelliJ IDEA
 *
 * @Author: mocas
 * @Date: 2020/4/20 10:46
 * @email: wangyuhang_mocas@163.com
 */
public class reflect01 {
    public static void main(String[] args) throws NoSuchMethodException, ClassNotFoundException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        Class<?> c=Class.forName("teacherstudent.student");

        Constructor<?> con=c.getConstructor();

//        con.newInstance();

        Object obj=con.newInstance();
        System.out.println(obj);

        Field namefiled=c.getDeclaredField("name");
        namefiled.setAccessible(true);
        namefiled.set(obj,"林青霞");
        System.out.println(obj);

        Field agefiled=c.getDeclaredField("age");
        agefiled.setAccessible(true);
        agefiled.set(obj,30);
        System.out.println(obj);
    }
}
