package pkgnew.mission;
import java.util.Scanner;
public class Even_Odd {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
                
        System.out.print("Enter the value: ");
        int x = input.nextInt();
        if(x%2==0){
            System.out.println("Your value is Event: " +x);
        }else{
            System.out.println("Your Value is Odd: " +x);
        }
        
        // Odd Even use to Loop
        for(int i=1; i<=x; i++){
            if(i%2==0){
                System.out.println(i+" Even ");
            }//else{
                //System.out.print(i);
            }
        }
    }
