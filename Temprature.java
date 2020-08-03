
package pkgnew.mission;
import java.util.Scanner;
public class Temprature {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the value Farhanet to Celceas:");
        double c = input.nextDouble();
        
        double f = 0.55 * (c-32);
        System.out.print(f);
    }
    
}
