package section05.course03;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileStreamTest {
    public static void main(String[] args) {
        File file = new File("C:/Users/wh/Desktop/File", "test.txt");

//        try{
//            FileOutputStream out = new FileOutputStream(file);
//            byte buy [] = "明日科技 Java部".getBytes();
//            out.write(buy);
//            out.close();
//
//        }catch (Exception e){
//            e.printStackTrace();
//        }

        try{
            FileInputStream in = new FileInputStream(file);
            byte byt[] = new byte[888888888];
            int len = in.read(byt);
            System.out.println(len);
            System.out.println("文件中的信息是：" + new String(byt, 0, len));
            in.close();
        }catch (Exception e){

        }



    }

}
