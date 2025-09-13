class student {
    String name;
    int age;

    student(String n, int a) {
        name = n;
        age = a;
    }
}

public class strings {
    public static void main(String[] args) {
        student s1 = new student("Arjun",20);
        System.out.printf("Hello %s, your age is %d currently",s1.name,s1.age);
    }
}
