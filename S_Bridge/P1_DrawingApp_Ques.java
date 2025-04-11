package S_Bridge;

// Bad Design - Each shape with each color creates new class

class RedCircle {
    void draw() {
        System.out.println("Drawing Red Circle");
    }
}

class BlueCircle {
    void draw() {
        System.out.println("Drawing Blue Circle");
    }
}

class RedSquare {
    void draw() {
        System.out.println("Drawing Red Square");
    }
}

class BlueSquare {
    void draw() {
        System.out.println("Drawing Blue Square");
    }
}

// Client
public class P1_DrawingApp_Ques {
    public static void main(String[] args) {
        new RedCircle().draw();
        new BlueSquare().draw();
    }
}

