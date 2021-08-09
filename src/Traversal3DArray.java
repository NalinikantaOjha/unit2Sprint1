import java.util.Scanner;

public class Traversal3DArray {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int T = sc.nextInt();
        int K =sc.nextInt();
        int A[][][]=new int [N][T][K];
        for(int i =0;i<N;i++){
            for(int j =0;j<T;j++){
                for(int k=0;k<K;k++){
                    A[i][j][k]=sc.nextInt();
                }
            }
        }
        for(int i =0;i<N;i++){
            for(int j =0;j<T;j++){
                for(int k=0;k<K;k++){
                    System.out.print(A[i][j][k]+" ");
                }System.out.println();
            }
        }
    }
}

