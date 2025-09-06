import java.util.Scanner;

public class Swap {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //input of the first number -->
        System.out.print("Enter the first number : ");
        int a = sc.nextInt();

        //input of the second number -->
        System.out.print("Enter the second number : ");
        int b = sc.nextInt();

        //swapping of a number without third variable-->
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("first number after swapping : " + a);
        System.out.println("Second number after swapping : " + b);
    }
}
