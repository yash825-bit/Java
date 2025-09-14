package Regex;

import  java.util.regex.*;
import  java.util.Scanner;

public class RegEx_ExtractDigits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your text: ");
        String text = sc.nextLine();

        Pattern p = Pattern.compile("\\d+");
        Matcher m = p.matcher(text);

        while(m.find()){
            System.out.println("Found : "+m.group()+" (start : "+m.start()+" , end :"+m.end()+")");
        }
    }
}
