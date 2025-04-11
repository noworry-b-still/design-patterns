package C_Singleton;

// Caches, thread pools, registries are examples of objects that should only have a single instance.
public class AirforceOne {
    private static AirforceOne onlyInstance;

    private AirforceOne() {

    }

    public void fly() {
        System.out.println("Airforce one is flying...");
    }

    public static AirforceOne getInstance() {
        if (onlyInstance == null) {
            onlyInstance = new AirforceOne();
        }
        return onlyInstance;

    }
}

class Client {
    public static void main(String[] args) {
        AirforceOne airforceOne = AirforceOne.getInstance();
        airforceOne.fly();
    }
}

// the above works for single-threaded apps.
// for multi-threaded apps, use
// synchronized public static AirforceOne getInstance()
// or
// eager initializations : // The sole instance of the class
// private static AirforceOne onlyInstance = new AirforceOne();

// The problem with the above approaches is that synchronization is expensive
// and static initialization creates the object even if it's not used in a
// particular run of the application.
// If the object creation is expensive then static intialization can cost us
// performance.