package epi1;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        int number;
        boolean isPrimeNumber=true;

        System.out.println("1-100 kadar asal sayıları bulma");

        for(int i=2 ; i<=100; i++){
            //bu boolen for dışı alırsan devamlı asal olayanda kalır
            isPrimeNumber=true;
            for (int j=2;j<i;j++){
                if(i % j == 0){
                  isPrimeNumber=false;
                  break;
                }
            }
            if(isPrimeNumber){
                System.out.print(i + " ");
            }
        }


    }
}
/*
System.out.println("1-den 100dilediğiniz sayiya kadar asal sayıları bulma\nSayiyi giriniz");
        number=input.nextInt();
 */