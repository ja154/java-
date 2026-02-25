public class Bank extends ATM{

    int cashback; //child class specific variable

    public Bank(double intRate, int cashback) {
        super(intRate); // calling parent class constructor
        this.cashback = cashback; // initializing child class variable
    }

    void withdraw(){

        System.out.println("Withdraw from Bank Successful");
        System.out.println("Congrats You got Cashback: " + cashback);

    
    }
    void deposit(){
        System.out.println("Deposit to Bank Successful");
        System.out.println("Congrats You got interest : " + intRate);
        
    }
    @Override
    void disp(){
        super.disp();
        System.out.println("Iam  Bank");   
    }

    public static void main(String[] args) {
        ATM a1 = new Bank(8.5,30);  // upcasting from the Atm class to the Bank class


        a1.disp();
        a1.withdraw();
        a1.deposit();

        Bank b1 = new Bank(10.5,50); // creating object of child class
        b1.disp();
    }

    
}