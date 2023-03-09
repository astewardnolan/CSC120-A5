/**
 * creates passenger
 */
public class Passenger {
    
    private String name;

    /**
     * creates passenger name as string
     * @param name passengers string name
     */
    public Passenger(String name) {
        this.name = name;
    }
    /**
     * accesses passenger name
     * @return passenger name
     */
    public String getName(){
        return this.name;
    }
    /**
     * add passenger to Car, execption if Car is full
     * @param c specific Car passenger added to
     */
    public void boardCar(Car c){
        try {
            while (true) {
                c.addPassenger(this);
            }
        } catch (Exception e) {
            System.err.println(e.getMessage()); // not enough seats
        }
        
    }
    /**
     * removes passenger from Car, exeption if passenger not on Car
     * @param c specific Car passenger removed from
     */
    public void getOffCar(Car c){
        try {
            while (true) {
                c.removePassenger(this);
            }
        } catch (Exception e) {
            System.err.println(e.getMessage()); // passenger not found
        }
        
    }

    public static void main(String[] args) {
        Car myCar = new Car(10);
        myCar.printManifest();
        Passenger ashby = new Passenger("ashby");
        myCar.addPassenger(ashby);
        myCar.printManifest();
    
    }
}



