import java.util.*;

public class Calculated2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Frist value");
        int a = sc.nextInt();

        System.out.println("Enter the Second value");
        int b = sc.nextInt();

        String pluse = "+";
        String Minus = "-";
        String Multi = "*";
        String Divided = "/";

        String pluse1 = sc.next();

        if (pluse.equals(pluse1)) {
            System.out.print("the sum is = " + a + b);

        }
        if (Minus.equals(pluse1)) {
            System.out.print("The Sunstration is");
            System.out.print(a - b);
        }

        if (Multi.equals(pluse1)) {
            System.out.print("the Multiplication is" + a * b);
        }

        if (Divided.equals(pluse1)) {
            System.out.print("the Divide is" + a / b);
        }

    }

}
