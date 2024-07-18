//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Circle Tests
        Circle circle = new Circle(5.0);
        System.out.println("Circle Area: " + circle.calculateArea()); // Output: Circle Area: 78.53981633974483
        System.out.println("Circle Circumference: " + circle.calculateCircumference()); // Output: Circle Circumference: 31.41592653589793

        // Rectangle Tests
        Rectangle rectangle = new Rectangle(4.0, 6.0);
        System.out.println("Rectangle Area: " + rectangle.calculateArea()); // Output: Rectangle Area: 24.0
        System.out.println("Rectangle Circumference: " + rectangle.calculateCircumference()); // Output: Rectangle Circumference: 20.0

        // Triangle Tests
        Triangle triangle = new Triangle(5, 6);
        System.out.println("Triangle Area: " + triangle.calculateArea()); // Output: Triangle Area: 15.0
        System.out.println("Triangle Circumference: " + triangle.calculateCircumference()); // Output: Triangle Circumference: 18.09859472366946
//        Circle circle = new Circle(5.0);
//
//        double radius = circle.getRadius();
//        System.out.println("Radius of the circle: " + radius);
//
//        double area = circle.calculateArea();
//        System.out.println("Area of the circle: " + area);
//
//        double circumference = circle.calculateCircumference();
//        System.out.println("Circumference of the circle: " + circumference);
//        circle.setRadius(7.5);
//        area = circle.calculateArea();
//        circumference = circle.calculateCircumference();
//        System.out.println("Area of the circle with new radius: " + area);
//        System.out.println("Circumference of the circle with new radius: " + circumference);
//
//        System.out.println("*************************************************");
//        Triangle triangle = new Triangle(5.0, 8.0);
//        double height = triangle.getHeight();
//        double base = triangle.getBase();
//        System.out.println("Height of the triangle: " + height);
//        System.out.println("Base of the triangle: " + base);
//         area = triangle.calculateArea();
//        System.out.println("Area of the triangle: " + area);
//         circumference = triangle.calculateCircumference();
//        System.out.println("Circumference of the triangle: " + circumference);
//        triangle.setHeight(7.0);
//        triangle.setBase(10.0);
//        area = triangle.calculateArea();
//        circumference = triangle.calculateCircumference();
//        System.out.println("Area of the triangle with new dimensions: " + area);
//        System.out.println("Circumference of the triangle with new dimensions: " + circumference);
//        System.out.println("***************************************************");
//        Rectangle rectangle = new Rectangle(5.0, 8.0);
//         height = rectangle.getHeight();
//        double width = rectangle.getWidth();
//        System.out.println("Height of the rectangle: " + height);
//        System.out.println("Width of the rectangle: " + width);
//         area = rectangle.calculateArea();
//        System.out.println("Area of the rectangle: " + area);
//         circumference = rectangle.calculateCircumference();
//        System.out.println("Circumference of the rectangle: " + circumference);
//        rectangle.setHeight(5.0);
//        rectangle.setWidth(6.0);
//        area = rectangle.calculateArea();
//        circumference = rectangle.calculateCircumference();
//        System.out.println("Area of the rectangle with new dimensions: " + area);
//        System.out.println("Circumference of the rectangle with new dimensions: " + circumference);
    }
    }
