
import java.io.*;
import java.util.*;

public class PrimeFactors {

    public static void generate(int n) {
        while (n % 2 == 0) {
            System.out.print("2 ");
            n = n / 2;
        }
        int i;
        for( i = 3; i <= Math.sqrt(n); i = i +2) {
            while(n%i == 0) {
                System.out.print(i+" ");
                n = n/i;
            }
        }
        if (n>2)
            System.out.print(n);
    }

    public static void main(String[] args){
        int n,i,j,k;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter n:");
        n = s.nextInt();
        generate(n);
    }
}

