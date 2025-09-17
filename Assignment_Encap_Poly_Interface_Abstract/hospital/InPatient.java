package hospital;
public class InPatient extends Patient implements MedicalRecord{
    private double roomCharge;
    public InPatient(String id,String name,int age,double roomCharge){
        super(id,name,age);
        setRoomCharge(roomCharge);
    }
    public double getRoomCharge(){return roomCharge;}
    public void setRoomCharge(double roomCharge){if(roomCharge<0) throw new IllegalArgumentException("Invalid");this.roomCharge=roomCharge;}
    public double calculateBill(){return roomCharge*getAge()*0.1;}
    public void addRecord(String r){}
    public String viewRecords(){return "Records";}
}