import java.util.*;
public class Properties extends Showroom implements utility {
        String prop_name;
        String prop_area;
        String prop_type;
        int prop_price;

        @Override
        public void get_details(){
            System.out.println("NAME: "+prop_name);
            System.out.println("AREA OF THE PROPERTY: "+prop_area);
            System.out.println("PROPERTY TYPE: "+prop_type);
            System.out.println("PRICE: "+prop_price);
        }

        @Override
        public void set_details(){
            Scanner sc = new Scanner(System.in);
            System.out.println("************** ENTER PROPERTY DETAILS *****************");
            System.out.println();
            System.out.print("PROPERTY NAME: ");
            prop_name = sc.nextLine();
            System.out.print(("AREA OF THE PROPERTY: "));
            prop_area = sc.nextLine();
            System.out.print("PROPERTY TYPE(BUNGALOW/FLAT): ");
            prop_type = sc.nextLine();
            System.out.print("PROPERTY PRICE: ");
            prop_price = sc.nextInt();
            sc.nextLine();
            prop_for_rental++;
        }
}
