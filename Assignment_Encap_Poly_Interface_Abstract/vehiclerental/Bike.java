package vehicle;
public class Bike extends Vehicle implements Insurable{
    private double insurance;
    public Bike(String num,double rate,double insurance){
        super(num,"Bike",rate);
        setInsurance(insurance);
    }
    public double getInsurance(){return insurance;}
    public void setInsurance(double insurance){if(insurance<0) throw new IllegalArgumentException("Invalid");this.insurance=insurance;}
    public double calculateRentalCost(int days){return getRentalRate()*days*0.6;}
    public double calculateInsurance(){return insurance;}
    public String getInsuranceDetails(){return "Bike Insurance";}
}