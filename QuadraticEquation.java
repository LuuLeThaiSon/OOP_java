import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        SimpleQuadraticEquation test = new SimpleQuadraticEquation();
        
        System.out.println("ax^2 + bx + c = 0");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a, b, c: ");
        test.a = scanner.nextDouble();
        test.b = scanner.nextDouble();
        test.c = scanner.nextDouble();
        
        if (test.getDiscriminant() < 0) {
            System.out.println("Phuong trinh vo nghiem");
        } else if (test.getDiscriminant() == 0) {
            System.out.println("Phuong trinh co mot nghiem: " + test.getRoot1());
        } else {
            System.out.println("Phuong trinh co 2 nghiem");
            System.out.println("x1 = " + test.getRoot1()+ " x2 = " + test.getRoot2());
        }
    }
}

class SimpleQuadraticEquation {
    double a, b, c, delta;

    SimpleQuadraticEquation() {
    }

    SimpleQuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminant() {
        delta = Math.pow(b,0.5) - 4 * a * c;
        return delta;
    }

    public double getRoot1() {
        double r1;
        r1 = (-b + Math.pow(b*b - 4*a*c,2)) / (2 * a);
        return r1;
    }

    public double getRoot2() {
        double r2;
        r2 = (-b - Math.pow(b*b - 4*a*c,2)) / (2 * a);
        return r2;
    }
}
