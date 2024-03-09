import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Exercicio3 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);

        Student student;
        Scanner sc = new Scanner(System.in);

        System.out.print("Name: ");
        student = new Student(sc.nextLine());
        
        do{
            System.out.print("Grade 1(30.0): ");
        } while(!student.setGrade1(sc.nextFloat()));

        do{
            System.out.print("Grade 2(35.0): ");
        } while(!student.setGrade2(sc.nextFloat()));

        do{
            System.out.print("Grade 3(35.0): ");
        } while(!student.setGrade3(sc.nextFloat()));
        sc.close();
        
        student.processData();
        
        System.out.println();
        System.out.printf("STUDENT = %s\nFINAL GRADE = %.2f\n%s\n", student, student.ttlGrade, student.sitName);

        if(!student.sit) {
            System.out.printf("MISSING %.2f POINTS\n", student.missingPoints(60f));
        }
    }
}
