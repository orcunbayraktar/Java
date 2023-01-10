package epi1;

import java.util.Scanner;

public class KdvCalculation {
    public static void main(String[] args) {
        double productPrice,kdvRatio,productKdvPrice;

        Scanner scn = new Scanner(System.in);

        System.out.println("Kdv hesaplatmak istediginiz urunun fiyatını giriniz : ");
        productPrice = scn.nextDouble();

        kdvRatio = (productPrice > 0 && productPrice <1000) ? 0.18 : 0.08;
        productKdvPrice = productPrice * kdvRatio;


        //tl min ucret 1 kuruş 0.00 nere kadar yazdırıyoruz
        System.out.printf("\nUrunuzun KDV'siz tutari : %.2f", productPrice );
        System.out.printf("\nUrunuzun KDV'li tutari : %.2f", productKdvPrice + productPrice);
        System.out.printf("\nUrunuzun KDVsi : %.2f\n", productKdvPrice);

    }
}
