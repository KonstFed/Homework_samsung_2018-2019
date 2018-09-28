package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner inp = new Scanner(System.in);
        int col = inp.nextInt();
        long[] mas;
        mas = new long[col];
        long x = 0;
        for(int i = 0; i < col; i++){
            mas[i] = inp.nextLong();
        }
        for(int b = 0; b < col; b++){
            x = ((mas[b]+x)*113)%10000007;
        }
        System.out.println(x);
    }
}
