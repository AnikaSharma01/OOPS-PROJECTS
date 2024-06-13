import java.util.*;
public class Showroom implements utility{
    String show_name;
    String show_address;
    int total_emp;
    String manager_name;
    int prop_for_rental=0;

    @Override
    public void get_details(){
        System.out.println("Showroom Name: "+show_name);
        System.out.println("Showroom Address: "+show_address);
        System.out.println("Total Employees working in the showroom currently: "+total_emp);
        System.out.println("Manager's Name: "+manager_name);
        System.out.println("Properties available for rental: "+prop_for_rental);
    }

    @Override
    public void set_details(){
        Scanner sc=new Scanner(System.in);
        System.out.println("******* ENTER SHOWROOM DETAILS ********");
        System.out.println();
        System.out.print("SHOWROOM NAME: ");
        show_name = sc.nextLine();
        System.out.print(("SHOWROOM ADDRESS: "));
        show_address = sc.nextLine();
        System.out.print("MANAGER NAME: ");
        manager_name = sc.nextLine();
        System.out.print("TOTAL NO OF EMPLOYEES: ");
        total_emp = sc.nextInt();
        System.out.print("TOTAL PROPERTIES FOR RENTAL: ");
        prop_for_rental = sc.nextInt();
    }

}
