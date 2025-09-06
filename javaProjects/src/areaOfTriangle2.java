import java.lang.*;
import java.util.Scanner;

public class areaOfTriangle2 {
    public static void main(String[] args) {

        float a, b, c, s, temp, area;
        System.out.println("Enter all the values of the sides of a triangle: ");

        Scanner sc = new Scanner(System.in);
        a = sc.nextFloat();
        b = sc.nextFloat();
        c = sc.nextFloat();

        s = (a + b + c)/2f;
        temp = s*(s-a)*(s-b)*(s-c);
        area = (float) Math.sqrt(temp);
        System.out.println("the area of the triangle is : "+ area);
    }
}
