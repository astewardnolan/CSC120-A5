import java.util.ArrayList;
/**
 * creates train to hold cars and passengers
 */
public class Train {
    private final Engine engine;
    private ArrayList <Car> cars = new ArrayList< >();
    
/**
 * initalizes parameters, adds Car to newCar arraylist
 * @param fuelType type of fuel in Engine of Car
 * @param fuelCapacity fuel capacity of Engine
 * @param nCars number of cars in Train
 * @param passengerCapacity number of passengers in each Car
 */
    public Train(FuelType fuelType, double fuelCapacity, int nCars, int passengerCapacity){
        this.engine= new Engine(fuelType, fuelCapacity);
        this.cars = new ArrayList<Car>();
        int i;
        for (i=0; i < nCars; i ++){

            Car newCar= new Car(passengerCapacity);
            this.cars.add(newCar);
    }
}
    /**
     * accesses engine
     * @return engine
     */
    public Engine getEngine(){
         return this.engine;

         }  
    /**
     * accesses car at specific index in array list
     * @param i index of array list cars
     * @return Car at specific index
     */
    public Car getCar(int i){
        return this.cars.get(i);
        }
    /**
     * adds max capacity of all cars to find max capacity of train
     * @return maximum passengers on train
     */
    public int getMaxCapacity(){
        //int i;
        int maximumCapacity=0;
        for (int i=0; i<this.cars.size(); i++){
            //loop thru each car in array list, need to get capactiy of each car and then add them all together
            maximumCapacity += this.cars.get(i).getCapacity();
        }
        return maximumCapacity;
    }
    /**
     * calculates seats remaining on train by adding all the seats remaining in each Car
     * @return seats left on train
     */
    public int seatsRemaining(){
        int seatsLeft=0;
        for (int i=0; i<this.cars.size(); i++){

            seatsLeft += this.cars.get(i).seatsRemaining();
        }
        return seatsLeft;
    }
    /**
     * prints list of all passengers on train
     */
    public void printManifest(){
        for (int i=0; i<this.cars.size(); i++){
           this.cars.get(i).printManifest();
    }
}
        
    } 


