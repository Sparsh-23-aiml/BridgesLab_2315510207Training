package ride;
public abstract class VehicleRide{
    private String vehicleId;
    private String driverName;
    private double ratePerKm;
    public VehicleRide(String vehicleId,String driverName,double ratePerKm){
        setVehicleId(vehicleId);
        setDriverName(driverName);
        setRatePerKm(ratePerKm);
    }
    public String getVehicleId(){return vehicleId;}
    public void setVehicleId(String vehicleId){if(vehicleId==null||vehicleId.isEmpty()) throw new IllegalArgumentException("Invalid");this.vehicleId=vehicleId;}
    public String getDriverName(){return driverName;}
    public void setDriverName(String driverName){if(driverName==null||driverName.isEmpty()) throw new IllegalArgumentException("Invalid");this.driverName=driverName;}
    public double getRatePerKm(){return ratePerKm;}
    public void setRatePerKm(double ratePerKm){if(ratePerKm<0) throw new IllegalArgumentException("Invalid");this.ratePerKm=ratePerKm;}
    public abstract double calculateFare(double distance);
    public String getVehicleDetails(){return vehicleId+":"+driverName;}
}