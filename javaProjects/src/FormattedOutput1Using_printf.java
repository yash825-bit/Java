import java.util.Scanner;

public class FormattedOutput1Using_printf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("What is your name : ");
        String name = sc.next();

        System.out.println("your age : ");
        int age = sc.nextInt();

        System.out.println("Your marks : ");
        float marks = sc.nextFloat();

        //simple output -->
        System.out.println("Hello "+name+" you are "+age+" currently and your score is "+marks+" till now");

        //formatted output using format specifiers -->
        System.out.printf("Hello %s you are %d currently and your score is %g till now", name, age, marks);

        /*  some common format specifiers are:
        *   characters = c,
        *   integers = %d(for decimal values), %o(for octal conversion)
        *               %x(for hexadecimal conversion);
        *   floating point value = %f(for floating point numbers),  %e and %g(for scientific conversion of any floating point
        *   numbers)
        *   strings = %s;
         */
    }
}
