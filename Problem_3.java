// Print sum of all Even Numbers 
package pkgnew.mission;
import java.util.Scanner;
public class Problem_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int m,n, sum = 0;
        System.out.print("Enter Initial numbers: ");
        m = input.nextInt();
        System.out.print("Enter last numbers: ");
        n = input.nextInt();
        
        for (int i = m; i <= n; i++) {
            if(i%2==0){
                sum = sum + i;
                System.out.println(i+" no line sum = "+sum);
            }
        }
        System.out.println("\nTotal Even sum = " +sum);
    }
}
