import java.util.*;
class ATM {
    float balance;
    int PIN = 1029;

    public void checkpin() {
        System.out.println("Enter the PIN: ");
        Scanner sc = new Scanner(System.in);
        int pinentered = sc.nextInt();
        if (pinentered == PIN) {
            menu();
        } else {
            System.out.println("Invalid, enter valid PIN");
        }
        checkpin();
    }
    public void menu(){
        System.out.println("Enter you choice:");
        System.out.println("1.Check Balance");
        System.out.println("2.Withdraw Money");
        System.out.println("3.Deposit Money");
        System.out.println("4.Exit");
        Scanner sc=new Scanner(System.in);
        int choice=sc.nextInt();
        if(choice==1){
            checkbalance();
        }
        else if(choice==2){
            withdrawmoney();
        }
        else if(choice==3){
            depositmoney();
        }
        else if(choice==4){
            return;
        }
        else{
            System.out.println("Invalid choice");
        }
    }
    public void checkbalance(){
        System.out.println("Balance: "+balance);
        menu();
    }
    public void withdrawmoney(){
        System.out.println("Enter amount to withdraw: ");
        Scanner sc=new Scanner(System.in);
        float amount=sc.nextFloat();
        if(amount>balance){
            System.out.println("Insufficient Balance");
        }
        else{
            balance-=amount;
            System.out.println("Money withdrawal Successful");
        }
        menu();
    }
    public void depositmoney(){
        System.out.println("Enter money to deposit: ");
        Scanner sc=new Scanner(System.in);
        float amt=sc.nextFloat();
        balance+=amt;
        System.out.println("Money deposited successfully");
        menu();
    }
}
public class ATMMachine {
    public static void main(String[]args){
        ATM obj=new ATM();
        obj.checkpin();
    }
}
