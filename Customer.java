public class Customer{
    private int cid;
    private String cname;
    private static String bankName = "ABC Bank";
    
    private Account account; // refferencing the Account class as an instance variable
    public Customer(int cid, String cname, Account account){
        this.cid = cid;
        this.cname = cname;
        this.account = account;
    }

    public void disp(){
        System.out.println(cid+"  "+cname+"  "+bankName);
        account.getAccount(); // Display associated account details
    }

    //main method
    public static void main(String[] args){

        Account a1 = new Account(101, "Savings", 5000.0);
        Customer c1 = new Customer(1, "John Doe", a1);
        c1.disp();

    }
}