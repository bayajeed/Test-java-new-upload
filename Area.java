package pkgnew.mission;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        
        Scanner input= new Scanner(System.in);
        double b,h, result;
        
        System.out.print("Enter the value of Bas:");
        b = input.nextDouble();
        System.out.print("Enter the value of Heigh:");
        h = input.nextDouble();
        
        result = 0.5 * (b * h);// rectangal area Formula
        System.out.print("Result: "+result);
        
    }
    
}
