import java.util.*;

public class roots {
    public static void main(String[] args) {
        //find out the roots r1, r2 of the quadratic equation;
        int a, b, c;
        double discriminant, r1, r2;
        System.out.println("Enter all 3 values of coefficient: ");

        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        discriminant = (b * b) - (4 * a * c);

        if(discriminant>0){
            System.out.println("Two distinct and Real roots: ");
            r1 = (-b + Math.sqrt(discriminant)) / ( 2 * a);
            r2 = (-b - Math.sqrt(discriminant)) / ( 2 * a);

            System.out.println("r1 = "+r1);
            System.out.println("r2 = "+r2);
        } else if (discriminant == 0) {
            System.out.println("Two real and equal roots: ");
            r1 = r2 = -b / (2.0 * a);
            System.out.println("r1 = "+r1);
            System.out.println("r2 = "+r2);
        } else {
            System.out.println("Complex and imaginary Square roots: ");
            double realPart = -b / (2.0 * a);
            double imaginaryPart = Math.sqrt(-discriminant) / (2 *  a);
            System.out.println("r1 = " + realPart + " + " + imaginaryPart + "i");
            System.out.println("r2 = " + realPart + " - " + imaginaryPart + "i");
        }
        sc.close();
    }
}
