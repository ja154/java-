public class Account{

    private int accNo;
    private String accType;
    private double accBalance;

    public Account(int accNo, String accType, double accBalance){
        this.accNo = accNo;
        this.accType = accType;
        this.accBalance = accBalance;

    }
    public void getAccount(){
        System.out.println(accNo+"  "+accType+"  "+accBalance);
    }
}
