package C_Prototype;

public class F16Engine {
    private String type;
    private double thrustKN;

    public F16Engine() {
        this.type = "General F16 Engine";
        this.thrustKN = 105.0; // Default thrust in kilonewtons
    }

    public F16Engine(String type, double thrustKN) {
        this.type = type;
        this.thrustKN = thrustKN;
    }

    public void start() {
        System.out.println("Starting " + type + " engine with " + thrustKN + " kN thrust");
    }

    public F16Engine clone() {
        return new F16Engine(this.type, this.thrustKN);
    }

    // Getters and setters
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getThrustKN() {
        return thrustKN;
    }

    public void setThrustKN(double thrustKN) {
        this.thrustKN = thrustKN;
    }
}