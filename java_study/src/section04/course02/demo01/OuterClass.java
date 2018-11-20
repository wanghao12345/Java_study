package section04.course02.demo01;

//成员内部类
public class OuterClass { //外部类
    InnerClass in = new InnerClass();
    public void ouf(){
        in.inf();
    }
    public InnerClass doit(){
        in.y = 4;
        return new InnerClass();
    }

    class InnerClass{ //内部类
        InnerClass(){

        }
        public  void inf(){

        }
        int y = 0;
    }

    public static void main(String [] args){
        OuterClass out = new OuterClass();
        OuterClass.InnerClass in = out.doit();
        OuterClass.InnerClass in2 = out.new InnerClass();
    }


}
