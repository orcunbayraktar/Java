package BoxingMachs;

public class Fighters {

    String name;
    int weight;
    int healty;

    int damagePerRound;

   int dodge;

    Fighters(String name, int weight, int healty, int damagePerRound, int dodge){
        this.name=name;
        this.weight=weight;
        this.healty=healty;
        this.damagePerRound=damagePerRound;
        this.dodge=dodge;
    }

    int hit(Fighters fighters){
        if (isDodge(fighters)){
            System.out.println(fighters.name + " saldırıdan kaçındı.");
            return fighters.healty;
        }
        System.out.println(this.name + " >>>>>>>>> "+ fighters.name + " " + this.damagePerRound + " damage vurdu");
        return fighters.healty - this.damagePerRound;
    }

    boolean isDodge( Fighters fighters){

        int randomNumber =(int) (Math.random() * 101);

        return (randomNumber > fighters.dodge) ? false : true;
    }








}
