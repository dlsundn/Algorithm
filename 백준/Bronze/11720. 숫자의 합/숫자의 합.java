//  숫자의 합

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String num = sc.next();

        String [] arr  = num.split("");

        int sum = 0;

        for(int i = 0; i < arr.length; i++){
            sum += Integer.parseInt(arr[i]);
        }

        System.out.println(sum);
    }
}