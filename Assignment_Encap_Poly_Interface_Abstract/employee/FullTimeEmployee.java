package employee;
public class FullTimeEmployee extends Employee{
    private double fixedAllowance;
    public FullTimeEmployee(String id,String name,double baseSalary,double fixedAllowance){
        super(id,name,baseSalary);
        setFixedAllowance(fixedAllowance);
    }
    public double getFixedAllowance(){return fixedAllowance;}
    public void setFixedAllowance(double fixedAllowance){if(fixedAllowance<0) throw new IllegalArgumentException("Invalid");this.fixedAllowance=fixedAllowance;}
    public double calculateSalary(){return getBaseSalary()+fixedAllowance;}
}