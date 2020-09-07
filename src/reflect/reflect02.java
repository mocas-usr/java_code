package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created with IntelliJ IDEA
 *
 * @Author: mocas
 * @Date: 2020/4/20 11:03
 * @email: wangyuhang_mocas@163.com
 */
public class reflect02 {
    public static void main(String[] args) throws NoSuchMethodException, ClassNotFoundException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> c=Class.forName("teacherstudent.student");

        Constructor<?> con=c.getConstructor();

//        con.newInstance();

        Object obj=con.newInstance();
        System.out.println(obj);

        Method m1=c.getDeclaredMethod("study");
        m1.invoke(obj);

        Method m2=c.getDeclaredMethod("setAge", int.class);
        m2.invoke(obj,26);
        System.out.println(obj);
    }
}
