package Regex;

public class RegEx_ReplaceAllWords {
    public static void main(String[] args){
        String str = "Python is powerful and python is everywhere";
        System.out.println(str.replaceAll("(?i)Python", "Java"));
        //(?i) --> for case-insensitive replacement.

        System.out.println(str.replaceFirst("(?i)Python", "java"));
        //replaces only first occurrence.

    }
}
