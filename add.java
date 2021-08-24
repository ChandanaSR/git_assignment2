import java.util.Scanner;
public class add {

    public static void main(String[] args) {
        
        int x, y, sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        x = sc.nextInt();
        
        System.out.println("Enter Second Number: ");
        y = sc.nextInt();
        
        sc.close();
        sum = 2x + 2y;
        System.out.println("Sum of these numbers: "+sum);
    }
}
