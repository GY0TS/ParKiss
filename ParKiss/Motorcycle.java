public class Motorcycle extends Vehicle {
    public Motorcycle(String plate) {
        super(plate);
    }

    @Override
    public double getBaseRate() {
        return 15;
    }
}
