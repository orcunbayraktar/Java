package epi1;

public class ArrayMaxMin {
    public static void main(String[] args) {

        int [] list = {1,2,3,4,5,6,7,8,9,10,11};
        int minListElement=list[0];
        int maxListElement=list[0];

        for (int i = 0; i < list.length; i++) {
            if(i < minListElement)
                minListElement=i;

            if(i > maxListElement)
                maxListElement=i;
        }
        System.out.println("Min : " + minListElement);
        System.out.println("Max : " + maxListElement);
    }
}
