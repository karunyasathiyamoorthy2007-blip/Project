import java.util.Scanner;
public class Student
{
    public static void getData(int rollNo[],String name[],int total[],double average[],int n)
    {
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<n;i++)
        {
            System.out.println("\nEnter Student"+(i+1)+"Deatails");
            System.out.print("Roll No:");
            rollNo[i]=sc.nextInt();
            sc.nextLine();
            System.out.print("Name:");
            name[i]=sc.nextLine();
            int m1,m2,m3,m4,m5;
            System.out.print("Mark 1:");
            m1=sc.nextInt();
            System.out.print("Mark 2:");
            m2=sc.nextInt();
            System.out.print("Mark 3:");
            m3=sc.nextInt();
            System.out.print("Mark 4:");
            m4=sc.nextInt();
            System.out.print("Mark 5:");
            m5=sc.nextInt();
            total[i]=m1+m2+m3+m4+m5;
            average[i]=total[i]/5.0;
        }
    }
        static void sortData(int rollNo[],String name[],int total[],double average[],int n[]){
            for(int i=0;i<n-1;i++)
            {
                for(int j=i+1;j<n;j++)
                {
                    if(total(i)<total(j))
                    {
                        int t=rollNo[i];
                        rollNo[i]=rollNo[j];
                        rollNo[j]=t;
                        String s=name[i];
                        name[i]=name[j];
                        name[j]=s;
                        t=total[i];
                        total[i]=total[j];
                        total[j]=t;
                        double d=average[i];
                        average[i]=average[j];
                        average[j]=d;
                    }
                }
            }
        }