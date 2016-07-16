
import java.io.*;
import java.util.*;

public class Diamond {
     public static void main(String[] args){
        int n,i,j,k;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter n:");
        n = s.nextInt();
        for(i = n, k = 0; i > 0 && k < (n*n+n)/2; --i,k= k + 2) {
            for(j = 1; j < i; ++j)
                System.out.print(" ");
            for(j = 0; j <= k; ++j)
                System.out.print("*");
            System.out.println();
        }
        for(i = 1, k = (n*n-n)/2 - 1; i <= n && k >= 0 ; ++i,k= k - 2) {
            for(j = 1; j <= i; ++j)
                System.out.print(" ");
            for(j = 0; j <= k; ++j)
                System.out.print("*");
            System.out.println();
        }
    }
}

