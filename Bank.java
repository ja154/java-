public class Bank extends ATM{

    void withdraw(){

        System.out.println("Withdraw from Bank Successful");

    
    }
    void deposit(){
        System.out.println("Deposit to Bank Successful");
        
    }
    @Override
    void disp(){
        super.disp();
        System.out.println("Iam  Bank");   
    }

    public static void main(String[] args) {
        ATM a1 = new Bank();  // upcasting


        a1.disp();
        a1.withdraw();
        a1.deposit();
    }

    
}