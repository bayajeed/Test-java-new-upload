package pkgnew.mission;
import java.util.Scanner;
public class While_Loop {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter while Loop vlaue: ");
        int x = input.nextInt();
        
        int i = 0;
        while(i<=x){
            System.out.println(i+ " While Loop");
            i = i++;
        }
    }
    
}
