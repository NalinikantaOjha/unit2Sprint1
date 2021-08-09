import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Handler;

public class DetectPalindromeKeyValuePair {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int T= sc.nextInt();
        for(int t =0;t<T;t++){
            int N = sc.nextInt();
            String A = sc.next();
            char[]B=A.toCharArray();
            if(N%2==0){
                HashMap<Character,Integer>hashMap=new HashMap<>();
                int cou=0;
                for(int i =0;i<N;i++){
                    if(hashMap.containsKey(B[i])){
                        int count = hashMap.get(B[i]);
                        hashMap.put(B[i],count+1);
                    }else{hashMap.put(B[i],1);
                    }
                }
                for(Map.Entry<Character,Integer>map:hashMap.entrySet()){
                    if(  map.getValue()%2==1){cou++;

                    }

                }
                if(cou==0){
                    System.out.println("Possible!");
                }  else{ System.out.println("Not Possible!");
                }

            }else{
                HashMap<Character,Integer> hashMap=new HashMap<>();
                int cou=0;
                for(int i =0;i<N;i++){
                    if(hashMap.containsKey(B[i])){
                        int count = hashMap.get(B[i]);
                        hashMap.put(B[i],count+1);
                    }else{hashMap.put(B[i],1);
                    }
                }
                for(Map.Entry<Character,Integer>map:hashMap.entrySet()){
                    if(  map.getValue()%2==1){cou++;

                    }

                }
                if(cou==1){
                    System.out.println("Possible!");
                } else{ System.out.println("Not Possible!");
                }
            }
        }
    }

}
