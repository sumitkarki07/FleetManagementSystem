import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        FleetManager manager=new FleetManager();
        boolean running=true;

        while (running) {
             System.out.println("\n========== Fleet Management System ==========");
            System.out.println("1. Add Truck");
            System.out.println("2. View All Trucks");
            System.out.println("3. Remove Truck by ID");
            System.out.println("4. Update Truck Status");
            System.out.println("5. Update Driver Name");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

            int choice=sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                System.err.println("Enter Truck ID: ");
                String id=sc.nextLine();

                System.err.println("Enter Driver Name: ");
                String driver=sc.nextLine();

                System.err.println("Enter Mileage(KM): ");
                int mileage=sc.nextInt();

                System.err.println("Enter Fuel Level(%):");
                int fuel=sc.nextInt();
                sc.nextLine();

                System.err.println("Enter status (available/In Transit/in Maintenance)");
                String status=sc.nextLine();

                Truck t1=new Truck(id, driver, mileage, fuel, status);
                manager.addTruck(t1);
                break;

                case 2:
                manager.viewallTrucks();
                break;

                case 3:
                    System.out.print("Enter Truck ID to remove: ");
                    String removeId = sc.nextLine();
                    manager.removeTruck(removeId);
                    break;

                case 4:
                    System.out.print("Enter Truck ID to update status: ");
                    String updateId = sc.nextLine();

                    System.out.print("Enter new status: ");
                    String newStatus = sc.nextLine();
                    manager.updateStatus(updateId, newStatus);
                    break;

                case 5:
                    System.out.print("Enter Truck ID to update driver: ");
                    String truckId = sc.nextLine();

                    System.out.print("Enter new driver name: ");
                    String newDriver = sc.nextLine();
                    manager.updateDriver(truckId, newDriver);
                    break;


                case 6:
                    running = false;
                    System.out.println("Exiting... Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        sc.close();
    }
}