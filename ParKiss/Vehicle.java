import java.time.Duration;

public abstract class Vehicle {
    protected String plate;

    public Vehicle(String plate) {
        this.plate = plate;
    }

    public double calculateFee(ParkingRecord record) {
        if (record.getExitTime() == null) {
            System.out.println("Error: Exit time not recorded.");
            return 0;
        }

        long minutes = Duration.between(record.getEntryTime(), record.getExitTime()).toMinutes();
        int blocks = (int) Math.ceil(minutes / 180.0);
        blocks = Math.max(blocks, 1);
        return blocks * getBaseRate();
    }

    public abstract double getBaseRate();
}
