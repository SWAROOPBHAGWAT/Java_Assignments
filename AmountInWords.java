package myPackage;

import java.util.Scanner;

public class AmountInWords {
    //string type array for one digit numbers
    private static final String[] tens = {"", " Ten", " Twenty", " Thirty", " Forty", " Fifty", " Sixty", " Seventy", " Eighty", " Ninety"};
    //string type array for two digits numbers
    private static final String[] units = {"", " One", " Two", " Three", " Four", " Five", " Six", " Seven", " Eight", " Nine", " Ten", " Eleven", " Twelve", " Thirteen", " Fourteen", " Fifteen", " Sixteen", " Seventeen", " Eighteen", " Nineteen"};
    private static String convert;
    //defining constructor of the class

    public static String convert(int n) {
        if (n < 20) {
            return units[n];
        }

        if (n < 100) {
            return tens[n / 10] + ((n % 10 != 0) ? "" : "") + units[n % 10];
        }
        if (n < 1000) {
            return units[n / 100] + " hundred" + ((n % 100 != 0) ? "" : "") + convert(n % 100);
        }
        if (n < 100000) {
            return convert(n / 1000) + " thousand" + ((n % 1000 != 0) ? "" : "") + convert(n % 1000);
        }
        if (n < 10000000) {
            return convert(n / 100000) + " lakh" + ((n % 100000 != 0) ? "" : "") + convert(n % 100000);
        }
        return convert(n / 10000000) + " crore" + ((n % 10000000 != 0) ? "" : "") + convert(n % 10000000);
    }
        public static void main ( final String[] args){

            int n;
            Scanner s = new Scanner(System.in);
            System.out.println("Enter a amount to convert into word :");
            n = s.nextInt();
            System.out.println(convert(n));
        }
    }





