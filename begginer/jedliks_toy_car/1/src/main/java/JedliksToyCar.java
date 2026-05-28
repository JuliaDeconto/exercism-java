public class JedliksToyCar {

    private int distanceDriven = 0;
    private int battery = 100;

    public static JedliksToyCar buy() {

        JedliksToyCar car = new JedliksToyCar();

        return car;
    }

    public String distanceDisplay() {

        return "Driven " + distanceDriven + " meters";

    }

    public String batteryDisplay() {

        if(battery ==0)
            return "Battery empty";

        else
            return "Battery at " + battery + "%";

    }

    public void drive() {

        if(battery > 0) {
            distanceDriven += 20;
            battery -= 1;
        }

    }
}