import java.util.ArrayList;

public class Dealership {
    private ArrayList<Car> listOfCars;

    public Dealership(ArrayList<Car> listOfCars) {
        this.listOfCars = new ArrayList<>();
    }
    public void addCar(Car car) {
        this.listOfCars.add(car);
    }
    public ArrayList<Car> getListOfCars() {
        return listOfCars;
    }
    public int getNrOfCarsByBrand(String brand) {
    return listOfCars.size();
    }
}
