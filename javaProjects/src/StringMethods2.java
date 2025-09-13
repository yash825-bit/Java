import java.util.Scanner;

public class StringMethods2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

//        System.out.print("Enter a String : ");
//        String websiteName = sc.nextLine();
//        websiteOrNot(websiteName);


        //indexOF --> returns the index of(integer) of first occurrence of any character or string/sub string
        //lastIndexOF --> returns the index of last occurrence of a character(character appeared first from left to right) the index counting
        //itself starts from the start
        String str = "programing in java is amazing";
        System.out.printf("First occurrence of the character 'a' : %d%n",str.indexOf('a'));//5
        System.out.printf("Last occurrence of the character 'a' : %d%n",str.lastIndexOf('a'));//24
        System.out.printf("First occurrence of substring java : %d%n",str.indexOf("java"));//14
        System.out.printf("Last occurrence of substring am : %d%n", str.lastIndexOf("am"));//22
        System.out.printf("Second occurrence of character 'a' : %d",str.indexOf('a',6));//15


    }
//    private static void websiteOrNot(String str){
//        if(str.startsWith("www.") && (str.endsWith(".org") || str.endsWith(".in") || str.endsWith(".com") || str.endsWith(".io"))){
//            System.out.println("This a valid Website url");
//        }else{
//            System.out.println("not a valid website url");
//        }
//    }
}
