package Formatted_strings;

import java.util.Scanner;

public class reportGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Name input -->
        System.out.print("Enter your name : ");
        String name = sc.nextLine().trim();

        // Roll_number input -->
        System.out.print("Enter your roll no : ");
        String rollNo = sc.nextLine().trim();

        // Read marks safely (0 - 100)
        int englishMarks = readMark(sc, "Enter your marks in English : ");
        int mathsMarks   = readMark(sc, "Enter your marks in Maths   : ");
        int scienceMarks = readMark(sc, "Enter your marks in Science : ");
        int computerMarks= readMark(sc, "Enter your marks in Computer: ");

        // totals
        int totalMarks = englishMarks + mathsMarks + scienceMarks + computerMarks;
        double totalPercentage = totalMarks / 4.0;

        // pass if every subject >= 40 AND overall percentage >= 40
        boolean passAllSubjects = englishMarks >= 40 && mathsMarks >= 40 && scienceMarks >= 40 && computerMarks >= 40;
        boolean paSS = passAllSubjects && totalPercentage >= 40.0;

        // per-subject grade (strings.strings, supports "A+", "O", etc.)
        String gradeEnglish = gradeForMark(englishMarks);
        String gradeMaths   = gradeForMark(mathsMarks);
        String gradeScience = gradeForMark(scienceMarks);
        String gradeComputer= gradeForMark(computerMarks);

        // overall grade based on percentage
        String overallGrade = gradeForPercentage(totalPercentage);

        // Print formatted report
        System.out.println("================== REPORT CARD ==================");
        System.out.printf("%-10s : %s%n", "Name", name);
        System.out.printf("%-10s : %s%n", "Roll no", rollNo);
        System.out.printf("%-10s : %b%n", "Passed", paSS);
        System.out.println("-------------------------------------------------");
        System.out.printf("%-15s %-7s %-7s %-10s%n", "Subject", "Marks", "Grade", "Percentage");
        System.out.println("-------------------------------------------------");
        System.out.printf("%-13s %7d %7s %10.2f%%%n", "Maths",   mathsMarks,   gradeMaths,    (double)mathsMarks);
        System.out.printf("%-13s %7d %7s %10.2f%%%n", "English", englishMarks, gradeEnglish,  (double)englishMarks);
        System.out.printf("%-13s %7d %7s %10.2f%%%n", "Science", scienceMarks, gradeScience,  (double)scienceMarks);
        System.out.printf("%-13s %7d %7s %10.2f%%%n", "Computer",computerMarks,gradeComputer, (double)computerMarks);
        System.out.println("-------------------------------------------------");
        System.out.printf("%-13s %7d %-7s %10.2f%%%n", "Total", totalMarks, "-", totalPercentage);
        System.out.printf("%-13s %7X%n", "Hex Total", totalMarks);
        System.out.printf("%-13s %7o%n", "Octal Total", totalMarks);
        System.out.println("-------------------------------------------------");
        System.out.printf("%-15s : %s%n", "Overall Grade", overallGrade);
        System.out.printf("Status : %s%n", (paSS ? "PASS" : "FAIL"));
        System.out.println("=================================================");

        sc.close();
    }

    // Read a valid integer mark between 0 and 100
    private static int readMark(Scanner sc, String prompt) {
        int value;
        while (true) {
            System.out.print(prompt);
            if (!sc.hasNextInt()) {
                sc.next(); // consume invalid token
                System.out.println("Invalid input. Please enter an integer between 0 and 100.");
                continue;
            }
            value = sc.nextInt();
            if (value < 0 || value > 100) {
                System.out.println("Please enter marks in range 0 - 100.");
                continue;
            }
            sc.nextLine(); // consume newline after int
            break;
        }
        return value;
    }

    // Return grade string for a single subject mark
    private static String gradeForMark(int mark) {
        if (mark > 100 || mark < 0) return "Invalid";
        if (mark >= 91) return "O";
        if (mark >= 81) return "A+";
        if (mark >= 71) return "A";
        if (mark >= 61) return "B+";
        if (mark >= 51) return "B";
        if (mark >= 41) return "C";
        return "F";
    }

    // Return overall grade based on percentage (same scale but on percentage)
    private static String gradeForPercentage(double pct) {
        if (pct >= 91) return "O";
        if (pct >= 81) return "A+";
        if (pct >= 71) return "A";
        if (pct >= 61) return "B+";
        if (pct >= 51) return "B";
        if (pct >= 41) return "C";
        return "F";
    }
}

