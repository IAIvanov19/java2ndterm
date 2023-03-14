public class Car {
    private String brand;
    private String model;
    private int age;
    private int km;

    public Car(String brand, String model, int age, int km) {
        this.brand = brand;
        this.model = model;
        this.age = age;
        this.km = km;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }
}
