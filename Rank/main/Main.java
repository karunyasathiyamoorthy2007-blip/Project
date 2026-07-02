package main;

import java.util.Scanner;
import model.Student;
import service.RankingService;
import util.InputHelper;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("==================================");
        System.out.println("     STUDENT RANKING SYSTEM");
        System.out.println("==================================");

        System.out.print("Enter Number of Students: ");
        int n = sc.nextInt();

        Student[] students = new Student[n];

        InputHelper input = new InputHelper();
        input.readStudents(students);

        RankingService ranking = new RankingService();

        while (true) {

            System.out.println("\n========== MENU ==========");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Update Student");
            System.out.println("4. Display Rank List");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:

                    Student newStudent = new Student();
                    newStudent.getData();
                    students = ranking.addStudent(students, newStudent);

                    break;

                case 2:

                    System.out.print("Enter Roll Number to Remove: ");
                    int removeRoll = sc.nextInt();

                    students = ranking.removeStudent(students, removeRoll);

                    break;

                case 3:

                    System.out.print("Enter Roll Number to Update: ");
                    int updateRoll = sc.nextInt();

                    ranking.updateStudent(students, updateRoll);

                    break;

                case 4:

                    ranking.sortStudents(students);
                    ranking.displayRankList(students);

                    break;

                case 5:

                    System.out.println("Thank You!");
                    sc.close();
                    System.exit(0);

                default:

                    System.out.println("Invalid Choice!");
            }
        }
    }
}