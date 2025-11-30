import java.util.InputMismatchException;
import java.util.Scanner;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        ParkingLot lot = new ParkingLot();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== PARKING SYSTEM MENU =====");
            System.out.println("1. Enter Vehicle");
            System.out.println("2. Exit Vehicle");
            System.out.println("3. Exit Program");
            System.out.print("Choose: ");

            int choice = 0;
            try {
                choice = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number (1-3).");
                sc.nextLine(); 
                continue;
            }
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter plate number: ");
                    String plate = sc.nextLine();

                    int typeChoice = 0;
                    while (true) {
                        System.out.println("\nSelect Vehicle Type:");
                        System.out.println("1. Motorcycle");
                        System.out.println("2. Car");
                        System.out.println("3. Truck");
                        System.out.print("Choice: ");
                        try {
                            typeChoice = sc.nextInt();
                        } catch (InputMismatchException e) {
                            System.out.println("Invalid input. Please enter a number (1-3).");
                            sc.nextLine();
                            continue;
                        }
                        sc.nextLine(); 
                        if (typeChoice < 1 || typeChoice > 3) {
                            System.out.println("Invalid choice. Please select 1, 2, or 3.");
                            continue;
                        }
                        break;
                    }

                    ParkingLot.VehicleType type;
                    Vehicle v;
                    if (typeChoice == 1) {
                        type = ParkingLot.VehicleType.MOTORCYCLE;
                        v = new Motorcycle(plate);
                    } else if (typeChoice == 2) {
                        type = ParkingLot.VehicleType.CAR;
                        v = new Car(plate);
                    } else {
                        type = ParkingLot.VehicleType.TRUCK;
                        v = new Truck(plate);
                    }

                    lot.enter(plate, v, type);

                    //SIMULATE PARKED HOURS (for testing)
                    int simulatedHours = 0;
                    while (true) {
                        System.out.print("Simulate parked hours for testing? Enter 0 for now: ");
                        try {
                            simulatedHours = sc.nextInt();
                        } catch (InputMismatchException e) {
                            System.out.println("Invalid input. Enter a number.");
                            sc.nextLine();
                            continue;
                        }
                        sc.nextLine();
                        if (simulatedHours < 0) {
                            System.out.println("Hours cannot be negative.");
                            continue;
                        }
                        break;
                    }
                    if (simulatedHours > 0) {
                        lot.setEntryTime(plate, LocalDateTime.now().minusHours(simulatedHours));
                    }
                    break;

                case 2:
                    if (lot.getAllVehicles().isEmpty()) {
                        System.out.println("\nNo vehicles currently inside.");
                        break;
                    }

                    System.out.println("\nVehicles currently inside:");
                    int index = 1;
                    for (String plateNum : lot.getAllVehicles()) {
                        System.out.println(index + ". " + plateNum + " (" + lot.getVehicleType(plateNum) + ")");
                        index++;
                    }

                    int selected = 0;
                    while (true) {
                        System.out.print("Select vehicle number to exit: ");
                        try {
                            selected = sc.nextInt();
                        } catch (InputMismatchException e) {
                            System.out.println("Invalid input. Please enter a valid number.");
                            sc.nextLine();
                            continue;
                        }
                        sc.nextLine(); 
                        if (selected < 1 || selected > lot.getAllVehicles().size()) {
                            System.out.println("Invalid choice. Please select a number from the list.");
                            continue;
                        }
                        break;
                    }

                    String exitPlate = lot.getAllVehicles().get(selected - 1);
                    lot.exit(exitPlate);
                    break;

                case 3:
                    System.out.println("Program ended.");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please select 1, 2, or 3.");
            }
        }
    }
}
