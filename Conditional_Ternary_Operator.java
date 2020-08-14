
// Java Ternary Operator

package pkgnew.mission;
import java.util.Scanner;
public class Conditional_Ternary_Operator {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Compare 2 Number and print Large value: ");
        int x = input.nextInt();
        int y = input.nextInt();
        int large = (x>y) ? x : y; //Java Ternary Operator
        System.out.println("Large Value is: "+large);
    }   
}
