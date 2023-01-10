package BoxingMatch;

public class Main {
    public static void main(String[] args) {
        Fighter lale =new Fighter("Lale",100,60,20,40);
        Fighter nese =new Fighter("Neşe",70,80,60,40);

        MachField mach1 = new MachField(lale,nese,60,100);
        mach1.run();
    }
}
