package Prototype;

// F16B Engine variant
public class F16BEngine extends F16Engine {
    public F16BEngine() {
        super("F16B General Electric F110-GE-100", 128.9);
    }

    @Override
    public F16Engine clone() {
        return new F16BEngine();
    }

    @Override
    public void start() {
        System.out.println("Starting F16B engine with improved afterburner");
        super.start();
    }
}