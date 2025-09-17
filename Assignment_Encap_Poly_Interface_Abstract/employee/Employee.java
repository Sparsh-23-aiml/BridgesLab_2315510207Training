package employee;
public abstract class Employee{
    private String employeeId;
    private String name;
    private double baseSalary;
    public Employee(String employeeId,String name,double baseSalary){
        setEmployeeId(employeeId);
        setName(name);
        setBaseSalary(baseSalary);
    }
    public String getEmployeeId(){return employeeId;}
    public void setEmployeeId(String employeeId){if(employeeId==null||employeeId.isEmpty()) throw new IllegalArgumentException("Invalid");this.employeeId=employeeId;}
    public String getName(){return name;}
    public void setName(String name){if(name==null||name.isEmpty()) throw new IllegalArgumentException("Invalid");this.name=name;}
    public double getBaseSalary(){return baseSalary;}
    public void setBaseSalary(double baseSalary){if(baseSalary<0) throw new IllegalArgumentException("Invalid");this.baseSalary=baseSalary;}
    public abstract double calculateSalary();
    public void displayDetails(){System.out.println("ID:"+employeeId+" Name:"+name+" Salary:"+calculateSalary());}
}