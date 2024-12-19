
import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        System.out.println("Prime factors of " + num + ": " + primeFactors(num));
        
    }
    
    public static String primeFactors(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                sb.append(i).append(" ");
                n /= i;
            }
        }
        return sb.toString().trim();
    }
}
