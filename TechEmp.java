public class TechEmp extends Emp{

    int bonus;
    public TechEmp(int eid, String ename, double salary, int bonus){
        super(eid, ename, salary); //calling superclass constructor
        this.bonus = bonus;
    }
    @Override
    public void disp(){
        super.disp(); //calling superclass method
        System.out.println(bonus);
    }

    //redefined method from superclass Emp
    @Override
    public void calSalary(){ //method overriding signature remains same
        int da = 42;
        int hra = 30;
        int ta = 8;

        double grossSalary = getSalary() + (getSalary()*da/100) + (getSalary()*hra/100) + (getSalary()*ta/100) + bonus;
        System.out.println("Gross Salary: "+grossSalary);
    }

    public static void main(String[] args){
        TechEmp te = new TechEmp(101, "Jay", 50000, 5000);
        te.disp();
        te.calSalary();
}
}
