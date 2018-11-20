package section04;

public class Course02 {
    public static void main(String[] args){
        /**
         * 内部类：
         *      如果在一个类中再定义一个类，就将在类中再定义的那个类称为内部类。
         *      内部类可以分为成员内部类、局部内部类以及匿名内部类。
         *      在内部类中可以随意使用外部类的成员方法以及成员变量。
         */


        /**
         * 1.成员内部类
         */
        //public class OuterClass { //外部类
        //    private class InnerClass{ //内部类
        //        //....
        //    }
        //}

        /**
         * 2.局部内部类
         *      在类的方法中定义的内部类，它的作用范围也是在这个方法体内
         */
        //public class OuterClass { //外部类
        //    public void outerFn(){
        //        private class InnerClass{ //内部类
        //            //....
        //        }
        //    }
        //}

        /**
         * 3.匿名内部类
         *      其中A表示对象名。
         *      由于匿名内部类没有名称，所以匿名内部类使用默认构造方法来生成匿名内部类的对象
         *      在匿名内部类定义结束后，需要加分号标识，这个分号并不代表定义内部类结束的标识
         *      而代表创建匿名内部类的引用表达式的标识
         */
        //return new A(){
        //    ...//内部类体
        //};




    }
}
