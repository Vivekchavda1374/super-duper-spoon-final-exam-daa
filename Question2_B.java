import java.util.Scanner;

public class Question2_B {
    

    public static int findMaxCount(int n,int x,int y , int z) {
        int count = 0;
        if (n %x!=0) {
            n /= x;
            count++;
        }
        if(n% y!=0) {
            n /= y;
            count++;
        }
        if (n%z != 0) {
            n /= z;
            count++;
        }

        return count !=0 ?count : 0;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int maxCount = findMaxCount(n, x, y, z);
        System.out.println(maxCount);

        
        
    }
}
