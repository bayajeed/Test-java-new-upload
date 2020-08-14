package pkgnew.mission;
import java.util.Scanner;
public class For_Loop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What you want: ");
        int num = input.nextInt();
        
        for(int i = 0; i <= num; i= i+2){
            System.out.println(i+ " Bangladesh");
        }
        
    }
    
}
