package pkgnew.mission;
import java.util.Scanner;
public class LargOrSmall {
    public static void main(String [] args){
        Scanner input = new Scanner (System.in);
        
        int x,y,z;
        System.out.print("Enter three digite: ");
        x = input.nextInt();
        y = input.nextInt();
        z = input.nextInt();
        
        if (x>y && x>z){
            System.out.println("X is large value: " +x);
        }
        else if (y>x && y>z){
            System.out.println("Y is large value: " +y);
        }
        else{
            System.out.println("Z is large value: " +z);
        }
        
    }
    
}
