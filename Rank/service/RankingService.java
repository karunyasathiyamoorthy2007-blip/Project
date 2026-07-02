package service;

import model.Student;

public class RankingService {

    // Sort students based on Total Marks (Descending Order)
    public void sortStudents(Student[] students) {

        for (int i = 0; i < students.length - 1; i++) {
            for (int j = i + 1; j < students.length; j++) {

                if (students[i].getTotal() < students[j].getTotal()) {

                    Student temp = students[i];
                    students[i] = students[j];
                    students[j] = temp;
                }
            }
        }
    }
    public void displayRankList(Student[] students) {

        System.out.println("\n========== STUDENT RANK LIST ==========");
        System.out.println("Rank\tRoll No\tName\t\tTotal\tAverage");

        for (int i = 0; i < students.length; i++) {

            System.out.println((i + 1) + "\t"
                    + students[i].getRollNo() + "\t"
                    + students[i].getName() + "\t\t"
                    + students[i].getTotal() + "\t"
                    + students[i].getAverage());
        }
    }
}