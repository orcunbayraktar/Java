package epi1;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        int perfectNumber,sum=0;

        Scanner input=new Scanner(System.in);

        System.out.print("Bir sayı giriniz : ");
        perfectNumber=input.nextInt();

        for (int i=1 ; i<perfectNumber ; i++){
                if (perfectNumber % i ==0 ){
                    sum+=i;
                }
        }
        if (sum==perfectNumber){
            System.out.println( perfectNumber + " Mükkemmel sayıdır");
        }else
            System.out.println( perfectNumber + " Mükkemmel sayı değildir");


    }
}
