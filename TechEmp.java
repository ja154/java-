public class TechEmp extends Emp{
    
    public static void main(String[] args){
        TechEmp te = new TechEmp(); //paird with the superclass Emp
        te.setEmp(301, "Jonte Simpson", 90000.0);
        te.disp();
    }
}
