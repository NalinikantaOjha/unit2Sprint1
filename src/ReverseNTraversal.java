import java.util.Scanner;

public class ReverseNTraversal {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int t =0;t<T;t++){
            int N = sc.nextInt();
            int A[][]=new int [N][N];
            for(int i =0;i<N;i++){
                for(int j =0;j<N;j++){
                    A[i][j]=sc.nextInt();
                }
            }
            int top =0;
            int b =N-1;
            int l=0;
            int r=N-1;
            for(int i =0;i<N-1;i++){
                System.out.print(A[i][l]+" ");
            }
            int temp=N-1;
            for(int i =0;i<N;i++){
                System.out.print(A[temp][i]+" ");
                temp--;
            }
            for(int i =1;i<N;i++){
                System.out.print(A[i][r]+" ");

            }System.out.println();

        }
    }
}
