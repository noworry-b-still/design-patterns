package Builder;

class Aircraft {
    private String cockpit;
    private String engine;
    private String wings;
    private String bathroom;

    // Getters and setters
    public void setCockpit(String cockpit) {
        this.cockpit = cockpit;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setWings(String wings) {
        this.wings = wings;
    }

    public void setBathroom(String bathroom) {
        this.bathroom = bathroom;
    }

    // Additional methods as needed
}

// THE PROBLEM EXAMPLE:
// class Aircraft {
// private String cockpit;
// private String engine;
// private String wings;
// private String bathroom; // Optional for passenger aircraft

// // Constructor with all parameters
// public Aircraft(String cockpit, String engine, String wings, String bathroom)
// {
// this.cockpit = cockpit;
// this.engine = engine;
// this.wings = wings;
// this.bathroom = bathroom;
// }

// // Constructor for military aircraft (no bathroom)
// public Aircraft(String cockpit, String engine, String wings) {
// this(cockpit, engine, wings, null);
// }
// }

// Aircraft f16 = new Aircraft("F16 Cockpit", "Jet Engine", "Delta Wings");

// Telescoping constructor problem: As the number of optional parameters
// increases, you'd need an exponential number of constructors.
// Hard to read client code: When creating an object, you see a list of
// parameters without knowing what each one means:
// javaAircraft f16 = new Aircraft("F16 Cockpit", "Jet Engine", "Delta Wings");

// Order-dependent parameters: It's easy to mix up parameters of the same type.
// Inflexible construction process: The construction steps are fixed in the
// constructor, making it difficult to vary the process.
// Difficult to implement a step-by-step construction: You need to provide all
// parameters at once.