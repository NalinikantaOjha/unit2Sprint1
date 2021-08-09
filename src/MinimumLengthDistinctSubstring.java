import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MinimumLengthDistinctSubstring {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        int count=0;
        String f=con(A);
        int grather=1000000000;

        //  System.out.println(f);
        int count1=0;
        for(int i =0;i<A.length();i++) {
            for (int j = i; j < A.length(); j++) {
                String C = "";
                for (int k = i; k <= j; k++) {
                    C = C + A.charAt(k);
                }//String f=con(C);
                // System.out.println(C);
                if (chek(C,f)){
                    // System.out.println(C);
                    if(C.length()<grather){
                        grather=C.length();
                        // System.out.println(C);
                    }
                }
            }

        } System.out.println(grather);

    } public static boolean chek(String A,String B){
        int count=0;
        for (int j=0;j<B.length();j++) {
            int temp = 0;
            for (int i = 0; i < A.length(); i++) {

                if (B.charAt(temp) == A.charAt(i)) {
                    // System.out.println(B.charAt(temp));

                    count++;
                    temp++;
                }if (temp==B.length()){
                    return true;
                }

            }
        }
        if (count==B.length()*B.length()){
            return true;
        }else {
            return false;
        }

    }public static String con(String A){
        String B ="";
        LinkedHashMap<Character,Integer> hashMap=new LinkedHashMap<>();
        for (int i =0;i<A.length();i++){
            if(hashMap.containsKey(A.charAt(i))){
                int count =hashMap.get(A.charAt(i));
                hashMap.put(A.charAt(i),count++);
            }else {
                hashMap.put(A.charAt(i),1);
            }
        }
        for (Map.Entry<Character,Integer>map:hashMap.entrySet()){
            B=B+map.getKey();
        }
        return B;
    }
}

