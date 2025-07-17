import java.util.Scanner;
public class TriangleChecker {
    private int a, b, c;
    private boolean isValidTriangle() {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }   
    private String triangleType() {
        if (a == b && b == c) {
            return "Equilateral";
        } else if (a == b || b == c || a == c) {
            return "Isosceles";
        } else {
            return "Scalene";
        }
    }
    public void checkTriangle() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter side a: ");
        a = scanner.nextInt();
        System.out.print("Enter side b: ");
        b = scanner.nextInt();
        System.out.print("Enter side c: ");
        c = scanner.nextInt();  
        if (isValidTriangle()) {
            System.out.println("The triangle is " + triangleType() + ".");
        } else {
            System.out.println("The sides do not form a valid triangle.");
        }
        scanner.close();
    }
    public static void main(String[] args) {
        TriangleChecker triangleChecker = new TriangleChecker();
        triangleChecker.checkTriangle();
    }
}
// This code defines a TriangleChecker class that checks if three sides can form a triangle and determines