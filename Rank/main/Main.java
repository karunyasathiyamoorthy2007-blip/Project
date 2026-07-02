package main;
import java.util.Scanner;
import model.Student;
import service.RankingService;
import util.InputHelper;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("==================================");
        System.out.println(" STUDENT RANKING SYSTEM ");
        System.out.println("==================================");
        System.out.print("Enter Number of Students: ");
        int n = sc.nextInt();
        Student[] students = new Student[n];
        InputHelper input = new InputHelper();
        input.readStudents(students);
        RankingService ranking = new RankingService();
        ranking.sortStudents(students);
        ranking.displayRankList(students);

        sc.close();
    }
}