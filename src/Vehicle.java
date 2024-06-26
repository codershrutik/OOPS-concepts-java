

public class Vehicle{
    public String engine;
    public int wheels;
    public int seats;
    public int fuelTank;
    public String lights;

    public Vehicle(){
        engine = "petrol";
        wheels = 2;
        seats = 2;
        fuelTank = 14;
        lights = "LED";
    }

    public Vehicle(String engine, int wheels, int seats, int fuelTank, String lights){
        this.engine = engine;
        this.wheels = wheels;
        this.seats = seats;
        this.fuelTank = fuelTank;
        this.lights = lights;
    }

    public String getEngine(){
        return engine;
    }

    public int getWheels(){
        return wheels;
    }

    public int getSeats(){
        return seats;
    }

    public int getFuelTank(){
        return fuelTank;
    }

    public String getLights(){
        return lights;
    }

    public String toString(){
        return "Vehicle{ "+
        "engine = " + engine + "\'"+
        ", wheels = " + wheels +
        ", seats = " + seats +
        ", feulTank = " + fuelTank +
        ", lights = " + lights + "\'"+
        "}";
    }
    
}