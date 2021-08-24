import java.util.Scanner;
public class difference {

    public static void main(String[] args) {

        int x, y, diff;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        x = sc.nextInt();

        System.out.println("Enter Second Number: ");
        y = sc.nextInt();

        sc.close();
        diff = x - y;
        System.out.println("Sum of these numbers: "+diff);
    }
}

