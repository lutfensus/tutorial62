package vehicle;

public class VehicleMain {
    public static void main(String[] args) {
        Car myCar = new Car(7);

        System.out.println("Number of seats: " + myCar.getNumberOfSeats());

        myCar.start();
        myCar.stop();
    }
}
