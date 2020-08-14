// AND gate, OR gate, Ex-OR gate, NOR gate
// OR Gate Reverse value we got NOR
package pkgnew.mission;
import java.util.Scanner;
public class Bitwise_Operator {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the Value of X: ");
    int x = input.nextInt();
    System.out.print("Enter the Value of Y: ");
    int y = input.nextInt();
    
    int result = x & y; // "And Gate" formula-Multiplication, 00=0,10=0,11=1 
        System.out.println("AND gate: " +result);
    
    int result2 = x | y; // "OR gate" formula follow Add, // 00=0, 01=1, 11=1
        System.out.println("OR gate: " +result2);
        
    int ex_or = x ^ y; //Odd number of 1 Ex-OR gate //00=0,11=0,01=1,
        System.out.println("Ex-OR gate: " +ex_or);
    
    // Bitwise shift Right
        System.out.print("Enter Shift value: ");
    int shift_value = input.nextInt();
    
    int shift_right = shift_value >> 4; // User value 4-time divided by 2 
        System.out.println("Right Shift Value: " +shift_right);
    
    // Bitwise shift Left
     int shift_left = shift_value << 10; // User value 10-time Multiplication by 2 
        System.out.println("Left Shift Value: " +shift_left);
    
    }
}