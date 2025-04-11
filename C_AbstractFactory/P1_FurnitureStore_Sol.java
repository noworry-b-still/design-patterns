package C_AbstractFactory;

// Abstract Product for Chair
interface Chair {
    void sit();
}

// Abstract Product for Sofa
interface Sofa {
    void layDown();
}

// Concrete Product for Modern Chair
class ModernChair implements Chair {
    @Override
    public void sit() {
        System.out.println("Sitting on a modern wooden chair.");
    }
}

// Concrete Product for Modern Sofa
class ModernSofa implements Sofa {
    @Override
    public void layDown() {
        System.out.println("Laying down on a modern wooden sofa.");
    }
}

// Concrete Product for Classic Chair
class ClassicChair implements Chair {
    @Override
    public void sit() {
        System.out.println("Sitting on a classic wooden chair.");
    }
}

// Concrete Product for Classic Sofa
class ClassicSofa implements Sofa {
    @Override
    public void layDown() {
        System.out.println("Laying down on a classic wooden sofa.");
    }
}

// Abstract Factory for Furniture (Chair and Sofa)
interface FurnitureFactory {
    Chair createChair();
    Sofa createSofa();
}

// Concrete Factory for Modern Furniture
class ModernFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }
}

// Concrete Factory for Classic Furniture
class ClassicFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ClassicChair();
    }

    @Override
    public Sofa createSofa() {
        return new ClassicSofa();
    }
}

// Client (Furniture Store)
public class P1_FurnitureStore_Sol {
    public static void main(String[] args) {
        FurnitureFactory modernFactory = new ModernFurnitureFactory();
        FurnitureFactory classicFactory = new ClassicFurnitureFactory();

        // Create modern furniture
        Chair modernChair = modernFactory.createChair();
        Sofa modernSofa = modernFactory.createSofa();

        // Create classic furniture
        Chair classicChair = classicFactory.createChair();
        Sofa classicSofa = classicFactory.createSofa();

        // Use furniture
        modernChair.sit();
        modernSofa.layDown();

        classicChair.sit();
        classicSofa.layDown();
    }
}
