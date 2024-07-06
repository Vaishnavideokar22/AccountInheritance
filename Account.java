class BankAccount{
    int BankBalance = 9999;
    public void deposit(){
        System.out.println("Hello from Deposit Method");
    }
    public void withdraw(){
        System.out.println("Hello from Withdraw method");
    }
}
class SavingsAccount extends BankAccount{
     int balance = 99;
    public void withdraw(){
        if(balance<99){
            System.out.println("You can not withdraw cash");
        }
            else{
              System.out.println("your money has been withdraw");
            }
 }
}

public class Account {
    public static void main(String[] args) {

     SavingsAccount s1 = new SavingsAccount();
     s1.withdraw();
}
    
}
