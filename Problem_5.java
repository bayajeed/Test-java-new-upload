// Double value print Multiplication of all the number from m to n
package pkgnew.mission;
import java.util.Scanner;
public class Problem_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double m,n, result = 1;
        System.out.print("Enter the Initial Value of M: ");
        m = input.nextDouble();
        System.out.print("Enter the Final vlaue of N: ");
        n = input.nextDouble();
        for (double i = m; i <= n; i++) {
            result = result * i;
            System.out.println(i+" ");
            
        }
        System.out.println("M to N total Multiplication = " +result);
    }
    
}
