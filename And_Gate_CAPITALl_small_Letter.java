
package pkgnew.mission;
import java.util.Scanner;
public class And_Gate_CAPITALl_small_Letter {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a Letters: ");
        char letters = input.next().charAt(0);
        if(letters >='a' && 'z'>= letters){
            System.out.println(letters+" is small letters");
        }else if(letters >= 'A' && letters<='Z'){
            System.out.println(letters+" is CAPITAL letters");
        }else{
            System.out.println("Plese enter a Letters ");
        }
    }
}
