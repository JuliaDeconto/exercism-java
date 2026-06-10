public class NeedForSpeed {

    int distance = 0;
    int battery = 100;
    int speed;
    int batteryDrain;

    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {

        int distance = 800;

        if(battery < batteryDrain)
            return true;
        else
            return false;
    }

    public int distanceDriven() {

        return distance;
    }

    public void drive() {

        if (battery >= batteryDrain) {
            distance += speed;
            battery -=batteryDrain;
        }
    }

    public static NeedForSpeed nitro() {

        return new NeedForSpeed(50, 4);
    }
}

class RaceTrack {

    int distance;

    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {

        int maxDistance = (100 / car.batteryDrain) * car.speed;

        return maxDistance >= distance;
    }
}