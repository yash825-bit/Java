package strings;

public class StringMethods3 {
    public static void main(String[] args){
        //both strings.strings have same content
//        String str1 = "Java";//SCP object
//        String str2 = new String("Java");//a Heap object
//
//        System.out.println(str1 == str2); //false
        /* '==' checks if both have same reference location or not , for example in this case
        *   its false since str1 is an SCP object and str 2 is a heap object having these two on
        *  different location*/
//        System.out.println(str1.equals(str2)); //true

//        String str1 = "java";
//        String str2 = "JAVA";

//        System.out.println(str1.equalsIgnoreCase(str2));//checks by ignoring the case of both the strings.strings
//        System.out.println(str2.compareTo(str1));
        /*compares strings.strings lexicographically(dictionary)that which string comes
        first by comparing them according to the order of the characters in that string dictionarily
        str1 > str2 (positive integer)
        str1 < str2 (negative integer)
        str1 = str2 (0)
        */
//        System.out.println(str1.compareToIgnoreCase(str2));
        String sentence = "hello, what are you doing";
        System.out.println(sentence.contains("what"));
        //.contains() --> return whether the string contains given substring or not

        String sentence2 = ", nothing just having fun while learning java";
        System.out.println(sentence.concat(sentence2));
        //.concat() --> used to concatenate two strings.strings it'll generate a new string object that contains concatenated string;
        String exp = String.valueOf(33);
        String exp2 = " is an integer";
        System.out.println(exp);
        System.out.println(exp.concat(exp2));
    }
}
