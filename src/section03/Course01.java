package section03;


import section03.bage.Employee;

public class Course01 {
    public static void main(String [] args){
        /**
         * 类对象
         */


        Employee em = new Employee("wanghao",12.212D,2018,10,15);
        System.out.println(em.getName());

        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Carl Cracker1",7500,2018,10,15);
        staff[1] = new Employee("Carl Cracker2",8500,2018,10,15);
        staff[2] = new Employee("Carl Cracker3",9500,2018,10,15);

        for (Employee e: staff){
            e.raiseSalary(5);
        }

        for (Employee e: staff){
            System.out.println("name=" + e.getName() + ", salary=" + e.getSalary() + ", hireDay=" + e.getHireDay());
        }
    }
}
