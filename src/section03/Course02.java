package section03;

public class Course02 {

    public static void main(String [] args){
        Cire c = new Cire();
        System.out.println(c.getArea(3));
    }
    /**
     * 接口：
     *      1.功能：
     *          Java语言只支持单重继承，不支持多重继承，即一个类只能有一个父类。为了解决多重继承，Java
     *          语言提供了接口来实现类的多重继承功能。
     *      2.定义：
     *          使用interface来定义一个接口，接口定义与类的定义类似，也是分为接口的声明和接口体，其中接口体
     *          由变量定义和方法定义两部分组成。
     *      3.基本语法格式：
     *          [修饰符] interface 接口名 [extends 父接口名列表]{
     *              [public] [static] [final] 变量;
     *              [public] [abstract] 方法;
     *          }
     */


    //定义接口ICalculate
    public interface ICalculate {
        final float PI = 3.14f;
        float getArea(float r);
        float getCircumference(float r);
    }
    //实现接口ICalculate

    public static class Cire implements ICalculate {
        @Override
        public float getArea(float r) {
            return PI * r * r;
        }
        @Override
        public float getCircumference(float r) {
            return 2 * PI * r;
        }
    }











}

