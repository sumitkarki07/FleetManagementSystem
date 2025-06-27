
public class Truck {
    private String truckid;   // unique key 
    private String driverName;
    private int mileage;
    private int fuelLevel;
    private String status;

    // Constructor
    public Truck(String truckid, String driverName, int mileage, int fuelLevel, String status) {
        this.truckid = truckid;
        this.driverName = driverName;
        this.mileage = mileage;
        this.fuelLevel = fuelLevel;
        this.status = status;
    }

    // Print method
    public void printDetails() {
        System.out.println("Truck ID     : " + truckid);
        System.out.println("Driver Name  : " + driverName);
        System.out.println("Mileage      : " + mileage + " km");
        System.out.println("Fuel Level   : " + fuelLevel + "%");
        System.out.println("Status       : " + status);
        System.out.println("----------------------------------");
    }

    // Setters (fixed names)
    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public void setFuelLevel(int fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // Getters
    public String getTruckId() {
        return truckid;
    }

    public String getDriverName() {
        return driverName;
    }

    public int getMileage() {
        return mileage;
    }

    public int getFuelLevel() {
        return fuelLevel;
    }

    public String getStatus() {
        return status;
    }
}
