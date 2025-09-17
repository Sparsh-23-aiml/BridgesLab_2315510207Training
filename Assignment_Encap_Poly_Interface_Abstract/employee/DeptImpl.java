package employee;
public class DeptImpl implements Department{
    private String dept;
    public void assignDepartment(String dept){this.dept=dept;}
    public String getDepartmentDetails(){return dept;}
}