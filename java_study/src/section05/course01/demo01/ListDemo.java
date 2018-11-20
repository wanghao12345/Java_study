package section05.course01.demo01;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {
    public static void main(String [] args){
        String a = "A", b = "B", c = "C", d = "D", e = "E";
        List<String> list = new LinkedList<String>();
        list.add(a);
        list.add(a);
        list.add(a);
        list.add(e);
        list.add(d);
        list.add(b);
        list.add(b);
        list.add(b);
        list.add(d);
        list.add(d);
        list.add(d);
        list.add(c);
        list.add(c);
        list.add(d);
        list.add(d);

        Iterator<String> iterator = list.iterator();

        System.out.println("修改前集合中的元素是：");
        while (iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }

        list.set(1, b);
        list.add(2, c);
        Iterator<String> it = list.iterator();
        System.out.println();
        System.out.println("修改后集合中的元素是：");
        while (it.hasNext()){
            System.out.print(it.next() + " ");
        }

        System.out.println();
        System.out.println("A最后出现的位置是：" + list.lastIndexOf("A"));
        System.out.println("D第一次出现的位置是：" + list.indexOf("D"));


    }


}
