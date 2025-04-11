package S_Bridge;

interface Color {
    String getColor();
}

class Red implements Color {
    @Override
    public String getColor() {
        return "Red";
    }
}

class Blue implements Color {
    public String getColor() {
        return "Blue";
    }
}

abstract class Shape {
    protected Color color;

    Shape(Color color) {
        this.color = color;
    }

    abstract void draw();
}

class Circle extends Shape {
    Circle(Color color) {
        super(color);
    }

    @Override
    void draw() {
        System.out.println("Drawing " + color.getColor() + " Circle");
    }
}

class Square extends Shape {
    Square(Color color) {
        super(color);
    }

    @Override
    void draw() {
        System.out.println("Drawing " + color.getColor() + " Square");
    }
}

public class P1_DrawingApp_Ans {
    public static void main(String[] args) {
        Shape redCircle = new Circle(new Red());
        Shape blueSquare = new Square(new Blue());

        redCircle.draw();
        blueSquare.draw();
    }
}


// IMPORTANT NOTES TO FUTURE:
// In the Bridge Pattern, the terms abstraction and implementation don’t refer to typical inheritance. They refer to roles in the pattern that help split responsibilities:

// 🔑 Key Idea:
// Abstraction defines the high-level logic, while
// Implementation defines the detail-specific logic the abstraction relies on.

// 🎨 In the Shapes & Colors Example:
// 1. Shape is the Abstraction
// It’s what the client cares about — drawing shapes.

// It uses Color to fill itself, but doesn’t care how the color is defined.

// It's the thing you're extending to add new shapes (e.g., Circle, Square).

// 2. Color is the Implementation
// It defines how the color is applied, i.e., what the actual color is.

// This is the changing part that's plugged into the abstraction.

