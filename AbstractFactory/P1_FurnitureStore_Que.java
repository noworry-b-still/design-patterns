package AbstractFactory;

interface Chair {
    void sit();
}

interface Sofa {
    void layDown();
}

class ModernChair implements Chair {
    @Override
    public void sit() {
        System.out.println("Sitting on a modern chair.");
    }
}

class ModernSofa implements Sofa {
    @Override
    public void layDown() {
        System.out.println("Laying on a modern sofa.");
    }
}

class ClassicChair implements Chair {
    @Override
    public void sit() {
        System.out.println("Sitting on a classic chair.");
    }
}

class ClassicSofa implements Sofa {
    @Override
    public void layDown() {
        System.out.println("Laying on a classic sofa.");
    }
}

public class P1_FurnitureStore_Que {
    public static void main(String[] args) {
        String style = "modern";

        Chair chair;
        Sofa sofa;

        if (style.equals("modern")) {
            chair = new ModernChair();
            sofa = new ModernSofa();
        } else {
            chair = new ClassicChair();
            sofa = new ClassicSofa();
        }

        chair.sit();
        sofa.layDown();
    }
}
