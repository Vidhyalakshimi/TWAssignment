/**
 * Created by Vidhya on 07-07-2016.
 */

import java.io.*;
import java.util.*;

public class HorizontalLine {
    public static void FizzBuzz() {
        int i;
        for (i = 1; i <= 100; ++i ) {
            if(i % 3 == 0)
                System.out.print("Fizz");
            if(i % 5 == 0)
                System.out.print("Buzz");
            if(i % 5 != 0 && i%3 != 0 )
                System.out.print(i);
            System.out.println();
        }

    }
    public static void main(String[] args){
        FizzBuzz();
    }
}

