package strings;

public class StringMethods {
    public static void main(String[] args) {
        //length() -->
//        Length();
//        upperAndLower();
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Type something : ");
//        String str = "yash Goyal";
        //trims the leading amd trailing spaces from a string
//        System.out.println(str.trim());
        //return the substring from the given index, basically returns the part of that string starting from that given index
//        System.out.println(str.substring(3));
        //same as above but now only returns possible substring between starting index and ending index
//        System.out.println(str.substring(2,7));
        //replaces a character with the new given character
//        System.out.println(str.replace('a','A'));
        //returns the character at the particularly given address/
//        System.out.println(str.charAt(5));

//        String name = "Yash Goyal";//a unique string literal goes to SCP
//        String name2 = new String("Yash Goyal");//a new object in heap with no SCP trace
//        System.out.println(name == name2);//both are not same

        String name1 = "Yash Goyal";
        String name2 = new String("Yash Goyal");
        String name3 = name2.intern();//makes Heap object behave like SCP object
        System.out.println(name1 == name3);//both are equal as both are pointing towards same in SCP



    }
//    private static void Length(){
//        Scanner sc = new Scanner(System.in);
//        //user input-->
//        System.out.print("Type something : ");
//        String someThing = sc.nextLine();
//        System.out.printf("Length : %d",someThing.length());
//    }
//    public static void upperAndLower(){
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Type something : ");
//        String words = sc.nextLine();
//        System.out.printf("In lowerCase : %s and in upperCase : %s",words.toLowerCase(), words.toUpperCase());
//    }
}
