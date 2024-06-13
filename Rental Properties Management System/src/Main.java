import java.util.*;
interface utility{
    public void get_details();
    public void set_details();
}
public class Main {
    static void Main_menu(){
        System.out.println();
        System.out.println("************* MAIN MENU ***************");
        System.out.println();
        System.out.println("************* ENTER YOUR CHOICE ***********");
        System.out.println("1].ADD SHOWROOMS \t\t\t 2].ADD EMPLOYEES \t\t\t 3].ADD PROPERTIES");
        System.out.println();
        System.out.println("4].GET SHOWROOMS \t\t\t 5].GET EMPLOYEES \t\t\t 6].GET PROPERTIES");
        System.out.println();
        System.out.println("************** ENTER 0 TO EXIT ******************");

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int choice=100;
        Showroom[] s=new Showroom[10];
        Employees[] e=new Employees[10];
        Properties[] p=new Properties[10];
        int prop_count=0;
        int emp_count=0;
        int showroom_count=0;
        while(choice!=0){
            Main_menu();
            choice=sc.nextInt();
            while(choice!=9 && choice!=0){
                switch (choice) {
                    case 1:
                        s[showroom_count] = new Showroom();
                        s[showroom_count].set_details();
                        showroom_count++;
                        System.out.println();
                        System.out.println("1].ADD NEW SHOWROOM");
                        System.out.println("9].GO BACK TO MAIN MENU");
                        choice = sc.nextInt();
                        break;
                    case 2:
                        e[emp_count] = new Employees();
                        e[emp_count].set_details();
                        emp_count++;
                        System.out.println();
                        System.out.println("2].ADD NEW EMPLOYEE");
                        System.out.println("9].GO BACK TO MAIN MENU");
                        choice = sc.nextInt();
                        break;
                    case 3:
                        p[prop_count] = new Properties();
                        p[prop_count].set_details();
                        prop_count++;
                        System.out.println();
                        System.out.println("3].ADD NEW PROPERTY");
                        System.out.println("9].GO BACK TO MAIN MENU");
                        choice = sc.nextInt();
                        break;
                    case 4:
                        for (int i = 0; i < showroom_count; i++) {
                            s[i].get_details();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9].GO BACK TO MAIN MENU");
                        System.out.println("0].EXIT");
                        choice = sc.nextInt();
                        break;
                    case 5:
                        for (int i = 0; i < emp_count; i++) {
                            e[i].get_details();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9].GO BACK TO MAIN MENU");
                        System.out.println("0].EXIT");
                        choice = sc.nextInt();
                        break;
                    case 6:
                        for (int i = 0; i < prop_count; i++) {
                            p[i].get_details();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9].GO BACK TO MAIN MENU");
                        System.out.println("0].EXIT");
                        choice = sc.nextInt();
                        break;
                    default:
                        System.out.println("ENTER VALID CHOICE: ");
                        break;
                }
            }
        }
    }
}
