public class Truck extends Vehicle {
    public Truck(String plate) {
        super(plate);
    }

    @Override
    public double getBaseRate() {
        return 100;
    }
}
