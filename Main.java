package com.company;

import java.util.Scanner;

public class Main {
    public static String translate_lower(int n, int cnt){
        if (n ==0){
            return 0+"";
        }
        int residue = n % cnt;

        if (n<cnt - 1){
            return residue+"";
        }
        int cur = (int)(n/cnt);
        return translate_lower(cur,cnt) + residue;
    }
    public static String translate_16(int n){
        
    }


    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(translate_lower(n,2));
        System.out.println(translate_lower(n,8));
    }
}
