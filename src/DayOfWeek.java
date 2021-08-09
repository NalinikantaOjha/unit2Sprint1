import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        int N = sc.nextInt();
        String[] B = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday",
                "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        if (N <= 7) {
            for (int i = 0; i < B.length; i++) {
                if (A.equals(B[i])) {
                    System.out.println(B[i + N]);
                    break;

                }
            }
        } else {
            N = N % 7;
            for (int i = 0; i < B.length; i++) {
                if (A.equals(B[i])) {
                    System.out.println(B[i + N]);
                    break;
                }
            }
        }
    }

}