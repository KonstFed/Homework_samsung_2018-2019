package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int [] mas1;

        Scanner ins = new Scanner(System.in);
        int inp = ins.nextInt();
        mas1 = new int [inp];
        for ( int i = 0; i<mas1.length; i++) {
            mas1[i] = ins.nextInt();
            System.out.println(mas1[i]);
            int resent = mas1[i];
            int now = 0;
            int cnt = 0;
            while (true) {
                if (resent == now){
                    System.out.println(cnt);
                    break;
                }
                else {
                    now = resent;
                    now = now * now;
                    now = now / 100;
                    now = now % 10000;
                    cnt++;

                }

            }

        }
    }
}
