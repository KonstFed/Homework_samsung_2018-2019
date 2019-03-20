package com.company;

import java.util.Comparator;
import java.util.regex.Pattern;

public class MostSogl implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        String[] a = o1.split("");
        String[] b = o2.split("");
        boolean f = false;
        int cnta = 0;
        int cntb = 0;
        int bestb = cntb;
        int besta = cnta;
        for (int i = 0; i < a.length; i++) {
            if (f) {
                if (Pattern.matches("[бвгджзйклмнпрстфхчцпщ]", a[i])) {
                    cnta++;
                    if (cnta > besta) {
                        besta = cnta;
                    }
                } else {
                    f = false;
                    cnta = 0;
                }
            } else {
                if (Pattern.matches("[бвгджзйклмнпрстфхчцпщ]", a[i])) {
                    cnta++;
                    f = true;
                }
            }
        }
        f = false;
        for (int i = 0; i < b.length; i++) {
            if (f) {
                if (Pattern.matches("бвгджзйклмнпрстфхчцпщ", b[i])) {
                    cntb++;

                    if (cntb > bestb) {
                        bestb = cntb;
                    }
                } else {
                    f = false;
                    cntb = 0;
                }
            } else {
                if (Pattern.matches("бвгджзйклмнпрстфхчцпщ", b[i])) {
                    cntb++;
                    f = true;
                }
            }
        }
        return besta - bestb;
    }
}