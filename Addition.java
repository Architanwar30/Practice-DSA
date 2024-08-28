import java.util.Scanner;
public class Addition {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter 1st no.");
        a=sc.nextInt();
        System.out.println("Enter 2nd no.");
        b=sc.nextInt();
        c=a+b;
        System.out.println("Sum of two numbers:"+c);

    }
}
