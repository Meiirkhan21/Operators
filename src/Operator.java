import java.util.Scanner;

public class Operator {
    public static void main(String[] args)
    {
        Scanner num = new Scanner(System.in);
        int first, second = 50;
        boolean isTrue = true;
        System.out.print("Enter first num: ");
        first = num.nextInt();

        if (first >= second && isTrue) {
            System.out.print("All Right");
            System.out.print("\n");
        } else if (first == 45) {
            System.out.print("Num is 45");

    }
        else {
            System.out.print("Num is lower than " + second);
        }
    }
}
