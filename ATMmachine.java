import java.util.*;
class ATM{
    float Balance;
    int PIN = 1234;

    public void checkpin(){
        System.out.println("Enter your pin : ");
        Scanner sc= new Scanner(System.in);
        int pin= sc.nextInt();
        if(pin==PIN){
            menu();
        }
        else{
            System.out.println("Invalid pin!Try again");
        }
    }
    public void menu(){
        System.out.println("Enter your choice : ");
        System.out.println("1. Check A/C Balance ");
        System.out.println("2. Withdraw Amount ");
        System.out.println("3. Deposit Amount");
        System.out.println("4. Exit");
        Scanner sc= new Scanner(System.in);
        int opt= sc.nextInt();
        if(opt==1){
            checkBalance();
        } else if (opt==2) {
            withdrawAmount();
        } else if (opt==3) {
            depositAmount();
        } else if (opt==4) {
            return;
        }else {
            System.out.println("Enter a valid choice : ");
        }
    }
    public void checkBalance(){
        System.out.println("Balance : " + Balance);
        menu();
    }
    public void withdrawAmount(){
        System.out.println("Enter the amount : ");
        Scanner sc=new Scanner(System.in);
        float amount=sc.nextFloat();
        if(amount>Balance){
            System.out.println("Insufficient funds");
        }else{
            Balance= Balance - amount;
            System.out.println("Amount withdrawn succesfully");
        }
        menu();
    }
    public void depositAmount(){
        System.out.println("Enter the amount : ");
        Scanner sc = new Scanner(System.in);
        float amount= sc.nextFloat();
        Balance = Balance+amount;
        System.out.println("Amount deposited successfully");
        menu();
    }
}
public class ATMmachine {
    public static void main(String[] args){
        ATM obj = new ATM();
        obj.checkpin();
    }
}