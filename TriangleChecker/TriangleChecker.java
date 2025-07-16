import java.util.Scanner;
public class TriangleChecker {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int a, b, c;
        System.out.println("Enter the lengths of the first side of the triangle:");
        a=sc.nextInt();
        System.out.println("Enter the lengths of the second side of the triangle:");
        b=sc.nextInt();
        System.out.println("Enter the lengths of the third side of the triangle:");
        c=sc.nextInt();
        
        if (a==b && b==c) {
            System.out.println("The triangle is equilateral.");
        } else if (a==b || b==c || a==c) {
            System.out.println("The triangle is isosceles.");
        } else {
            System.out.println("The triangle is scalene.");
        }
    }
}