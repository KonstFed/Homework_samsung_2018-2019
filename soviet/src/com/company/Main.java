package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner inp = new Scanner(System.in);
        int len = inp.nextInt();

        String answer = "";
        String  notanswer = "";
        for (int i = 0; i<=len - 1; i++){
            int key = inp.nextInt();
            String str = inp.nextLine();




                for (int b = 0; b < key ; b++) {
                    if (key >= 0) {
                        if (b <= key - 1) {
                            answer = answer + str.charAt(b);
                        } else {
                            notanswer = notanswer + str.charAt(b);
                        }

                    } else {
                        if (-b <= key - 1) {
                            answer = answer + str.charAt(key - b - 1);
                        } else {
                            notanswer = notanswer + str.charAt(b);
                        }

                    }
                }

                if (key > 0){
                    System.out.print(notanswer + answer + " ");
                }
                else {
                    System.out.print(answer + notanswer + " ");
                }
                answer = "";
                notanswer = "";
        }






    }
}
