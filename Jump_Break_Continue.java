package pkgnew.mission;
import java.util.Scanner;
public class Jump_Break_Continue {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Initial Value: ");
        int x = input.nextInt();
        
        for (int i = 0; i<=x; i++){
                if(i==50){
                   // System.out.println("50 is skip");
                    continue; // if user input 100 then output is 50 skip 
                }
                else if(i==60){
                    break; // if user input 100 then output is 1 to 59  
                }
                System.out.println(i+ " Skip 50 Continue Statment and Break 1 to 50");
                
        }

    }
    
}
