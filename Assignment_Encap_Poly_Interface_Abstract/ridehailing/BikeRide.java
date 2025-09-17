package ride;
public class BikeRide extends VehicleRide implements GPS{
    public BikeRide(String id,String driver,double rate){super(id,driver,rate);}
    public double calculateFare(double distance){return getRatePerKm()*distance*0.8;}
    public String getCurrentLocation(){return "LocY";}
    public void updateLocation(String loc){}
}