import java.util.*;
public class Employees extends Showroom implements utility{
    String emp_name;
    int emp_id;
    int age;
    String emp_dep;

    @Override
    public void get_details(){
        System.out.println("Employee Name: "+emp_name);
        System.out.println("Employee ID: "+emp_id);
        System.out.println("Employee age: "+age);
        System.out.println("Department: "+emp_dep);
        System.out.println("Showroom's Name: "+show_name);
    }

    @Override
    public void set_details(){
        Scanner sc=new Scanner(System.in);
        System.out.println();
        System.out.println("******* ENTER EMPLOYEE DETAILS ********");
        System.out.println();
        System.out.print("EMPLOYEE NAME: ");
        emp_name = sc.nextLine();
        System.out.print(("EMPLOYEE ID: "));
        emp_id = sc.nextInt();
        System.out.print("EMPLOYEE AGE: ");
        age= sc.nextInt();
        System.out.print("EMPLOYEE DEPARTMENT: ");
        emp_dep = sc.nextLine();
        System.out.print("SHOWROOM NAME: ");
        show_name= sc.nextLine();
    }
}
