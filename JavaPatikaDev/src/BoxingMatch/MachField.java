package BoxingMatch;

public class MachField {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    MachField(Fighter f1,Fighter f2,int minWeight,int maxWeight){
        this.f1=f1;
        this.f2=f2;
        this.minWeight=minWeight;
        this.maxWeight=maxWeight;
    }

    void run(){
        if (ischeckWeight()){
            if(isFirstOpponentStartMach()) {
                int i = 1;
                while (f1.health > 0 && f2.health > 0) {
                    System.out.println("\t-------" + " " + i + ". RAUND BAŞLIYOR-------\t");
                    f2.health = f1.hit(f2);
                    if (isWin()) {
                        break;
                    }

                    f1.health = f2.hit(f1);
                    if (isWin()) {
                        break;
                    }

                    printScore();
                    i++;
                }
            }else{
                int i=1;
                while(f1.health > 0 && f2.health > 0){
                    System.out.println("\t-------" + " " + i + ". RAUND BAŞLIYOR-------\t");
                    f1.health = f2.hit(f1);
                    if (isWin()){
                        break;
                    }

                    f2.health = f1.hit(f2);
                    if (isWin()){
                        break;
                    }
                    printScore();
                    i++;
                }
            }
        }
        else{
            System.out.println("Sporcular ağırlıkları birbirine uymuyor");
        }
    }

    boolean ischeckWeight(){
        return (f1.weight >=minWeight && f1.weight <=maxWeight) && (f2.weight >=minWeight && f2.weight <=maxWeight) ;
    }

    boolean isWin(){
        if(f1.health==0){
            System.out.println("Maçı " + f2.name + " kazandı");
            return true;
        }

        else if(f2.health==0){
            System.out.println("Maçı " + f1.name + " kazandı");
            return true;
        }

        return false;
    }

    public void printScore() {
        System.out.println(f1.name + " Kalan Can :" + f1.health);
        System.out.println(f2.name + " Kalan Can :" + f2.health);
    }

    boolean isFirstOpponentStartMach(){
        double random = Math.random() * 100;
        if(random >= 0 && random < 50){
            System.out.println("Karşılaşmaya " + f1.name + " başlıyor.");
            return true;
        }
        System.out.println("Karşılaşmaya " + f2.name + " başlıyor.");
        return false;
    }





}
