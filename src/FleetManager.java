
import java.util.ArrayList;

public class FleetManager {
    private ArrayList<Truck> fleet;   // store truck object

    public FleetManager(){
        fleet=new ArrayList<>();
    }
    //1.add truck
    public void addTruck(Truck truck){
        fleet.add(truck);
        System.err.println("Truck Added Successfully");
    }
    //2. Remove a truck by its ID:
    public void removeTruck(String truckid){
        Truck found=getTruck(truckid);
        if(found!=null){
            fleet.remove(found);
            System.err.println("Truck removed: "+truckid);
        }
        else{
            System.err.println("No Truck ID found: "+truckid);
        }
    }
    //3.Update Status of truck:
    public void updateStatus(String truckid,String newstatus){ 
        Truck found=getTruck(truckid);
        if(found!=null){
            found.setStatus(newstatus);
            System.err.println("Status updated to: "+newstatus);
        }
        else{
            System.err.println("Truckid not found: "+truckid);
        }
    }

    //4.update driver of a truck
    public void updateDriver(String truckId, String newDriverName) {
        Truck found = getTruck(truckId);
        if (found != null) {
            found.setDriverName(newDriverName);
            System.out.println("Driver updated to: " + newDriverName);
        } else {
            System.out.println("Truck not found: " + truckId);
        }
    }


     //5. Searching truck by truckid:  // here Truck is return Type of method
        public Truck getTruck(String truckid){
            for(Truck t:fleet){  // for-each    
                if(t.getTruckId().equalsIgnoreCase(truckid)){   // Ignoring Case Sensetive
                    return t;

                }
            }
            return null;

        }

    //6.View all truck:
    public void viewallTrucks(){
        if(fleet.isEmpty()){
            System.err.println("No Trucks found !!!");
        }
        else{
            System.err.println("Current Trucks are: ");
            for(Truck t:fleet){
                t.printDetails();
            }
        }
    }


    

    
}
