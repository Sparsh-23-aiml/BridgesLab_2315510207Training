package ride;
public class AutoRide extends VehicleRide implements GPS{
    public AutoRide(String id,String driver,double rate){super(id,driver,rate);}
    public double calculateFare(double distance){return getRatePerKm()*distance*0.7;}
    public String getCurrentLocation(){return "LocZ";}
    public void updateLocation(String loc){}
}