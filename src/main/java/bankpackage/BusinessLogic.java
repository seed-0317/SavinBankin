package bankpackage;

public class BusinessLogic {
    private String name;
    private int balance;
    private DAO dataAccessObject;

    public BusinessLogic(){
        super();
    }
    public BusinessLogic(String name, int balance){
        super();
        this.name=name;
        this.balance=balance;
    }

    public int getBalance() {
        return balance;
    }

    public void withdraw(int withdrawal){
        if(balance>=withdrawal){
            balance-=withdrawal;
        }
        else {
            System.out.println("Invalid withdrawal amount");
        }
    }

    public void deposit (int depositAmount){
        balance+=depositAmount;
        System.out.println("You have deposited $" + depositAmount + ".");
    }

    public void read(){
        this.dataAccessObject = new DAO();
        dataAccessObject.read();
    }

    public void write(){
        dataAccessObject.write();
    }



}
