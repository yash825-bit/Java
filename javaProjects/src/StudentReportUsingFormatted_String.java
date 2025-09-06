import java.util.Scanner;

public class StudentReportUsingFormatted_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Name input -->
        System.out.print("Enter your name : ");
        String name = sc.nextLine();

        //Roll_number input -->
        System.out.print("Enter your roll no : ");
        String rollNo = sc.nextLine();

        //English_marks input -->
        System.out.print("Enter your marks in English : ");
        int englishMarks = sc.nextInt();

        //Maths marks input-->
        System.out.print("Enter your marks in Maths : ");
        int mathsMarks = sc.nextInt();

        //Science marks input -->
        System.out.print("Enter your marks in Science : ");
        int scienceMarks = sc.nextInt();

        //Computer marks input-->
        System.out.print("Enter your marks in Computer : ");
        int computerMarks = sc.nextInt();

        //total marks -->
        int totalMarks = englishMarks + scienceMarks + mathsMarks + computerMarks;
        double totalPercentage = (double)totalMarks / 4;

        boolean paSS = englishMarks >= 40 && mathsMarks >= 40 && scienceMarks >= 40 && totalMarks >= 40;

        String grade = "";
        if(englishMarks > 100 || mathsMarks > 100 || scienceMarks > 100 || computerMarks > 100){
            grade = "Marks cannot exceed 100 in a particular subject";
        } else if (englishMarks >= 91 || computerMarks >= 91 || mathsMarks >= 91 | scienceMarks >=91) {
            grade = "O";
        } else if (englishMarks >= 81 || computerMarks >= 81 || scienceMarks >= 81 || mathsMarks >= 81) {
            grade = "A+";
        } else if (englishMarks >= 71 || computerMarks >= 71 || scienceMarks >= 71 || mathsMarks >= 71) {
            grade = "A";
        } else if (englishMarks >= 61 || computerMarks >= 61 || scienceMarks >= 61 || mathsMarks >= 61) {
            grade = "B+";
        } else if (englishMarks >= 51 || computerMarks >= 51 || scienceMarks >= 51 || mathsMarks >= 51) {
            grade = "B";
        } else if (englishMarks >= 41 || computerMarks >= 41 || scienceMarks >= 41 || mathsMarks >= 41) {
            grade = "C";
        } else {
            grade = "F";
        }

        System.out.println("================== REPORT CARD ==================");
        System.out.printf("%-10s : %s%n","Name",name);
        System.out.printf("%-10s : %s%n","Roll no", rollNo);
        System.out.printf("%-10s : %b%n","Passed",paSS);
        System.out.println("-------------------------------------------------");
        System.out.printf("%-15s %-7s %-7s %-10s%n","Student","Marks","Grade","Percentage");
        System.out.println("-------------------------------------------------");
        System.out.printf("%-15s %7d %7s %10.2f%%n","Maths",mathsMarks,grade,(double)mathsMarks);
        System.out.printf("%-15s %7d %7s %10.2f%%n","English",englishMarks,grade,(double)englishMarks);
        System.out.printf("%-15s %7d %7s %10.2f%%n","Science",scienceMarks,grade,(double)scienceMarks);
        System.out.printf("%-15s %7d %7s %10.2f%%n","Computer",computerMarks,grade,(double)computerMarks);
        System.out.println("-------------------------------------------------");
        System.out.printf("%-15s %7d %-7s %10.2f%%n","Total",totalMarks,"-",totalPercentage);
        System.out.printf("%-15s %7x%n","Hex Total",totalMarks);
        System.out.printf("%-15s %7o%n","Octal Total",totalMarks);
        System.out.println("-------------------------------------------------");
        System.out.printf("Status : %s%n",(totalPercentage >= 40 ? "PASS" : "FAIL"));
        System.out.println("=================================================");

    }
}
