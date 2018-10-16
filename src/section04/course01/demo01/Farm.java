package section04.course01.demo01;

public class Farm {
    public static void main(String[] args){
        System.out.println("调用Apple类的harvest()方法的结果：");
        Apple apple = new Apple();
        apple.harvest();

        System.out.println("调用Orange类的harvest()方法的结果：");
        Orange orange = new Orange();
        orange.harvest();


    }
}
