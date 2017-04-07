package bankpackage;

public class BusinessLogic {
    private String name;
    private int balance;
    private static DAO dataAccessObject= new DAO();

    public BusinessLogic(){
        super();
    }
    public BusinessLogic(String name, int balance){
        super();
        this.name=name;
        this.balance=balance;
    }
    public void setName(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BusinessLogic that = (BusinessLogic) o;

        if (balance != that.balance) return false;
        return name != null ? name.equals(that.name) : that.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + balance;
        return result;
    }

    public int getBalance() {
        return balance;
    }

    public void withdraw(int withdrawal){
        if(balance>=withdrawal){
            balance-=withdrawal;
            System.out.println("Your balance is $" + balance + ".");
        }
        else {
            System.out.println("Invalid withdrawal amount");
        }
    }

    public void deposit (int depositAmount){
        balance+=depositAmount;
        System.out.println("You have deposited $" + depositAmount + ". Your balance is $" + balance + ".");
    }

    public static BusinessLogic read() {

        try {

            return dataAccessObject.read();
        } catch (Throwable e) {
            e.printStackTrace();
        }
        return new BusinessLogic();
    }

    public boolean write(){

        try{
            dataAccessObject.write(this);
            return true;
        }catch(Throwable e){
            e.printStackTrace();
            //return false;
        }
        return false;
    }

    @Override
    public String toString() {
        return "BusinessLogic{" +
                "name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
