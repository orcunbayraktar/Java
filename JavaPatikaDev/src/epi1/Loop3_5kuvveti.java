package epi1;

import java.util.Scanner;
/*
Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.
 */
public class Loop3_5kuvveti {
    public static void main(String[] args) {
        int number;

        Scanner input=new Scanner(System.in);
        System.out.print("Sayi giriniz : ");
        number=input.nextInt();

        System.out.print("4'ün kuvvetleri : ");
        for(int i=1, j=1;i<=number;i*=4){
            System.out.print(i +" ");
        }
        System.out.print("\n5'ün kuvvetleri : ");
        for(int j=1;j<=number;j*=5){
            System.out.print(j +" ");
        }
    }
}
