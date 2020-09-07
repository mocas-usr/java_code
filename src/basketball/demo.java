package basketball;

/**
 * Created with IntelliJ IDEA
 *
 * @Author: mocas
 * @Date: 2020/4/14 15:18
 * @email: wangyuhang_mocas@163.com
 */
public class demo {
    public static void main(String[] args) {
        pingpangcoach p1 = new pingpangcoach("wanyuhang", 25);
        pingpangplayer p2 = new pingpangplayer("姚明", 18);

        basketballcoach b1 = new basketballcoach("乔丹", 88);
        basketballplayer b2= new basketballplayer("科比", 18);
        System.out.println("乒乓球教练");
        p1.eat();
        p1.speak();
        System.out.println("乒乓球运动员");
        p2.eat();
        p2.speak();
        p2.study();
        System.out.println("篮球教练");
        b1.eat();
        b1.teach();
        System.out.println("篮球运动员");
        b2.eat();
        b2.study();
    }

}
