package section05.course02.demo01;

public class ThrowableDemo {
    public void printBugInfo(){
        try {
            int x = 100;
            int y = 0;
            int z = x / y;
            System.out.println(x + "除以"+ y +"的商是：" + z);
        }catch (Exception e){
            e.printStackTrace();
            //使用getMessage()方法输出异常信息
            System.out.println("getMessage方法：" + e.getMessage());
            //使用getLocalizedMessage方法输出异常信息
            System.out.println("getLocalizedMessage方法：" + e.getLocalizedMessage());
            //使用toString()方法输出异常信息
            System.out.println("toString方法：" + e.toString());
        }

    }

    public static void main(String[] args) {
        ThrowableDemo demo = new ThrowableDemo();
        demo.printBugInfo();
    }
}
