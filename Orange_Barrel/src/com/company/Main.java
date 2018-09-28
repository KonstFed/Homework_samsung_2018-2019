package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int col = inp.nextInt();
        if ((col % 10 == 0) || (( col%10 >=5 ) && (col%10<=9))){
            System.out.println("bochek");
        }
        else if (col  % 10 == 1){
            System.out.println("bochka");
        }
        else{
            System.out.println("bochki");
        }
    }
}
