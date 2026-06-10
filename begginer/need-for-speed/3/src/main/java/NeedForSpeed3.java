public class NeedForSpeed3 {

    int distance;
    int battery;
    int speed;
    int batteryDrain;

    NeedForSpeed3(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
        this.battery = 100;
        this.distance = 0;
    }
    public boolean batteryDrained() {

        return (this.battery < this.batteryDrain);
    }
    public int distanceDriven() {
        return this.distance;
    }
    public void drive() {
        if(this.battery >= this.batteryDrain) {
            this.distance += this.speed;
            this.battery -= this.batteryDrain;
        }
    }
    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }
}
class RaceTrack3 {
    int distance;

    RaceTrack3(int distance) {
        this.distance = distance;
    }
    public boolean canFinishRace(NeedForSpeed car) {
        return (100 / car.batteryDrain) * car.speed >= distance;
    }
}
