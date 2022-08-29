import java.util.Scanner;

public class B_ModuloNumber  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        long N = scanner.nextLong();
        scanner.close();
        int mod = 998244353; 
        long ans = 0;
        
        while(N < 0) {
            N+=mod;
        }
        ans=N%mod;
        
        System.out.println(ans);
    }
}