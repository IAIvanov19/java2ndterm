public class Main {
    public static void main(String[] args) {
        Car car1 = new Car(12, "ML", "Mercedes");
        Car car2 = new Car(7, "Astra", "Opel");
        Car car3 = new Car(9, "Golf", "VW");
        Car car4 = new Car(10, "Golf", "VW");
        Garage garage = new Garage(car1, car2, car3);
        for (Car car : garage) {
            System.out.println(car.getBrand());
        }
    }
}