import java.util.Scanner;

public class FixErrors {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Input your name: ");
        String inputString=sc.nextLine();
        System.out.println("Enter your age: " );
        int age =sc.nextInt();
        System.out.print("Enter your DOB year: ");
        int dob=sc.nextInt();
        System.out.println("Summary: Your name is: " +inputString +"\nYour age is: " +age + "\nYour birth year is: "+dob);}
}
