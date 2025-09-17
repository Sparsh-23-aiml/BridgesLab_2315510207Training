package ride;
public class CarRide extends VehicleRide implements GPS{
    public CarRide(String id,String driver,double rate){super(id,driver,rate);}
    public double calculateFare(double distance){return getRatePerKm()*distance;}
    public String getCurrentLocation(){return "LocX";}
    public void updateLocation(String loc){}
}