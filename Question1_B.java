
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Question1_B {
   public static void Coin(int[] coins ,int amount){
       Arrays.sort(coins);
       ArrayList<Integer> ans = new ArrayList<Integer>();
       int coinCount = 0;
   
       for(int i = coins.length-1 ; i >=0 ; i--){
           if(coins[i] <= amount){
           while(coins[i]<=amount){
               coinCount++;
               ans.add(coins[i]);
               amount -= coins[i];
        }
    }  
    }
    System.out.println("Coin count is :" + coinCount);

    for(int i = 0 ; i < ans.size() ; i++){
        System.out.println("Coins are "+ans.get(i));
    }

   }
    public static void main(String[] args) {
       Scanner sc  = new Scanner(System.in);
       System.out.println("enter the amount of coins for array");
        int n = sc.nextInt();
        System.out.println("enter total amount");
        int amount = sc.nextInt();;
        int[] coins =new int[n];
        System.out.println("enter amount which we have ");
        for(int i = 0 ; i < coins.length ; i++){
            coins[i] = sc.nextInt();
        }
        Coin(coins, amount);
        
   } 
}
