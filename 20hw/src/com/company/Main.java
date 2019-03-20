package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void addStrings(ArrayList<String> a, String pathfile)
    {
        File firstTome = new File(pathfile);
        try {

            Scanner sc = new Scanner(firstTome);
            while (sc.hasNextLine())
            {
                String s = sc.nextLine();
                a.add(s);
            }
            sc.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println("HELP FILE DIDNT FOUND");
        }
    }
    public static void main(String[] args) {
	// write your code here

        ArrayList<String> tmp  = new ArrayList<String>();
        String pathfile = new String("C:\\20hw\\src\\WarAndPeace1.txt");

        addStrings(tmp,"C:\\20hw\\src\\WarAndPeace1.txt");
        addStrings(tmp,"C:\\20hw\\src\\WarAndPeace2.txt");
        addStrings(tmp,"C:\\20hw\\src\\WarAndPeace3.txt");
        addStrings(tmp,"C:\\20hw\\src\\WarAndPeace4.txt");
        HashSet<String> warpeace = new HashSet<>();
        for (String j:tmp) {
            if  (j!="") {
                String[] s = j.split("[ -]");
                for (int c = 0; c < s.length; c++) {
                    String tm = s[c].replaceAll("[.,/!?*&1234567890#$%^<>»(){}\\r\\n\\t\\]\\[…;IVX]", "");
                    tm.toLowerCase();
                    Pattern p = Pattern.compile("[a-z]");
                    Matcher m = p.matcher(tm);

                    if (tm != "" && tm.length()>2 && !m.find()) {
                        if (tm == "")
                        {
                            System.out.println("h1");
                        }
//                        System.out.println(s[c]+" ");
                        warpeace.add(tm);
//                        System.out.println(s[c].replaceAll("[.,!?*&1234567890#$%^]", "")+ " ");
//                        System.out.println(" * n * ");
                    }
                }
            }
        }
        ArrayList<String> warpeac = new ArrayList<>(warpeace);

        Collections.sort(warpeac,new CompareWar());
        System.out.println("1 "+warpeac.get(0)+ " 2:" + warpeac.get(warpeac.size()-1));
        Collections.sort(warpeac,new MostGlasn());
        System.out.println("1 "+warpeac.get(0)+ " 2:" + warpeac.get(warpeac.size()-1));
        Collections.sort(warpeac,new MostSogl());
        String[] ab = warpeac.get(warpeac.size()-1).split("");


        System.out.println("1 "+warpeac.get(0)+ " 2:" + warpeac.get(warpeac.size()-2));
        String[] a = warpeac.get(warpeac.size()-2).split("");
        boolean f = false;
        int cnta = 0;
        int cntb = 0;
        f = false;
        int bestb = cntb;
        int besta = 0;
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
        System.out.println(besta);
    }
}
