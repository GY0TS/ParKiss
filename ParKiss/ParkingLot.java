import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.time.Duration;
import java.time.format.DateTimeFormatter;

public class ParkingLot {

    private HashMap<String, Vehicle> vehicles = new HashMap<>();
    private HashMap<String, ParkingRecord> records = new HashMap<>();
    private HashMap<String, VehicleType> types = new HashMap<>();

    private Vehicle[] parkedArray = new Vehicle[100];

    private static final DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");

    public enum VehicleType {
        CAR, MOTORCYCLE, TRUCK
    }

    public void enter(String plate, Vehicle v, VehicleType type) {
        if (vehicles.containsKey(plate)) {
            System.out.println("Error: Vehicle already inside.");
            return;
        }

        vehicles.put(plate, v);
        records.put(plate, new ParkingRecord(plate));
        types.put(plate, type);

        for (int i = 0; i < parkedArray.length; i++) {
            if (parkedArray[i] == null) {
                parkedArray[i] = v;
                break;
            }
        }

        double baseFee = v.getBaseRate();
        System.out.println("\n--- ENTRY RECEIPT ---");
        System.out.println("Plate: " + plate);
        System.out.println("Time In: " + records.get(plate).getEntryTime().format(timeFormatter));
        System.out.println("Vehicle Type: " + type);
        System.out.printf("Fee: P%.2f\n", baseFee);
        System.out.println("Reminder: Exceeding 3 hours will incur an additional base fee.");
        System.out.println("---------------------\n");
    }

    public void setEntryTime(String plate, java.time.LocalDateTime time) {
        if (records.containsKey(plate)) {
            records.get(plate).setEntryTime(time);
        }
    }

    public void exit(String plate) {
        if (!vehicles.containsKey(plate)) {
            System.out.println("Error: Vehicle not inside.");
            return;
        }

        ParkingRecord r = records.get(plate);
        r.recordExitTime();

        for (int i = 0; i < parkedArray.length; i++) {
            if (parkedArray[i] != null && parkedArray[i].plate.equals(plate)) {
                parkedArray[i] = null;
                break;
            }
        }

        Duration duration = Duration.between(r.getEntryTime(), r.getExitTime());
        long totalMinutes = duration.toMinutes();
        long hours = totalMinutes / 60;
        long minutes = totalMinutes % 60;

        double baseRate = vehicles.get(plate).getBaseRate();
        int blocks = (int) Math.ceil(totalMinutes / 180.0);
        double totalFee = blocks * baseRate;

        double additionalFee = 0;
        if (blocks > 1) {
            additionalFee = (blocks - 1) * baseRate;
        }

        if (totalMinutes > 180) {
            System.out.println("\n--- FULL EXIT RECEIPT ---");
            System.out.println("Plate: " + plate);
            System.out.println("Time In: " + r.getEntryTime().format(timeFormatter));
            System.out.println("Time Out: " + r.getExitTime().format(timeFormatter));
            System.out.println("Total Parked: " + hours + "h " + minutes + "m");
            System.out.printf("Total Fee: P%.2f\n", totalFee);
            if (additionalFee > 0) {
                System.out.printf("Additional Fee for extra hour(s): P%.2f\n", additionalFee);
            }
            System.out.println("-------------------------\n");
        } else {
            System.out.println("Vehicle exited within 3 hours. No full receipt generated.");
        }

        vehicles.remove(plate);
        records.remove(plate);
        types.remove(plate);
    }

    public boolean isInside(String plate) {
        return vehicles.containsKey(plate);
    }

    public ParkingRecord getRecord(String plate) {
        return records.get(plate);
    }

    public Vehicle getVehicle(String plate) {
        return vehicles.get(plate);
    }

    public List<String> getAllVehicles() {
        return new ArrayList<>(vehicles.keySet());
    }

    public VehicleType getVehicleType(String plate) {
        return types.get(plate);
    }
}
