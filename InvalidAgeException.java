public class InvalidAgeException  extends Exception{

    public InvalidAgeException(String errStr){

        super(errStr);
    }
    
}

class InsufficientFundsException extends Exception{

    public InsufficientFundsException(String errStr){

        super(errStr);
    }
}

