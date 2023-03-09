/**
 * Class engine, will build car engine
 */
public class Engine {

    private FuelType f;
    private double currentFuelLevel;
    private double maxFuelLevel;

    /**
     * acesses fuel type
     * @return fuel type
     */
    public FuelType getf(){
        return this.f;
    }
    /**
     * accesses current fuel level
     * @return current fuel level
     */
    public double getcurrentFuelLevel(){
        return this.currentFuelLevel;
    }
    /**
     * accesses maximum fuel level
     * @return max fuel level
     */
    public double getmaxFuelLevel(){
        return this.maxFuelLevel;
    }
    /**
    * sets the current fuel level equal to the maximum fuel level
    */
    public void refuel(){
        this.currentFuelLevel= maxFuelLevel;
    }
    /**
     * prints current fuel level, or execpetion if Engine out of fuel
     */
    public void go(){
        if (this.currentFuelLevel>0){
            this.currentFuelLevel -= 10.0;
            System.out.println("Current fuel level i "+ currentFuelLevel);
    }   else {
            throw new RuntimeException("Out of fuel!");

    }
        }
    

//constructior within the class
/**
 * initalizes fuel type, current fuel level and max fuel
 * @param f the type of fuel
 * @param fuel the current fuel level
 */
public Engine (FuelType f, double fuel){
    this.f=f;
    this.currentFuelLevel=fuel;
    this.maxFuelLevel=fuel;
    }


    //use to test!!!!!
    /**
     * tests Engine go method
     * @param args in command line
     */
    public static void main(String[] args) {
        Engine myEngine = new Engine(FuelType.ELECTRIC, 100.0);
        try {
            while (true) {
                myEngine.go();
            }
        } catch (Exception e) {
            System.err.println(e.getMessage()); // Out of fuel
        }
    }
}