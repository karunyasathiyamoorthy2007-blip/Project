package service;

import model.Student;

public class RankingService {

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

    public Student[] addStudent(Student[] students, Student newStudent) {
        Student[] temp = new Student[students.length + 1];

        for (int i = 0; i < students.length; i++) {
            temp[i] = students[i];
        }

        temp[students.length] = newStudent;

        System.out.println("Student Added Successfully.");

        return temp;
    }

    public Student[] removeStudent(Student[] students, int rollNo) {

        int index = -1;

        for (int i = 0; i < students.length; i++) {
            if (students[i].getRollNo() == rollNo) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("Student Not Found.");
            return students;
        }

        Student[] temp = new Student[students.length - 1];

        int j = 0;

        for (int i = 0; i < students.length; i++) {
            if (i != index) {
                temp[j++] = students[i];
            }
        }

        System.out.println("Student Removed Successfully.");

        return temp;
    }

    public void updateStudent(Student[] students, int rollNo) {

        for (Student s : students) {

            if (s.getRollNo() == rollNo) {

                System.out.println("Enter New Student Details:");
                s.getData();

                System.out.println("Student Updated Successfully.");
                return;
            }
        }

        System.out.println("Student Not Found.");
    }

}