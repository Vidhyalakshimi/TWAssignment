import java.io.*;
import java.util.*;

public class VerticalLine {
    public static void main(String[] args){
        int n,i;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter n:");
        n = s.nextInt();
        for(i=0; i<n; ++i)
            System.out.println("*");
    }
}