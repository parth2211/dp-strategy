import strategy.Behaviour;

public class HummingBird extends Bird{

    private String hummingBirdCharacteristics;

    HummingBird(Behaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    @Override
    public void fly() {
        System.out.print("I am flying --- with behaviour"); flyBehaviour.fly();
    }
}
