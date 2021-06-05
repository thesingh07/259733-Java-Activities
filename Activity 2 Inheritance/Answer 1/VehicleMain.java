import java.util.Scanner;
public class VehicleMain {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("1.Four Wheeler\n2.Two Wheeler\nEnter Vehicle Type: ");
        int ch = s.nextInt();
        if (ch == 1) {
            System.out.print("Enter make: ");
            String make = s.next();
            System.out.print("\nEnter Vehicle Number: ");
            String vehicleNumber = s.next();
            System.out.print("\nEnter Fuel Type: \n 1.Diesel \n 2.Petrol");
            int ch1 = s.nextInt();
            String fuelType;
            if (ch1 == 1)
                fuelType = "Diesel";
            else
                fuelType = "Petrol";
            System.out.print("\nEnter Fuel Capacity: ");
            int fuelCapacity = s.nextInt();
            System.out.print("\nEnter CC: ");
            int cc = s.nextInt();
            System.out.print("\nEnter Audio System: ");
            String audioSystem = s.next();
            System.out.print("\nEnter Number of Doors: ");
            int numberOfDoors = s.nextInt();
            FourWheeler obj1 = new FourWheeler(make, vehicleNumber, fuelType, fuelCapacity, cc, audioSystem,
                    numberOfDoors);
            obj1.displayMake();
            obj1.displayBasicInfo();
            obj1.displayDetailInfo();
        } else {
            System.out.print("\nEnter Make: ");
            String make = s.next();
            System.out.print("\nEnter Vehicle Number: ");
            String vehicleNumber = s.next();
            System.out.print("\nEnter Fuel Type: \n 1.Diesel \n 2.Petrol");
            int ch1 = s.nextInt();
            String fuelType;
            if (ch1 == 1)
                fuelType = "Diesel";
            else
                fuelType = "Petrol";
            System.out.print("\nEnter Fuel Capacity: ");
            int fuelCapacity = s.nextInt();
            System.out.print("\nEnter CC: ");
            int cc = s.nextInt();
            System.out.print("\nKickStart");
            boolean kickStartAvailable = s.nextBoolean();
            TwoWheeler obj2 = new TwoWheeler(make, vehicleNumber, fuelType, fuelCapacity, cc, kickStartAvailable);
            obj2.displayMake();
            obj2.displayBasicInfo();
            obj2.displayDetailInfo();
        }
    }
}