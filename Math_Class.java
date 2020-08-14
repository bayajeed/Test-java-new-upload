package pkgnew.mission;
import java.util.Scanner;
public class Math_Class {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Double pi = Math.PI; // pi value
        System.out.println("Pi Value: "+pi);
        Double e = Math.E; // pi value
        System.out.println("E Value: "+e);
        
        
        System.out.print("Enter the Value of X: ");
        int x = input.nextInt();
        System.out.print("Enter the Value of Y: ");
        int y = input.nextInt();
        
        int max = Math.max(y, y); // max value
        System.out.println("Max Value: " +max);
        
        
    }
    
}
