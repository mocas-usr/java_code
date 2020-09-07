package studentManger;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA
 *
 * @Author: mocas
 * @Date: 2020/4/11 14:39
 * @email: wangyuhang_mocas@163.com
 */
/*主界面的编写*/
public class manger {
//    private static Object ArrayList;

    public static void main(String[] args) {

        /*添加学生对象*/

        ArrayList<student> arr=new ArrayList<student>();


        while (true)
        {
            System.out.println("欢迎来到学生管理系统");
            System.out.println("1.添加学生");
            System.out.println("2.删除学生");
            System.out.println("3.修改学生");
            System.out.println("4.查看所有学生");
            System.out.println("5.退出");
            System.out.println("请输入你的选择");

            /*录入键盘数字*/
            Scanner sc=new Scanner(System.in);
            String line=sc.nextLine();
            /*用switch实现操作*/
            switch (line)
            {
                case "1":
                    System.out.println("添加学生");
                    addStudent(arr);
                    break;
                case "2":
                    System.out.println("删除学生");
                    deletestudent(arr);
                    break;
                case "3":
                    System.out.println("修改学生");
                    changstudent(arr);
                    break;
                case "4":
                    System.out.println("查看所有学生");
                    findall(arr);
                    break;
                case "5":
                    System.out.println("谢谢使用");
                    System.exit(0);         //退出虚拟机
            }

        }


    }

    /*添加学生</>*/
    public static void addStudent(ArrayList<student> array)
    {
        Scanner sc=new Scanner(System.in);
        String sid;


        while (true)
        {
            System.out.println("请输入学号");
            sid=sc.nextLine();
            boolean flag=isUsed(array,sid);
            if (flag)
            {
                System.out.println("请重新输入学号");
            }
            else
            {
                break;
            }
        }



        System.out.println("请输入学生姓名");
        String name=sc.nextLine();
        System.out.println("请输入年龄");
        String age=sc.nextLine();
        System.out.println("请输入地址");
        String address=sc.nextLine();

        /*创建学生*/
        student s=new student();
        s.setAddress(address);
        s.setAge(age);
        s.setName(name);
        s.setSid(sid);
        array.add(s);

    }
    public static void findall(ArrayList<student> arr)
    {

        if (arr.size()==0)
        {
            System.out.println("无信息，请添加信息");
            return;//这里可以不再往下执行
        }
        System.out.println("学号\t/姓名\t/年龄\t/住址\t");
        for (int i=0;i<arr.size();i++)
        {
            student s=arr.get(i);
            System.out.println(s.getSid()+"\t"+s.getName()+"\t"+s.getAge()+"\t"+s.getAddress()+"\t");
        }
    }
    public static void deletestudent(ArrayList<student> arr)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入删除学生的学号");
        String sid=sc.nextLine();

        /*遍历集合将这个学生信息删除*/
        int index=-1;
        for (int i=0;i<arr.size();i++)
        {
            student s=arr.get(i);
            String name=s.getSid();
            if (name.equals(sid))
            {
                arr.remove(i);
                index=i;
                System.out.println("删除学生信息成功");
                break;
            }

        }
        if (index==-1)
        {
            System.out.println("输入学号不存在，请重新输入");
        }
    }
    public  static void changstudent(ArrayList<student> arr)
    {
        System.out.println("请输入修改学号");
        Scanner sc=new Scanner(System.in);
        String sid=sc.nextLine();

        /*遍历集合，修改信息*/
        int index=-1;
        for (int i=0;i<arr.size();i++)
        {
            student s=arr.get(i);
            String findsid=s.getSid();
            if (findsid.equals(sid))
            {

                index=i;
                break;
            }
        }
        if (index==-1)
        {
            System.out.println("输入的学号不存在，请重新输入");
        }
        else
        {
            /*输入新信息*/
            System.out.println("新的名字");
            String name=sc.nextLine();
            System.out.println("新的年龄");
            String age=sc.nextLine();
            System.out.println("新的住址");
            String address=sc.nextLine();

            /*创建新的学生对象*/
            student news=new student();
            news.setSid(sid);
            news.setName(name);
            news.setAge(age);
            news.setAddress(address);
            arr.set(index,news);

        }
    }

    public static  boolean isUsed(ArrayList<student> arr,String sid)
    {
        boolean flag=false;
        for (int i=0;i<arr.size();i++)
        {
            student s=arr.get(i);
            String name=s.getSid();
            if (sid.equals(name))
            {
                flag=true;

            }
        }
        return  flag;
    }
}

