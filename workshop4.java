/*public class workshop4 {
    public static void main(String[] args) {
        Dog myDog = new Dog("jenish", 3, "husky");
        
        System.out.println("Name: " + myDog.getName());
        System.out.println("Age: " + myDog.getAge());
        System.out.println("Breed: " + myDog.getBreed());
    }
}

class Animal {
    private String name;
    private int age;
    
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
}

class Dog extends Animal {
    private String breed;
    
    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }
    
    public String getBreed() {
        return breed;
    }
}
*/


/* 
import java.lang.Math;
class Shape {
    public double getPerimeter() {
        return 0.0;
    }

    public double getArea() {
        return 0.0;
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}

public class workshop4 {
    public static void main(String[] args) {
        Circle circle = new Circle(3.670);
        System.out.println("Circle Perimeter: " + circle.getPerimeter());
        System.out.println("Circle Area: " + circle.getArea());
    }
}
*/
/* 

class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Animal Name: " + name);
    }
}

class Dog extends Animal {
    private String breed;

    public Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    public void display() {
        super.display();
        System.out.println("Dog Breed: " + breed);
    }
}

public class workshop4 {
    public static void main(String[] args) {
        Dog myDog = new Dog("husky", "husky");
        myDog.display();
    }
}
*/
/*

public class workshop4 {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Buddy", "Labrador");
        dog1.display();
    }
}

class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Name: " + name);
    }
}

class Dog extends Animal {
    String breed;

    public Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Breed: " + breed);
    }
}
*/

/* 
public class workshop4 {
    public static void main(String[] args) {
        Employee employee = new Employee("bibek", "ktm", "ca");
        employee.display();
    }
}

class Person {
    protected String address;

    public Person(String address) {
        this.address = address;
    }
}

class Employee extends Person {
    private String department;

    public Employee(String name, String address, String department) {
        super(address);
        this.department = department;
    }

    public void display() {
        System.out.println("Name: " + address); 
        System.out.println("Department: " + department);
    }
}
*/

/* 
class workshop4 {
    public static void main(String[] args) {
        Child child = new Child();
        child.display();
    }
}

class Parent {
    private int privateVar = 10;
    protected int protectedVar = 20;
    public int publicVar = 30;
}

class Child extends Parent {
    public void display() {
        System.out.println("Protected variable in parent: " + protectedVar);
        System.out.println("Public variable in parent: " + publicVar);
    }
}
 */

 /* 

 class workshop4 {
    public static void main(String[] args) {
        
        FinalClass finalObj = new FinalClass();
        finalObj.display(); 
    }
}

final class FinalClass {
    final void display() {
        System.out.println("This is a final method");
    }
}
*/

/* 

class workshop4 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // Adding two integers
        int result1 = calc.add(5, 8);
        System.out.println("Result of adding two integers: " + result1);

        // Adding three integers
        int result2 = calc.add(10, 15, 20);
        System.out.println("Result of adding three integers: " + result2);

        // Adding two doubles
        double result3 = calc.add(3.5, 2.7);
        System.out.println("Result of adding two doubles: " + result3);

        // Adding three doubles
        double result4 = calc.add(1.1, 2.2, 3.3);
        System.out.println("Result of adding three doubles: " + result4);
    }
}

class Calculator {
    int add(int num1, int num2) {
        return num1 + num2;
    }

    int add(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    double add(double num1, double num2) {
        return num1 + num2;
    }

    double add(double num1, double num2, double num3) {
        return num1 + num2 + num3;
    }
}
*/


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class workshop4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        
        while (choice != 2) {
            System.out.println("Please enter 1 for Sign up.");
            System.out.println("Please enter 2 for Quit.");
            choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    signUp();
                    break;
                case 2:
                    System.out.println("Thank you for using the Application.");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter 1 or 2.");
                    break;
            }
        }
        
        scanner.close();
    }
    
    public static void signUp() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sign Up");
        System.out.print("Enter your full name: ");
        String fullName = scanner.nextLine();
        if (fullName.length() <= 4) {
            System.out.println("Full name must be longer than four characters.");
            return;
        }
        
        System.out.print("Enter your contact number: ");
        String contactNumber = scanner.nextLine();
        if (!isValidContactNumber(contactNumber)) {
            System.out.println("Invalid contact number format. It must have 10 digits starting with 0.");
            return;
        }
        
        System.out.print("Enter your date of birth (DD/MM/YYYY): ");
        String dobString = scanner.nextLine();
        if (!isValidDOB(dobString)) {
            System.out.println("Invalid date of birth format. It must be in the format DD/MM/YYYY or MM/DD/YYYY.");
            return;
        }
        
        LocalDate dob = LocalDate.parse(dobString, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        if (!isOver21(dob)) {
            System.out.println("You must be at least 21 years old to sign up.");
            return;
        }
        
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();
        System.out.print("Confirm your password: ");
        String confirmPassword = scanner.nextLine();
        if (!isValidPassword(password, confirmPassword)) {
            System.out.println("Invalid password format. Password must start with alphabets, followed by either '@' or '&', and end with a numeric value. Password confirmation must match the initial password.");
            return;
        }
        
        System.out.println("Signup successful!");
        
        // Additional logic for saving user information to a database or file can be added here
        
        scanner.close();
    }
    
    public static boolean isValidContactNumber(String contactNumber) {
        return contactNumber.matches("^0\\d{9}$");
    }
    
    public static boolean isValidDOB(String dobString) {
        return dobString.matches("^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/\\d{4}$") || dobString.matches("^(0[1-9]|1[0-2])/(0[1-9]|[12][0-9]|3[01])/\\d{4}$");
    }
    
    public static boolean isOver21(LocalDate dob) {
        LocalDate today = LocalDate.now();
        return today.minusYears(21).isAfter(dob);
    }
    
    public static boolean isValidPassword(String password, String confirmPassword) {
        return password.matches("^[a-zA-Z]+[@&]\\d+$") && password.equals(confirmPassword);
    }
}



