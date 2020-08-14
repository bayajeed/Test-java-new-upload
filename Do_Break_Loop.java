package pkgnew.mission;
import java.util.Scanner;
public class Do_Break_Loop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        
        int i = 0;
        do{
            System.out.println(i);
            i++;
                    if(i==50){
                        break; // if I use continue then Skip 50 and print 1 to 100
                    }
        }while(i<=x);
    }
    
}
