package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner inp = new Scanner(System.in);
        double[] mass_otv;
        int col1 = inp.nextInt();
        mass_otv = new double[col1];
        for (int i=0; i <col1; i++){
            double x = inp.nextDouble();
            int col2 = inp.nextInt();
            double d = 0;
            double r = 1;

            for (int b = 0; b<col2;b++){
                d = x/r;
                r = (d+r)/2;

            }
            mass_otv[i]=r;
        }
        for (int z = 0; z<col1; z++){
            mass_otv[z] = mass_otv[z] * 1000;
            mass_otv[z] = (int)mass_otv[z];
            double otv = mass_otv[z]/1000.0;

            System.out.print(otv+" ");
        }
    }
}
