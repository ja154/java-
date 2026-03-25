public class VotingApp {
    
    static void validate(int age) throws InvalidAgeException { 
        if (age < 18) {
            throw new InvalidAgeException("Age " + age + " is too young to vote");
        }
        else {
            System.out.println("Welcome to voting");
        }
    }

        public static void main(String[] args){
            try {

            validate(34);
            validate(14);
        }
        catch (InvalidAgeException e){
            System.out.println("caught an error : " + e.getMessage());
        } 
    }
}
