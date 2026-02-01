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
    public double getSalary(){
        return salary;
    }
    public void disp(){
        System.out.println(eid+"  "+ename+"  "+salary+"  "+companyName);
    }
    public void calSalary(){
        int da = 42;
        int hra = 30;
        int ta = 8;

        double grossSalary = salary + (salary*da/100) + (salary*hra/100) + (salary*ta/100);
        System.out.println("Gross Salary: "+grossSalary);
    }
}
    
