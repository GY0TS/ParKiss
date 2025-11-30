public class Car extends Vehicle {
    public Car(String plate) {
        super(plate);
    }

    @Override
    public double getBaseRate() {
        return 30;
    }
}
