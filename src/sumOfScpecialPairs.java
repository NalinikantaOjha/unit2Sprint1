import java.util.Scanner;

public class sumOfScpecialPairs {

        public static void main(String[]args){
            //You are given an array A of N integers. Write
            // a program to find the sum of the absolute difference between
            // all such pairs (A[i], A[j]) such that i < j and ( j-i ) is prime.
            Scanner sc=new Scanner (System.in);
            int N =sc.nextInt();
            int A[]=new int [N];
            for(int i =0;i<N;i++){
                A[i]=sc.nextInt();
            }
            int sum =0;
            for(int i =0;i<N-1;i++){
                for(int j =i+1;j<N;j++){
                    if(isPrime(j-i)){
                        //  System.out.println(j-i);
                        sum =sum+Math.abs(A[j]-A[i]);

                    }
                }
            }System.out.println(sum);
        }
        public static boolean isPrime(int n){
            if(n==1){
                return false;
            }
            int count=0;
            for(int i =2;i<n;i++){
                if(n%i==0){
                    return false;
                }
            }return true;
        }
    }

