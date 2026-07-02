package util;

import model.Student;
import java.util.Scanner;

public class InputHelper {

    Scanner sc = new Scanner(System.in);
    public void readStudents(Student[] students) {

        for (int i = 0; i < students.length; i++) {
            System.out.println("\nEnter Details of Student " + (i + 1));

            students[i] = new Student();
            students[i].getData();
        }
    }
}