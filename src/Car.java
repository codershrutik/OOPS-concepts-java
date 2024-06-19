public class Car{

    private String doors;
    private String engine;
    private String driver;
    public int speed;
    public float test;
    public boolean test2;

    public Car(){
        doors = "closed";
        engine = "off";
        driver = "away";
        speed = 0;
    }

    public String getDoors(){
        return doors;
    }

    public void setDoors(String doors){
        this.doors = doors;
    }

    public String getEngine(){
        return engine;
    }

    public void setEngine(){
        this.engine = engine;
    }

    public String getDriver(){
        return driver;
    }

    public void setDriver(String driver){
        this.driver = driver;
    }

    public int getSpeed(){
        return speed;
    }

    public void setDriver(int speed){
        this.speed = speed;
    }

    public String run(){
        if(doors.equals("closed") && engine.equals("on") && driver.equals("seated") && speed>0){
            return "running";
        } else{
            return "not running";
        }
    }
    
}