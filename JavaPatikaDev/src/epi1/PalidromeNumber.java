package epi1;

import java.util.Scanner;

public class PalidromeNumber {
    public static void main(String[] args) {
        int palidromeNumber;
        Scanner inp = new Scanner(System.in);

        System.out.println("Sayı giriniz : ");
        palidromeNumber = inp.nextInt();

        boolean isPalidromeNumber = isPalidromeNumber(palidromeNumber);

        if (isPalidromeNumber)
            System.out.println(palidromeNumber + " Palidrom sayıdır");
        else
            System.out.println(palidromeNumber + " Palidrom sayı degıldir");
    }

    static boolean isPalidromeNumber(int number) {
        int reverseNumber = reverseBumberMethod(number);

        if (reverseNumber == number)
            return true;

        return false;
    }

    static int reverseBumberMethod(int number) {
        int tempNumber = number, reverseNumber = 0, lastNumber;

        while (tempNumber != 0) {
            lastNumber = tempNumber % 10;

            reverseNumber = 10 * reverseNumber +lastNumber ;

            tempNumber /= 10;

        }
        return reverseNumber;
    }

}

