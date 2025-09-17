package vehicle;
public class Truck extends Vehicle{
    public Truck(String num,double rate){super(num,"Truck",rate);}
    public double calculateRentalCost(int days){return getRentalRate()*days*1.5;}
}