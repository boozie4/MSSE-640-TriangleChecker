import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Triangle {

    // Method to classify a triangle based on side lengths
    public String classifyTriangle(int a, int b, int c) {
        // Check for positive side lengths
        if (a <= 0 || b <= 0 || c <= 0) {
            return "Invalid Triangle: Side lengths must be positive.";
        }
        // Check for triangle inequality
        if (a + b <= c || a + c <= b || b + c <= a) {
            return "Invalid Triangle: Triangle inequality violated.";
        }
        // Check for equilateral
        if (a == b && b == c) {
            return "Equilateral Triangle";
        }
        // Check for isosceles
        if (a == b || b == c || a == c) {
            return "Isosceles Triangle";
        }
        // Otherwise, scalene
        return "Scalene Triangle";
    }

    // Test case 1: Test for a valid scalene triangle
    @Test
    void testValidScaleneTriangle() {
        Triangle triangle = new Triangle();
        String result = triangle.classifyTriangle(3, 4, 5); // A valid scalene triangle
        Assertions.assertEquals("Scalene Triangle", result, "Should classify as Scalene Triangle");
    }

    // Test case 2: Test that accepts the sides of a scalene triangle in all possible orders
    @Test
    void testScaleneTriangleSideOrders() {
        Triangle triangle = new Triangle();

        // Order 1: 3, 4, 5
        String result1 = triangle.classifyTriangle(3, 4, 5);
        Assertions.assertEquals("Scalene Triangle", result1, "Order 1 should be Scalene Triangle");

        // Order 2: 4, 3, 5
        String result2 = triangle.classifyTriangle(4, 3, 5);
        Assertions.assertEquals("Scalene Triangle", result2, "Order 2 should be Scalene Triangle");

        // Order 3: 5, 4, 3
        String result3 = triangle.classifyTriangle(5, 4, 3);
        Assertions.assertEquals("Scalene Triangle", result3, "Order 3 should be Scalene Triangle");

        //  Add more orders to thoroughly test the scenario
        // Order 4: 3, 5, 4
        String result4 = triangle.classifyTriangle(3, 5, 4);
        Assertions.assertEquals("Scalene Triangle", result4, "Order 4 should be Scalene Triangle");

        // Order 5: 4, 5, 3
        String result5 = triangle.classifyTriangle(4, 5, 3);
        Assertions.assertEquals("Scalene Triangle", result5, "Order 5 should be Scalene Triangle");

        // Order 6: 5, 3, 4
        String result6 = triangle.classifyTriangle(5, 3, 4);
        Assertions.assertEquals("Scalene Triangle", result6, "Order 6 should be Scalene Triangle");
    }

    // Test case 3: Test that accepts a zero length side
    @Test
    void testZeroLengthSide() {
        Triangle triangle = new Triangle();
        String result = triangle.classifyTriangle(0, 4, 5); // Zero length side
        Assertions.assertEquals("Invalid Triangle: Side lengths must be positive.", result, "Should reject zero length side");
    }
}

