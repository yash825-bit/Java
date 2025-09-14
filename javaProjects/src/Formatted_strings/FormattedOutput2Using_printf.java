package Formatted_strings;

import java.util.Scanner;

public class FormattedOutput2Using_printf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        int x = 89;
//        float y = 12.25f;
//        char c = 'A';
//
//        System.out.printf("hello %d , %e and %c", x, y, c);

//        System.out.print("What is your name: ");
//        String name = sc.next();
//
//        System.out.print("What is your age: ");
//        int age = sc.nextInt();
//
//        System.out.print("Your marks currently: ");
//        float marks = sc.nextFloat();
//
//        System.out.println("Hello "+name+" your age is "+age+" and your marks currently are "+marks);
//        System.out.printf("Hello %s your age is %d and your marks currently are %e", name, age, marks);

        //Argument indexes --> used to changes the order of format specifiers.
//        int x = 20;
//        String str = "ash";
//        float f = 12.23f;
//        System.out.printf("%3$f and %1$d and %2$s",x,str,f);\

        //width --> how many spaces (at least)
        //flags --> what to replace those spaces with?
        //example 1 -->
//        int x = 12;
//        System.out.printf("|%5d|%n",x);
//        System.out.printf("|%-5d|",x);
        //example 2-->
        int x = 90;
        //'+' = showcases sign before numbers
        System.out.printf("%+d and %+d%n", x, -x);

        //',' = acts as an automatic separator
        System.out.printf("%,d%n",10000000);

        //'(' = encloses a -ve number in ()
        System.out.printf("%(d and %(d%n", -92, 92);

        //precision --> how many numbers in places after floating point
        float num = 12.56f;
        System.out.printf("%07.2f%n",num); //here 4 places of number with 2 places after decimal point
        //4 places before the point and 2 after the point since 12 takes only 2 places
        //rest of the spaces is filled by flag 0

        float num2 = 786.1267f;
        System.out.printf("%(6.2f", -num2);
    }
}
