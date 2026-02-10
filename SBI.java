public class SBI implements RBI{// class is implementing the interface RBI

    
    public void withdraw() {
        System.out.println("SBI Withdraw");
    }

    
    public void deposit() {
        System.out.println("SBI Deposit @"+intRate);
    }

    
    public void transfer() {
        System.out.println("SBI Transfer");
    }

    void display(){
        System.out.println("SBI Display");
    }
    public static void main(String[] args) {
        RBI r1 = new SBI(); // upcasting
        r1.deposit();
        r1.withdraw();
        r1.transfer();


        SBI s1 = new SBI(); // downcasting
        s1.display();


    }
    
}
