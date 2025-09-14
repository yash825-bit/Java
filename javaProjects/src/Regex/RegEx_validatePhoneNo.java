package Regex;

import java.util.Scanner;
import  java.util.regex.*;

public class RegEx_validatePhoneNo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter phone number : ");
        String number = sc.nextLine();

        String regex = "^\\d{3}[- ]?\\d{3}[- ]?\\d{4}$";

        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(number);

        if(m.matches()){
            System.out.println("Valid phone number");
        }else{
            System.out.println("Please enter a 10-digit number");
        }
    }
}
