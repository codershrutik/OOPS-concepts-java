public class Bike extends Vehicle{
    private String handle;

    public Bike(){
        handle = "Short";
    }

    public String getHandle(){
        return handle;
    }

    public Bike(String engine, int wheels, int seats, int fuelTank, String lights, String handle){
        super(engine, wheels, seats, fuelTank, lights);
        this.handle = handle;
    }

    public String toString(){
        return "Bike {" +
            "handle = " + handle + "\'"+
            "}";
    }
}