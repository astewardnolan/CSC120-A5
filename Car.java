import java.util.ArrayList;
/**
 * Class which creates Car
 */
public class Car {
    private int Capacity;
    private ArrayList <Passenger> passengersOnBoard = new ArrayList< >(Capacity);
/**
 * Sets the maximum capacity of the car to the given int.
 * @param max maximum int given
 */   
public Car(int max){
    this.Capacity= max;
}
 /**
  * accesses capctiy of Car
  * @return the capacity of the Car
  */   
public int getCapacity() {
    return this.Capacity;
    }
/**
 * calculates seats remaining in Car by subtracting passengers from capacity.
 * @return the seats left in Car
 */
public int seatsRemaining(){
    return this.Capacity - passengersOnBoard.size();
}
/**
 * adds a passenger to the car
 * @param p the passenger
 */
public void addPassenger(Passenger p){
    if (seatsRemaining()>0){
        passengersOnBoard.add(p);
    }
    else {
        throw new RuntimeException("not enough seats!");
    }}
 /**
  * if present, removes a passenger from the car
  * @param p the passenger
  */   
public void removePassenger(Passenger p){
    if (passengersOnBoard.contains(p)){
        passengersOnBoard.remove(p);
    }
    else{
        throw new RuntimeException("Passenger does not exist"); 
    }
    }
/**
 * prints list of all passengers on car
 */
public void printManifest(){
    //this.passengersOnBoard= new ArrayList<Passenger>();
    
    if (seatsRemaining()>0){
        for (int i=0; i<this.passengersOnBoard.size(); i++){
            System.out.println(this.passengersOnBoard.get(i).getName());
        

        }
      
    }
    else{
        System.out.println("This car is EMPTY");
    }
    }
    


/**
 * tests Car methods
 * @param args command line args
 */
    public static void main(String[] args) {
    Car myCar = new Car(10);
    myCar.printManifest();
    Passenger ashby = new Passenger("ashby");
    myCar.addPassenger(ashby);
    Passenger eva = new Passenger("eva");
    myCar.addPassenger(eva);
    myCar.printManifest();


}
}