import java.util.Scanner;
public class HouseholdDetails2 {
    public static void main(String args[]) {
        Scanner sc =new Scanner(System.in);

        double WU;

        System.out.println("Enter the amount of water used : ");
        WU=sc.nextInt();
        if(WU<=500) {
            System.out.println("the bill amount is RS.100");

        }else if(WU>500) {
            System.out.println("the bill amount is Rs.200");
        }
        sc.close();
    }
    

}