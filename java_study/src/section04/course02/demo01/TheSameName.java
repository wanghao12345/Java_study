package section04.course02.demo01;

public class TheSameName {
    private int x;
    private class Inner{
        private int x = 9;
        public void doit(int x){
            x++; //调用的是形参x
            this.x++; //调用内部类的变量x
            TheSameName.this.x++; //定义外部类的变量x
        }
    }
}
