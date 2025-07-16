import java.util.Scanner;
public class TriangleChecker {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int a, b, c;
        System.out.println("Enter the lengths of the first side of the triangle:");
        a=sc.nextInt();
        if (a <= 0) {
            System.out.println("Invalid input. Side lengths must be positive integers.");
            return;
        }
        System.out.println("Enter the lengths of the second side of the triangle:");
        b=sc.nextInt();
        if (b <= 0) {
            System.out.println("Invalid input. Side lengths must be positive integers.");
            return;
        }
        System.out.println("Enter the lengths of the third side of the triangle:");
        c=sc.nextInt();
        if (c <= 0) {
            System.out.println("Invalid input. Side lengths must be positive integers.");
            return;
        }
        
        if (a==b && b==c) {
            System.out.println("The triangle is equilateral.");
        } else if (a==b || b==c || a==c) {
            System.out.println("The triangle is isosceles.");
        } else {
            System.out.println("The triangle is scalene.");
        }
    }
}