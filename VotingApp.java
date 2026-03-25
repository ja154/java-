public class VotingApp {
    
    public void validate(int age) throws InvalidAgeException { 
        if (age < 18) {
            throw new InvalidAgeException("Age " + age + " is too young to vote");
        }
        else {
            System.out.println("Welcome to voting");
        }
    }

        public static void main(String[] args){
            VotingApp v1 = new VotingApp();
            try {
            v1.validate(34);
            v1.validate(14);
        }
        catch (InvalidAgeException e){
            System.out.println("caught an error : " + e.getMessage());
        }
        finally{
            System.out.println("finally block allways gets executed");
        }
        System.out.println("rest of code follows");
    }
}
