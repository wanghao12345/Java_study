package section05.course03;

import java.io.*;

public class BufferTest {
    public static void main(String[] args) {
        String content[] = {"明日科技", "Java部", "快速入门"};
        File file = new File("C:/Users/wh/Desktop/File", "test.txt");

        try {
            FileWriter fw = new FileWriter(file);
            BufferedWriter bufw = new BufferedWriter(fw);

            for (int k = 0; k < content.length; k++){
                bufw.write(content[k]);
                bufw.newLine();
            }
            bufw.close();
            fw.close();

        }catch (Exception e){
            e.printStackTrace();
        }

        try {
            FileReader fr = new FileReader(file);
            BufferedReader bufr = new BufferedReader(fr);
            String s = null;
            int i = 0;

            while ((s = bufr.readLine()) != null){
                i++;
                System.out.println("第"+i+"行：" + s);
            }

            bufr.close();
            fr.close();

        } catch (Exception e) {
            e.printStackTrace();
        }


    }



}
