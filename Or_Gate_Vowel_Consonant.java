package pkgnew.mission;
import java.util.Scanner;

public class Or_Gate_Vowel_Consonant {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);        
        System.out.print("Enter tha Letter: ");
        char x = input.next().charAt(0);
        
        if(x=='a' || x=='e' || x=='i' || x=='o' || x=='u' || x=='A' || x=='E' || x=='I' || x=='O' || x=='U'){
            System.out.println("Vowel");
        }else{
            System.out.println("Consonant");
        }
    }
}