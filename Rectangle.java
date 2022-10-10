import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        SimpleRectangle rectangle = new SimpleRectangle();

        Scanner input = new Scanner(System.in);

        System.out.print("Width: ");
        rectangle.width = input.nextDouble();

        System.out.print("Height: ");
        rectangle.height = input.nextDouble();

        rectangle.display();
    }
}

class SimpleRectangle {
    double width, height;

    SimpleRectangle() {
    }

    SimpleRectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return (width + height) * 2;
    }

    public void display() {
        System.out.println("Area: " + getArea());
        System.out.println("Perimeter: " + getPerimeter());
    }

}
