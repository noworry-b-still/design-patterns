

package C_FactoryMethod;


// There is difference between factory pattern and
// factory method pattern.

// factory pattern just uses something like below:

// class ShapeFactory {
//     public Shape createShape(String type) {
//         if (type.equals("circle")) {
//             return new Circle();
//         } else if (type.equals("square")) {
//             return new Square();
//         }
//         // etc.
//     }
// }

// but factory method apttern uses inheritance or composition like below:
// abstract class ShapeCreator {
//     // Factory method
//     protected abstract Shape createShape();
    
//     // Template method using factory method
//     public void drawShape() {
//         Shape shape = createShape();
//         shape.draw();
//     }
// }

// class CircleCreator extends ShapeCreator {
//     @Override
//     protected Shape createShape() {
//         return new Circle();
//     }
// }


interface IVehicle {
    void drive();
}

interface ICreator {
    IVehicle  createVehicle();
}

class CarCreator implements ICreator {
    @Override
    public IVehicle createVehicle() {
        return new Car();
    }
}

class TruckCreator implements ICreator {
    @Override
    public IVehicle createVehicle() {
        return new Truck();
    }
}
class BikeCreator implements ICreator {
    @Override
    public IVehicle createVehicle() {
        return new Bike();
    }
}

class Car implements IVehicle {

    @Override
    public void drive() {
        System.out.println("Car is driving...");
    }
}

class Truck implements IVehicle {
    @Override
    public void drive() {
        System.out.println("Truck is driving...");
    }
}

class Bike implements IVehicle {
    @Override
    public void drive() {
        System.out.println("Bike is driving...");
    }
}
// Simple/Factory Method via composition
public class P1_Simulator {

    private static IVehicle createVehicleFromInput(String input) {
        ICreator creator;
        if (input.equalsIgnoreCase("Bike")) {
            creator = new BikeCreator();
        } else if (input.equalsIgnoreCase("Truck")) {
            creator = new TruckCreator();
        } else {
            creator = new CarCreator();
        }
        return creator.createVehicle();
    }
    public static void main(String[] args) {
        String input = "Truck";
        IVehicle vehicle = createVehicleFromInput(input);
        vehicle.drive();
    }
}

// Refactor the code using the Factory Pattern so that:
// Simulator doesn’t care if it's a Car, Bike, or Truck.
// You can easily add new vehicle types in the future.


// BEFORE
// class Car {
//     void drive() {
//         System.out.println("Car is driving...");
//     }
// }

// public class Simulator {
//     public static void main(String[] args) {
//         Car car = new Car();
//         car.drive();
//     }
// }


