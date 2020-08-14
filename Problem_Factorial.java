//  Factorial
package pkgnew.mission;
import java.util.Scanner;
public class Problem_Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out .print("Enter the Factorial value: ");
        int n = input.nextInt();
        int fact = 1;
        for (int i = n; i >= 1; i--) {
            fact = fact * i;
            System.out.println(i+ "! " +fact);
        }
        System.out.println("Factorial Result = " +fact);
    }
}
