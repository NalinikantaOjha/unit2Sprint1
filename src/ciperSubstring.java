import java.util.Scanner;

public class ciperSubstring {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int t=0;t<T;t++){
            int N =sc.nextInt();
            String A=sc.next();
            int i=0;
            String result="";
            for (i=0;i<A.length();i++){
                int count=0;
                int j=i;

                for (j=i;j<A.length();j++){
                    if (A.charAt(i)!=A.charAt(j)){
                        break;
                    }else {
                        count++;
                    }
                }

                result=result+A.charAt(i)+count;
                i=j-1;

            }

            System.out.println(result);
        }
    }
}

