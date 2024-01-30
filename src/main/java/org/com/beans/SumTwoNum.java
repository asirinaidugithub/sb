package org.com.beans;

public class SumTwoNum {

    public static void main(String[] args) {
        SumTwoNum sumTwoNum = new SumTwoNum();
        System.out.println("sum of 1 and 305 is " + sumTwoNum.sumOfTwoNos("1", "305"));
        System.out.println("sum of 1 and 5 is " + sumTwoNum.sumOfTwoNos("1", "5"));
        System.out.println("sum of 1,234 and 1,234 is " + sumTwoNum.sumOfTwoNos("1,234", "1,234"));
        System.out.println("sum of 21,234 and 45,234 is " + sumTwoNum.sumOfTwoNos("21,234", "45,234"));
        System.out.println("sum of 1,111 and 1,111 is " + sumTwoNum.sumOfTwoNos("1,111", "1,111"));

//        System.out.println(sumTwoNum.sumOfTwoNos("573","54"));
    }

    public String sumOfTwoNos(String a, String b) {
        String result = "";
        int aLength = a.trim().length();
        int bLength = b.trim().length();
        int maxLength = aLength > bLength ? aLength : bLength;

        int firstDigit = 0;

        for (int i = 1; i <= maxLength; i++) {

            char strA = (aLength - i) > -1 ? a.charAt(aLength - i) : '0';
            char strB = (bLength - i) > -1 ? b.charAt(bLength - i) : '0';
            if (strA == ',' || strB == ',') {
                result = ((strA == ',') ? String.valueOf(strA) : String.valueOf(strB)) + result;
            } else {
                int charA = (aLength - i) > -1 ? Integer.parseInt(String.valueOf(a.charAt(aLength - i))) : 0;
                int charB = (bLength - i) > -1 ? Integer.parseInt(String.valueOf(b.charAt(bLength - i))) : 0;

                int sum = charA + charB + firstDigit;

                if (sum > 9) {
                    result = String.valueOf(sum).charAt(1) + result;
                    firstDigit = String.valueOf(sum).charAt(0);
                } else {
                    result = sum + result;
                }
            }
        }

        if (firstDigit > 0) {
            result = firstDigit + result;
        }

        return result;
    }
}
