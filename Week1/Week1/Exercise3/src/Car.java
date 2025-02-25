public class Car {
    private String brand;
    private String licensePlate;
    private double tankSize;
    private double fuelLevel;
    private double fuelConsumption;
    private double mileage;

    public Car(String brand, String licensePlate, double tankSize, double fuelLevel, double fuelConsumption, double mileage) {
        this.brand = brand;
        this.licensePlate = licensePlate;
        this.tankSize = tankSize;
        this.fuelLevel = fuelLevel;
        this.fuelConsumption = fuelConsumption;
        this.mileage = mileage;
    }


    public void drive(int km) {
        if (fuelLevel<0) {
            System.err.println("Fuel level should be greater than )");
        }else{
            fuelLevel +=litres;
        }
        this.brand = brand;
    }
  public String getBrand(){
        return brand;
  }
    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", licensePlate='" + licensePlate + '\'' +
                ", tankSize=" + tankSize +
                ", fuelLevel=" + fuelLevel +
                ", fuelConsumption=" + fuelConsumption +
                ", mileage=" + mileage +
                '}';
    }
}


