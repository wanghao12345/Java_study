package section05.course01.demo01;

import java.util.*;

public class SetDemo {
    public static void main(String [] args){
        List<String> list = new ArrayList<String>();

        list.add("apple");
        list.add("pear");
        list.add("banana");
        list.add("apple");

        Set<String> set = new HashSet<String>();
        set.addAll(list);

        Iterator<String> it = set.iterator();
        System.out.println("集合中的元素是：");
        while (it.hasNext()){
            System.out.print(it.next() + "\t");
        }
    }
}
