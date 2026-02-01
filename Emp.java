public class Emp{
    
    private int eid;
    private double salary;
    private String ename;
    private static String companyName = "Jaba Corp";

    public void setEmp(int eid, String ename, double salary){
        this.eid = eid;
        this.ename = ename;
        this.salary = salary;
    }
    public void disp(){
        System.out.println(eid+"  "+ename+"  "+salary+"  "+companyName);
    }
}
    
