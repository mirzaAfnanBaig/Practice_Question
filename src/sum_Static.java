import java.util.Scanner;
public class sum_Static {
    public static void main(String[] args) {
        something();
        something();
    }
    static void something() {
        Scanner in = new Scanner(System. in);
        System.out.print("Enter number 1: ");
        int num1 = in.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = in.nextInt();

        int sum = num1 + num2;
        System.out.println("The sum = " + sum);

    }
}
