package bankpackage;

import java.util.Scanner;

public class View {
    public static void main(String[] args) {

        BusinessLogic b = new BusinessLogic();
        b.loadData(); //  ??
        b.read(); //reading from the json file
        b.write(); //writing data to the json file



        // customer promps/inputs
        Scanner scanner = new Scanner(System.in);

        while(true) {

            System.out.print("Enter deposit amount: ");
            int depositAmount = scanner.nextLine();
            System.out.println("Enter withdrawal amount: ");
            int withdrawal=scanner.nextLine();

        }
    }
}


/*






 */