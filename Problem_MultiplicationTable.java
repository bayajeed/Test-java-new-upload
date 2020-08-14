// Multiplication Table
package pkgnew.mission;
import java.util.Scanner;
public class Problem_MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int m, n, mul;
        mul = 1;
        System.out.print("Enter Initial value: ");
        m = input.nextInt();//1
        System.out.print("Enter Final value: ");
        n = input.nextInt();//10
        
        for (int i = m; i <= n; i++) {
            System.out.println(i+" Multiplication Table ");
                for (int j = 1; j <= 10; j++) {
                mul =i*j;
                System.out.println(i+ "X" +j+ " = " +mul);
        }
            
        }
    }
    
    
}
