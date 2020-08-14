package pkgnew.mission;
import java.util.Scanner;
public class Do_While_Loop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter tha value of Do whil loop: ");
        int x = input.nextInt();
        
        int i = 0;
        do{
            System.out.println(i+ " Do While Loop");
            i++;
        }while(i<=x);
    }
}
