package section03;

public class Course03 {

    public static void main(String [] args){
        Pigeon p = new Pigeon();
        System.out.println(p.color);
    }
    /**
     * 继承：
     *      1.定义
     *          继承是子类拥有父类的成员
     *      2.实现
     *          在Java语言中，继承通过extends关键字来实现
     *          [修饰符] class 子类名 extends 父类名{
     *          }
     */

    public static class Bird{
        String color = "白色";
        String skin = "羽毛";
    }

    public static class Pigeon extends Bird{

    }


}
