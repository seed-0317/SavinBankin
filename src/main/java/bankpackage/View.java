package bankpackage;
import java.util.Scanner;

public class View {
    public static void main(String[] args) {
        BusinessLogic b = BusinessLogic.read();
        String user = b.getName();

        Scanner scanner = new Scanner(System.in);
        //String entry = scanner.nextLine();
        int entry = 0;

        System.out.println("Welcome " + user + ".");

        while(entry != 4) {
            System.out.println("Choose from the following options:" + "\n" + "1:Deposit" + "\n" + "2:Withdraw" + "\n" + "3:View Balance" + "\n" + "4:Quit");
            try{
                entry=Integer.parseInt(scanner.nextLine());
            }catch (NumberFormatException e){
                System.out.println("Invalid entry. Use only numbers 1-4.");
            }


            switch(entry) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    entry=Integer.parseInt(scanner.nextLine());
                    b.deposit(entry);
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    entry=Integer.parseInt(scanner.nextLine());
                    b.withdraw(entry);
                    break;
                case 3:
                    System.out.println("Your balance is " + b.getBalance() +".");
                    break;
                case 4:
                    System.out.println("Thank for banking with us.");
                    break;
                //default: System.out.println("Invalid entry.");
            }
        }
        b.write();//writing out JSON file
    }
}


