package employee;
public class PartTimeEmployee extends Employee{
    private int hours;
    private double hourlyRate;
    public PartTimeEmployee(String id,String name,double baseSalary,int hours,double hourlyRate){
        super(id,name,baseSalary);
        setHours(hours);
        setHourlyRate(hourlyRate);
    }
    public int getHours(){return hours;}
    public void setHours(int hours){if(hours<0) throw new IllegalArgumentException("Invalid");this.hours=hours;}
    public double getHourlyRate(){return hourlyRate;}
    public void setHourlyRate(double hourlyRate){if(hourlyRate<0) throw new IllegalArgumentException("Invalid");this.hourlyRate=hourlyRate;}
    public double calculateSalary(){return getBaseSalary() + hours*hourlyRate;}
}