// Print sum of all the number from m to n
package pkgnew.mission;
import java.util.Scanner;
public class Problem_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int m,n,sum = 0;
        System.out.print("Enter Initial Value of: ");
        m = input.nextInt();
        System.out.print("Enter last Value of: ");
        n = input.nextInt();
        
        for (int i = m; i <= n; i++) {
            sum = sum + i;
                System.out.println(i+ " no line print = " +sum);
        }
        System.out.println("Total sum = "+sum);
    }
    
}
