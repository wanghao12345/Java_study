package section05.course02.demo01;

public class ClassNotFoundExceptionDemo {
    private int num = 10;

    public ClassNotFoundExceptionDemo() {
        try {
            Class.forName("com.mingrisoft.Test");
        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        System.out.println("测试。");
    }

    public int getNum(){
        return num;
    }
    public void setNum(int num){
        this.num = num;
    }

    public static void main(String[] args) {
        ClassNotFoundExceptionDemo exam = new ClassNotFoundExceptionDemo();
        exam.setNum(888);
        System.out.println(exam.getNum());
    }

}
