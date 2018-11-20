package section05.course02.demo01;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ThrowExceptionDemo {
    private FileReader read = null;

    public void createFile() throws Exception {
        read = new FileReader("src/Test.java");
        System.out.println("分配内存资源。");
    }

    public void test(){
        try {
            createFile();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("创建IO对象异常。");
        } finally {
            if (read != null){
                try {
                    read.close();
                    System.out.println("释放内存资源。");
                } catch (IOException e) {
                    e.printStackTrace();
                    System.out.println("关闭IO对象异常。");
                }
            }
        }
    }

    public static void main(String[] args) {
        ThrowExceptionDemo demo = new ThrowExceptionDemo();
        demo.test();
    }
}































