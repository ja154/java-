public class Student{   // fully encapsulated class
	// data members
    private int sid; 
    private String sname; 
    private double gpa; 
    private static String university = "Stanford"; 
	
	// methods setter / mutator - all 
    public void setStudent(int id, String name, double avg){  // local variables - Stack
    	sid = id;
    	sname = name;
        gpa = avg;
    }
    
    // getter / accessor for all
    public void getStudent(){
    	System.out.println(sid+"  "+sname+"  "+gpa+"  "+university);
    }
    // getter for sname
    void getSname(){
    	System.out.println(sname);
    }

}

