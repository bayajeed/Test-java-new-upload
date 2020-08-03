
package pkgnew.mission;
import java.util.Scanner;
public class AssignmentOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Enter the value of X: ");
        int x= input.nextInt();
        System.out.print("Enter the value of y: ");
        int y= input.nextInt();
        
        int result = x+y;
        System.out.println(result);
    }
}
