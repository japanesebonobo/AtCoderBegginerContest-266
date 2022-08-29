import java.util.Scanner;
 
public class A_MiddleLetter  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        String S = scanner.next();
        char ans;
        scanner.close();
        int length = S.length();

        ans = S.charAt(length/2);
       
        System.out.println(ans);
    }
}