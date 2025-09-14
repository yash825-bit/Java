package bits;

import java.util.Scanner;

public class bitMerging {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number = ");
        int a = sc.nextInt();

        System.out.println("Enter the second number = ");
        int b = sc.nextInt();

        int k = Integer.SIZE - Integer.numberOfLeadingZeros(b);

        int merged = (a << k) | b;

        System.out.println("Merged result of a and b is: " + merged);
        System.out.println("binary of a is: " + Integer.toBinaryString(a));
        System.out.println("binary of b is: " + Integer.toBinaryString(b));
        System.out.println("binary of merged is: " + Integer.toBinaryString(merged));

        sc.close();

    }
}
