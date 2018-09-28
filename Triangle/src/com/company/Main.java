package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int col = inp.nextInt();
        for (int i = 1; i<col;i++){
            int lenght1 = inp.nextInt();
            int lenght2 = inp.nextInt();
            int lenght3 = inp.nextInt();
            if (lenght1+lenght2>lenght3){
                System.out.println(1);
            }
            else if (lenght2+lenght3>lenght1){
                System.out.println(1);
            }
            else if (lenght1+lenght3<lenght2){
                System.out.println(1);
            }
            else{
                System.out.println(0);
            }
        }

    }
}
