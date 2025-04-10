package Prototype;

// F16A Engine variant
public class F16AEngine extends F16Engine {
    public F16AEngine() {
        super("F16A Pratt & Whitney F100-PW-200", 106.0);
    }

    @Override
    public F16Engine clone() {
        return new F16AEngine();
    }

    @Override
    public void start() {
        System.out.println("Starting F16A engine with enhanced fuel efficiency");
        super.start();
    }
}