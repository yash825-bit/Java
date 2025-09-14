package Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx_ValidateStrongPassword {
    public static  void  main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your password : ");
        String password = sc.nextLine();

        String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*()_+=\\-\\[\\]{};:'\",.<>?/\\\\|]).{8,16}$";
        //^..$ --> anchor tags for string as a whole;
        //(?=..) --> positive lookaheads : from this position the string must contain the pattern
        //.*[0-9] --> it must contain numbers from 0-9;
        //m.find() --> for one by one matching;
        //m.matches() --> for matching pattern as a whole;

        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(password);

        if(m.matches()){
            System.out.println("Strong password");
        }else{
            System.out.println("Weak password, try to create a strong password");
        }
    }
}
