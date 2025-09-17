package hospital;
public abstract class Patient{
    private String patientId;
    private String name;
    private int age;
    public Patient(String patientId,String name,int age){
        setPatientId(patientId);
        setName(name);
        setAge(age);
    }
    public String getPatientId(){return patientId;}
    public void setPatientId(String patientId){if(patientId==null||patientId.isEmpty()) throw new IllegalArgumentException("Invalid");this.patientId=patientId;}
    public String getName(){return name;}
    public void setName(String name){if(name==null||name.isEmpty()) throw new IllegalArgumentException("Invalid");this.name=name;}
    public int getAge(){return age;}
    public void setAge(int age){if(age<0) throw new IllegalArgumentException("Invalid");this.age=age;}
    public abstract double calculateBill();
    public String getPatientDetails(){return patientId+":"+name+":"+age;}
}