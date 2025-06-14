import strategy.FlyHighBehaviour;
import strategy.FlySpeedBehaviour;
import strategy.GlidFlyBehaviour;

public class Main {
    public static void main(String[] args) {
        Bird hummingBird = new HummingBird(new FlySpeedBehaviour());
        Bird eagle = new Eagle(new FlyHighBehaviour());
        hummingBird.fly();
        eagle.fly();

        hummingBird.flyBehaviour = new GlidFlyBehaviour();
        hummingBird.fly();
    }
}