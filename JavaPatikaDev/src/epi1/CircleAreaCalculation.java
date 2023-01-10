package epi1;

import java.util.Scanner;

public class CircleAreaCalculation {
    public static void main(String[] args) {
        int radius,centerAngleMeasure;

        Scanner scn = new Scanner(System.in);

        System.out.printf("Hesaplatmak istediginiz dairenin yaricapini giriniz: ");
        radius = scn.nextInt();
        System.out.printf("Hesaplatmak istediginiz dairenin merkez aci olcusunu giriniz: ");
        centerAngleMeasure = scn.nextInt();

        double circleArea= Math.PI * radius * radius * centerAngleMeasure / 360.0;
        System.out.println("Dairenin alanı : " + circleArea);

    }
}
