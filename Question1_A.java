
import java.util.Scanner;



public class Question1_A {

    public static int LCS(String X ,String Y) 
    
    {
        int m = X.length();
        int n = Y.length();

        int[][] dp = new int[m+1][n+1];
        for(int i = 1;i<=m;i++){
            for(int j = 1;j<=n;j++){
                if(X.charAt(i-1)==Y.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+1;

                }else{
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[m][n];
    }
    public static String LCSeq(String X ,String Y) 
    
    {
        int m = X.length();
        int n = Y.length();

        int[][] dp = new int[m+1][n+1];
        for(int i = 1;i<=m;i++){
            for(int j = 1;j<=n;j++){
                if(X.charAt(i-1)==Y.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+1;

                }else{
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        StringBuilder LCS = new StringBuilder();
        int i = m , j = n;
        while(i>0 && j>0){
            if(X.charAt(i-1)==Y.charAt(j-1)){
                LCS.insert(0, X.charAt(i-1));
                i--;
                j--;
            }else if(dp[i-1][j]>dp[i][j-1]){
                i--;
            }else{
                j--;
            }
        }
        return LCS.toString();
        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x,y;
        x = sc.nextLine();
        y = sc.nextLine();
        int lcs =  LCS(x,y);
        String lcs1 = LCSeq(x,y );
        System.out.println("Length:"+lcs);
        System.out.println("Length:"+lcs1);
    }
    
}
