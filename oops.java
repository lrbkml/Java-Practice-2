class Employee{
int id;
String name;
int salary;
public  void emp_details(){
    System.out.println("My id is "+id);
    System.out.println("My name is "+name);
}
public int getsalary(){
return salary;
}
}

public class oops{
    public static void main(String[] args) {
        
        Employee user1 = new Employee();
        Employee user2  = new Employee();

        user1.id = 01;
        user1.name = "Laraib";
        user1.salary = 88;
        // System.out.printf(user1.id +" "+ user1.name);
         user2.id = 02;
         user2.name = "Kamal";
        user2.salary = 34;

       
        
        user1.emp_details();
        int user_salary = user1.getsalary();
        System.out.println("salary is "+user_salary);
         user2.emp_details();
        user_salary = user2.getsalary();
        System.out.println("salary is "+user_salary);
    }
}