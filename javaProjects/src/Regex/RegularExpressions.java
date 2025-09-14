package Regex;

import  java.util.regex.*;
import  java.util.Scanner;
public class RegularExpressions {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("What's your college mail ID : ");
        String text = sc.nextLine();

        String regex = "^[a-zA-Z]+\\.[a-zA-Z]+_cs\\d{2}@gla\\.ac\\.in$";

        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(text);

        if(m.matches()){
            System.out.println("you have a valid gla university mail");
        }else{
            System.out.println("You don't have a valid gla university mail");
        }
    }
}
