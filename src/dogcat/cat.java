package dogcat;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

/**
 * Created with IntelliJ IDEA
 *
 * @Author: mocas
 * @Date: 2020/4/13 16:39
 * @email: wangyuhang_mocas@163.com
 */
public class cat extends  animal{
    public cat() {
    }

    public cat(String name, int age) {
        super(name, age);
    }
    public  void  catmove()
    {
        System.out.println("猫捉老鼠");
    }
}
