package Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx_ExtractEmailAddresses {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a text that contains E-mail addresses : ");
        String text = sc.nextLine();

        String regex = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";

        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        //Pattern.CASE_INSENSITIVE --> for case-insensitive patterns
        Matcher m = p.matcher(text);

        while(m.find()){
            System.out.println(m.group());
        }
    }
}
