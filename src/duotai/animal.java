package duotai;

import java.io.LineNumberReader;

/**
 * Created with IntelliJ IDEA
 *
 * @Author: mocas
 * @Date: 2020/4/13 17:06
 * @email: wangyuhang_mocas@163.com
 */
public class animal {
    private  String name;
    private int age;

    public animal() {
    }

    public animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public  void  eat()
    {
        System.out.println("动物吃东西");
    }
}
