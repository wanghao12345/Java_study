package section05.course04;

import java.util.ArrayList;
import java.util.List;

public class ThreadList {
    /**
     * 获取根线程组
     * @return
     */
    private static ThreadGroup getRootThreadGroups(){
        ThreadGroup rootGroup = Thread.currentThread().getThreadGroup();
        while (true){
            if (rootGroup.getParent() != null){
                rootGroup = rootGroup.getParent();
            } else {
                break;
            }
        }
        return rootGroup;
    }

    /**
     * 获取给定线程组中所有线程名
     * @param group
     * @return
     */
    public static List<String> getThreads(ThreadGroup group){
        List<String> threadList = new ArrayList<String>();
        Thread[] threads = new Thread[group.activeCount()];

        int count = group.enumerate(threads, false);
        for (int i = 0; i < count; i++){
            threadList.add(group.getName() + "线程组：" + threads[i].getName());
        }
        return threadList;
    }

    /**
     * 获取线程组中子线程组
     * @param group
     * @return
     */
    public static List<String> getThreadGroups(ThreadGroup group){
        List<String> threadList = getThreads(group);
        ThreadGroup[] groups = new ThreadGroup[group.activeGroupCount()];
        int count = group.enumerate(groups, false);

        for (int i = 0; i < count; i++){
            threadList.addAll(getThreads(groups[i]));
        }
        return threadList;
    }

    public static void main(String[] args) {
        for (String string: getThreadGroups(getRootThreadGroups())){
            System.out.println(string);
        }
    }




}
