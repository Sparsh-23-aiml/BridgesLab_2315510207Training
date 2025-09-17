package hospital;
public class OutPatient extends Patient implements MedicalRecord{
    private double consultationFee;
    public OutPatient(String id,String name,int age,double consultationFee){
        super(id,name,age);
        setConsultationFee(consultationFee);
    }
    public double getConsultationFee(){return consultationFee;}
    public void setConsultationFee(double consultationFee){if(consultationFee<0) throw new IllegalArgumentException("Invalid");this.consultationFee=consultationFee;}
    public double calculateBill(){return consultationFee;}
    public void addRecord(String r){}
    public String viewRecords(){return "Records";}
}