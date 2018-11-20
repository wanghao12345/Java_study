package section05.course03;

import java.io.File;
import java.io.IOException;

public class FileTest {
    public static void main(String[] args) {
        File file = new File("C:/Users/wh/Desktop/File", "test.txt");

        if (file.exists()){
//            file.delete();

            String name = file.getName();
            long length = file.length();
            boolean hidden = file.isHidden();


            System.out.println("文件名称：" + name);
            System.out.println("文件长度是：" + length);
            System.out.println("该文件是隐藏文件吗？" + hidden);
        } else {
            try {
                file.createNewFile();
                System.out.println("文件已创建");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
