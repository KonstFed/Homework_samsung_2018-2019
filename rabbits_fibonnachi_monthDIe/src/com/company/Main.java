package com.company;

import java.util.Scanner;
import com.company.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //rabbits[] rabbit_list;
        ArrayList<rabbits> list = new ArrayList<rabbits>();
        rabbits r=new rabbits();
        r.month=0;
        list.add(r);
        Scanner inp = new Scanner(System.in);
        int cnt_rabbits = 1;
        int month = inp.nextInt();
        int month_life_rab = inp.nextInt();
        //rabbit_list = new rabbits[month_life_rab];
        //rabbit_list[0]=new rabbits();
        //rabbit_list[0].month=0;
        int adult = 0;
        int new_adult = 1;
        int new_children = 0;
        int cnt = 0;
        int children = 1;
        for (int i = 0; i<month-1; i++) {
            /*adult += new_children;
            children = new_adult;
            new_children = children;
            new_adult = adult;
            */
            int len=list.size();

            for (int b = 0; b < len; b++){
               r=list.get(b);
               r.month+=1;
               if (r.month > 1){
                   r=new rabbits();
                   r.month = 0;
                   list.add(r);
               }

            }
            for (int b = len-1; b >=0; b--){
                r=list.get(b);
                if (r.month >= month_life_rab){
                    list.remove(r);
                }
            }


        }

        System.out.println(list.size());
    }
}
