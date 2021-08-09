import java.util.Scanner;

public class LongestPalendromicSubstring {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        String B =sc.next();
        char[]A=B.toCharArray();
        int g =0;
        for(int i =0;i<A.length;i++){
            for(int j =i;j<A.length;j++){
                String flag ="";
                for(int k =i;k<=j;k++){
                    flag=flag+(A[k]);;
                }if(palindrome(flag)){
                    if(flag.length()>g){
                        g=flag.length();}
                }
            }
        }System.out.println(g);
    }
    public static boolean palindrome(String B){
        char[]A=B.toCharArray();
        int s =0;
        int l =A.length-1;
        while(s<l){
            if(A[s]!=A[l]){
                return false;}   s++;
            l--;

        }

        return true; }
}


