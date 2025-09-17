package vehicle;
public class Car extends Vehicle implements Insurable{
    private double insurance;
    public Car(String num,double rate,double insurance){
        super(num,"Car",rate);
        setInsurance(insurance);
    }
    public double getInsurance(){return insurance;}
    public void setInsurance(double insurance){if(insurance<0) throw new IllegalArgumentException("Invalid");this.insurance=insurance;}
    public double calculateRentalCost(int days){return getRentalRate()*days;}
    public double calculateInsurance(){return insurance;}
    public String getInsuranceDetails(){return "Car Insurance";}
}