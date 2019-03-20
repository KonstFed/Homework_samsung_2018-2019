package com.company;

import java.util.Comparator;
import java.util.regex.Pattern;

public class MostGlasn implements Comparator<String> {

    @Override
    public int compare(String a, String b) {
        String[] ab = a.split("");
        String[] ac = b.split("");
        String regInter = "[ауоыиэяюёеAEIOUYАУОЫИЭЯЮЁЕaeiouy]";

        int abcnt = 0;
        int accnt = 0;
        for (int i = 0; i < ab.length; i++) {
            if (Pattern.matches("[ауоыиэяюёеАУОЫИЭЯЮЁЕ]",ab[i]  )){
                abcnt++;
            }
        }
        for (int i = 0; i < ac.length; i++) {
            if (Pattern.matches("[ауоыиэяюёеАУОЫИЭЯЮЁЕ]",ac[i])){
                accnt++;
            }
        }
        return abcnt - accnt;
    }
}
