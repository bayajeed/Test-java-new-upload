// Print sum 1^2 + 2^2 + 3^2 + 4^2 + -------- + n^2
package pkgnew.mission;
import java.util.Scanner;
public class Problem_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int m,n, sum = 0;
        System.out.print("Enter Initial Value = ");
        m = input.nextInt();
        System.out.print("Enter Final Value = ");
        n = input.nextInt();
        
        for (int i = m; i <= n; i++) {
            sum = sum + (i*i);
            System.out.println(i+ " no line sum: " +i+ " X " +i+ " = " +sum);
        }
        System.out.println("Total sum = " +sum);
    }
    
}
