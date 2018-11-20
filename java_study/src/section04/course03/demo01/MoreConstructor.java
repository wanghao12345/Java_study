package section04.course03.demo01;

public class MoreConstructor {
    String s;
    int i, i2, i3;
    private MoreConstructor(){ //不带参数的构造方法

    }
    protected MoreConstructor(String s, int i){ // 带两个参数的构造方法
        this.s = s;
        this.i = i;
    }
    public MoreConstructor(String... strings) throws NumberFormatException{
        if (0 < strings.length)
            i = Integer.valueOf(strings[0]);
        if (1 < strings.length)
            i2 = Integer.valueOf(strings[2]);
        if (2 < strings.length)
            i3 = Integer.valueOf(strings[3]);
    }
    public void print(){
        System.out.println("s=" + s);
        System.out.println("i=" + i);
        System.out.println("i2=" + i2);
        System.out.println("i3=" + i3);

    }

}
