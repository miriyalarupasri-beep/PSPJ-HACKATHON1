import java.util.Scanner;
public class HouseholdDetails1{
    public static void main(String args[]) {
         Scanner sc=new Scanner(System.in);
         int FM;
         double WL;
         int HN;
       char WU;
         System.out.println("Enter the number of family members: ");
         FM=sc.nextInt();
         System.out.println("Enter No.of liters of water consumed: ");
         WL=sc.nextDouble();
        System.out.println("Enter House number : ");
        HN=sc.nextInt();
        sc.nextLine();
         System.out.println("Usage of water : ");
        WU=sc.next();

       sc.close();
    }
}