import java.time.LocalDateTime;

public class ParkingRecord {
    private String licensePlate;
    private LocalDateTime entryTime;
    private LocalDateTime exitTime;

    public ParkingRecord(String licensePlate) {
        this.licensePlate = licensePlate;
        this.entryTime = LocalDateTime.now();
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public LocalDateTime getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(LocalDateTime time) {
        this.entryTime = time;
    }

    public void recordExitTime() {
        this.exitTime = LocalDateTime.now();
    }

    public LocalDateTime getExitTime() {
        return exitTime;
    }
}
