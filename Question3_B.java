
import java.util.Scanner;

public class Question3_B {
    static  final int INF = 99999;
    public static void floydWarshall(int[][] graph){
        int V= graph.length;
        int[][] dist = new int[V][V];

        for(int i=0;i<V;i++){
            for(int j=0;j<V;j++){
                dist[i][j] = graph[i][j];

            }

        }
        for(int k = 0 ; k<V;k++){
            for(int i = 0 ; i<V;i++){
             for(int j = 0 ; j<V;j++){
                if(dist[i][k]+dist[k][j] < dist[i][j]){
                    dist[i][j] = dist[i][k]+dist[k][j];
                }
             }      
            }        }
            printlnSolution(dist);

    }
    public static void printlnSolution(int[][] dist){
        int V = dist.length;
        System.out.println("sortest path");
        for(int i = 0; i<V;i++){
            for(int j = 0;j<V;j++){
                if(dist[i][j]==INF){
                    System.out.print("  Infinite");
                }else{
                    System.out.print(dist[i][j]+ " ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("n size");
        // int n = sc.nextInt();
        // System.out.println("m size");
        // int m = sc.nextInt();

        // int[][] graph = new int[n][m];
        // for(int i = 0 ; i<n ; i++){
        //     for(int j = 0 ; j<n ; j++){
        //         graph[i][j ] =sc.nextInt();
        //     }
        // }
        int graph[][] = {
            
            {0,3,INF,INF,INF,INF},
            {2,0,INF,INF,INF,INF},
            {INF,7,0,1,INF,2},
           

            };
        
        floydWarshall(graph);
    }
}
