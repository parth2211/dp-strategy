import strategy.Behaviour;

public class Eagle extends Bird{

    private String eagleCharacterictics;

    Eagle(Behaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    @Override
    public void fly() {
        System.out.print("My fly behaviour --- "); flyBehaviour.fly();
    }
}
