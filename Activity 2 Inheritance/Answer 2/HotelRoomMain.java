import java.util.Scanner;

public class HotelRoomMain {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(
                "Hotel Tariff Calculator\n1. Deluxe Room\n2. Deluxe AC Room\n3. Suite AC Room\nSelect Room Type:");
        int choice = s.nextInt();
        if (choice == 1) {
            System.out.println("Hotel Name:");
            String hotelName = s.next();
            System.out.println("\nRoom Square Feet Area");
            int numberOfSqFeet = s.nextInt();
            System.out.println("\nRoom has TV(true/false)");
            boolean hasTV = s.nextBoolean();
            System.out.println("\nRoom has Wifi(true/false)");
            boolean hasWifi = s.nextBoolean();
            DeluxeRoom obj = new DeluxeRoom(hotelName, numberOfSqFeet, hasTV, hasWifi);
            int rate = obj.getRatePerSqFeet();
            obj.calculateTariff(numberOfSqFeet, rate);
        } else if (choice == 2) {
            System.out.println("Hotel Name:");
            String hotelName = s.next();
            System.out.println("\nRoom Square Feet Area");
            int numberOfSqFeet = s.nextInt();
            System.out.println("\nRoom has TV(true/false)");
            boolean hasTV = s.nextBoolean();
            System.out.println("\nRoom has Wifi(true/false)");
            boolean hasWifi = s.nextBoolean();
            DeluxeACRoom obj = new DeluxeACRoom(hotelName, numberOfSqFeet, hasTV, hasWifi);
            int rate = obj.getRatePerSqFeet();
            obj.calculateTariff(numberOfSqFeet, rate);
        } else if (choice == 3) {
            System.out.println("Hotel Name:");
            String hotelName = s.next();
            System.out.println("\nRoom Square Feet Area");
            int numberOfSqFeet = s.nextInt();
            System.out.println("\nRoom has TV(true/false)");
            boolean hasTV = s.nextBoolean();
            System.out.println("\nRoom has Wifi(true/false)");
            boolean hasWifi = s.nextBoolean();
            SuiteACRoom obj1 = new SuiteACRoom(hotelName, numberOfSqFeet, hasTV, hasWifi);
            int rate = obj1.getRatePerSqFeet();
            obj1.calculateTariff(numberOfSqFeet, rate);
        } else {
            System.out.println("Invalid Choice");
        }
    }
}