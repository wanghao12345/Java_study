package section04.course01.demo01;

abstract class Fruit {
    public String color;
    //构造方法
    public Fruit(){
        color = "绿色";
    }
    //定义抽象方法
    public abstract void harvest();
}
