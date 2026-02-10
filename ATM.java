abstract class ATM {

    double intRate;

    public ATM(double intRate){
        this.intRate = intRate;
    }




    abstract void withdraw();

    abstract void deposit();

    void disp(){
        System.out.println("Welcome to ATM");
    }
    
}
