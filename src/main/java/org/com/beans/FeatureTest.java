package org.com.beans;

public class FeatureTest {
    public static void main(String[] args) {
        long result = 98347923847l + 82934738;
        System.out.println(result + " : 98430858585");

        System.out.println("Sum of 98347923847 and 82934738 is " + sumWithComma("98347923847", "82934738"));
        //98430858585
        System.out.println("Sum of 39,84,22,398 and 93,84,92,384 is " + sumWithComma("39,84,22,398", "93,84,92,384"));
        //133,69,14,782
        System.out.println("Sum of 00993 and 93567 is " + sumWithComma("00993", "93567"));
        //94560
    }

    private static String sumWithComma(String a, String b) {
        String sb = new String();
        int alength = a.length();
        int blength = b.length();
        int longLength = alength >= blength ? alength : blength;
        int firstDigit = 0;
        for (int i = 1; i <= longLength; i++) {
            char chara = (alength - i) > -1 ? a.charAt(alength - i) : '0';
            char charb = (blength - i) > -1 ? b.charAt(blength - i) : '0';
            if (chara == ',' || charb == ',') {
                sb = (chara == ',') ? (chara + sb) : (charb + sb);
            } else {
                int charA = alength - i > -1 ? Integer.parseInt(String.valueOf(a.charAt(alength - i))) : 0;
                int charB = blength - i > -1 ? Integer.parseInt(String.valueOf(b.charAt(blength - i))) : 0;
                int sum = charA + charB + firstDigit;
                String sumStr = String.valueOf(sum);
                if (sum > 9) {
                    firstDigit = Integer.parseInt(String.valueOf(sumStr.charAt(0)));
                    sb = sumStr.charAt(1) + sb;
                } else {
                    firstDigit = 0;
                    sb = sumStr.charAt(0) + sb;
                }
            }
        }
        if (firstDigit > 0) {
            sb = firstDigit + sb;
        }
        return sb;
    }

    private static String sum(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int alength = a.length();
        int blength = b.length();

        int longLength = alength >= blength ? alength : blength;

        int firstDigit = 0;

        for (int i = 1; i <= longLength; i++) {
            char chara = alength - i > -1 ? a.charAt(alength - i) : '0';
            char charb = blength - i > -1 ? b.charAt(alength - i) : '0';

            int charA = alength - i > -1 ? Integer.parseInt(String.valueOf(a.charAt(alength - i))) : 0;
            int charB = blength - i > -1 ? Integer.parseInt(String.valueOf(b.charAt(blength - i))) : 0;
            int sum = charA + charB + firstDigit;
            String sumStr = String.valueOf(sum);
            if (sum > 9) {
                firstDigit = Integer.parseInt(String.valueOf(sumStr.charAt(0)));
                sb.append(sumStr.charAt(1));
            } else {
                firstDigit = 0;
                sb.append(sumStr.charAt(0));
            }
        }
        if (firstDigit > 0) {
            sb.append(firstDigit);
        }

        return sb.reverse().toString();
    }

}
