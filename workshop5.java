/* 
public abstract class Shape {
    public abstract void calculateArea();
    
    public abstract void calculatePerimeter();
}
*/

/* 
abstract class Vehicle {
    public abstract void wheel();

    public abstract void door();
}

class Bus extends Vehicle {
    public void wheel() {
        System.out.println("Bus has wheels.");
    }

    public void door() {
        System.out.println("Bus has doors.");
    }
}

public class main {
    public static void main(String[] args) {
        Bus myBus = new Bus();

        myBus.wheel();
        myBus.door();
    }
}
*/

/* 

abstract class Shape {
    public abstract void calculateArea();
    public abstract void calculatePerimeter();
}

class Quadrilateral extends Shape {
    public void calculateArea() {
        System.out.println("Calculating area of Quadrilateral...");
    }

    public void calculatePerimeter() {
        System.out.println("Calculating perimeter of Quadrilateral...");
    }
}

public class workshop5 {
    public static void main(String[] args) {
        Quadrilateral quadrilateral = new Quadrilateral();
        quadrilateral.calculateArea();
        quadrilateral.calculatePerimeter();
    }
}
*/
/* 
public class Cow implements Animal, Printable {
    
    @Override
    public void eat() {
        System.out.println("Cow is eating grass");
    }

    @Override
    public void walk() {
        System.out.println("Cow is walking slowly");
    }

    @Override
    public void display() {
        System.out.println("Cow is a domestic animal");
    }

}
*/

/* 
public class workshop5

interface LivingBeing {
    void specialFeature();
}

public class Fish implements LivingBeing {
    @Override
    public void specialFeature() {
        System.out.println("Fish lives in water.");
    }
}

public class Bird implements LivingBeing {
    @Override
    public void specialFeature() {
        System.out.println("Birds fly in sky.");
    }
}
*/
/* 
public class workshop5 {
    public static void main(String[] args) {
        try {
            System.out.println(10 / 0);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: Division by zero is not allowed.");
        }
    }
}
*/


public class workshop5 {
    public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
        int[] age = {10, 20, 25, 24, 28, 27, 30, 31, 32};
        System.out.println(age[9]);
    }
}