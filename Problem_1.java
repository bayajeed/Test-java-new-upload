// Print sum of all the number 1 to 10
package pkgnew.mission;
public class Problem_1 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum = sum + i;
            System.out.println( i+ " No line Sum = " +sum); // Line by line sum print
        }
        System.out.println("\nTotal = " +sum+ "\n\n"); // Total sum print
    }
    
}
