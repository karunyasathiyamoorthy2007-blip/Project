package model;
import java.util.Scanner;
public class Student {
    private int rollNo;
    private String name;
    private int[] marks = new int[5];
    private int total;
    private double average;
    public void getData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Roll No: ");
        rollNo = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        total = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter Mark " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
            total += marks[i];
        }
        average = total / 5.0;
    }
    public void display() {
        System.out.println("--------------------------------");
        System.out.println("Roll No : "+rollNo);
        System.out.println("Name    : "+name);
        System.out.println("Total   : "+total);
        System.out.println("Average : "+average);
    }
    public int getTotal() {
        return total;
    }
    public int getRollNo() {
        return rollNo;
    }
    public String getName() {
        return name;
    }
    public double getAverage() {
        return average;
    }
}