import java.util.Scanner;

public class SpiralTraversal {
    public static void main(String []args){
        Scanner sc =new Scanner(System.in);

        int N =sc.nextInt();
        int A[][]=new int [N][N];
        for(int i =0;i<N;i++){
            for(int j =0;j<N;j++){
                A[i][j]=sc.nextInt();
            }
        }
        int left =0;
        int count =0;
        int right =N-1;int top=0;int buttom=N-1;
        while(count<N*N){
            for(int i =left;i<=right;i++){
                if(count<N*N){
                    System.out.print(A[top][i]+" ");
                    count++;
                }
            }   top++;
            for(int i =top;i<=buttom;i++){
                if(count<N*N){
                    System.out.print(A[i][right]+" ");
                    count++;
                }
            }right--;
            for(int i =right;i>=left;i--){
                if(count<N*N){
                    System.out.print(A[buttom][i]+" ");
                    count++;
                }
            }buttom--;
            for(int i =buttom;i>=top;i--){
                if(count<N*N){
                    System.out.print(A[i][left]+" ");
                    count++;
                }
            }left++;
        }
    }

}
