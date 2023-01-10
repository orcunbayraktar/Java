package epi1;

import java.util.Scanner;

public class GradePointAvg {
    public static void main(String[] args) {
        double coursePassingGrade=60.0;
        int gradePointMath,gradePointPhysics,gradePointChemistry ,gradePointHistory,gradePointTurkish,gradePointMusic;
        String str=" notunuzu giriniz : ";

        Scanner scn=new Scanner(System.in);

        System.out.println("Matematik" + str);
        gradePointMath=scn.nextInt();

        System.out.println("Fizik" + str);
        gradePointPhysics=scn.nextInt();

        System.out.println("Kimya" + str);
        gradePointChemistry=scn.nextInt();

        System.out.println("Tarih" + str);
        gradePointHistory=scn.nextInt();

        System.out.println("Türkçe" + str);
        gradePointTurkish=scn.nextInt();

        System.out.println("Müzik"+ str);
        gradePointMusic=scn.nextInt();

        double avgGradePoint=(gradePointMath + gradePointChemistry + gradePointPhysics + gradePointHistory + gradePointTurkish + gradePointMusic)/6.0;

        String courseStatus = (avgGradePoint > coursePassingGrade) ? "Tekrikler sinifi gecdiniz " : "Malesef Sinifda kaldiniz";

        System.out.printf(courseStatus + "\nOrtalama Ders notunuz : %.2f" , avgGradePoint);

    }
}
