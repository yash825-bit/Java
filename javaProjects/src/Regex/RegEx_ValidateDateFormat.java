package Regex;

import java.util.Scanner;
import java.util.regex.*;

public class RegEx_ValidateDateFormat {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a date format: ");
        String date = sc.nextLine();

//        String regex = "^\\d{2}/\\d{2}/\\d{4}$";

        String regex2 = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/\\d{4}$";

        Pattern p = Pattern.compile(regex2);
        Matcher m = p.matcher(date);

        if(m.matches()){
            System.out.println("this is a valid date format");
        }else{
            System.out.println("please enter date in 00/00/0000 format");
        }
    }
}
