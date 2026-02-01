public class TechEmp extends Emp{

    int bonus;
    public void setBonus(int bonus){
        this.bonus = bonus;
    }
    
    public void getBonus(){
        System.out.println("Bonus: "+bonus);
    }

    //redefined method from superclass Emp

    public void calSalary(){ //method overriding signature remains same
        int da = 42;
        int hra = 30;
        int ta = 8;

        double grossSalary = getSalary() + (getSalary()*da/100) + (getSalary()*hra/100) + (getSalary()*ta/100) + bonus;
        System.out.println("Gross Salary: "+grossSalary);
    }

    public static void main(String[] args){
        TechEmp te = new TechEmp(); //paird with the superclass Emp
        te.setEmp(301, "Jonte Simpson", 90000.0);
        te.disp();
        te.calSalary();
        te.setBonus(10000);
        te.getBonus();
    }
}
