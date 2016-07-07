/**
 * Created by Vidhya on 07-07-2016.
 */

import java.io.*;
import java.util.*;

public class HorizontalLine {
    public static void main(String[] args){
        int n,i;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter n:");
        n = s.nextInt();
        for(i=0; i<n; ++i)
            System.out.print("*");
    }
}

