import java.util.*;

public class areaOfTriangle {
    public static void main(String[] args) {
        float height, base, area;
        System.out.println("Enter the base and height: ");

        Scanner sc = new Scanner(System.in);
        height = sc.nextFloat();
        base = sc.nextFloat();

        area = (base * height)/2;
        System.out.println("the area of the triangle is: "+area);
    }
}
