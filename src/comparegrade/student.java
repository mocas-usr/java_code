package comparegrade;

/**
 * Created with IntelliJ IDEA
 *
 * @Author: mocas
 * @Date: 2020/4/16 9:42
 * @email: wangyuhang_mocas@163.com
 */
public class student {
    private String name;
    private  int chinese;
    private int math;

    public student() {
    }

    public student(String name, int chinese, int math) {
        this.name = name;
        this.chinese = chinese;
        this.math = math;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChinese() {
        return chinese;
    }

    public void setChinese(int chinese) {
        this.chinese = chinese;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }
    public int getSum(){
        return this.getMath()+this.getChinese();
    }
}
