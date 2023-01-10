package BoxingMatch;

public class Fighter {
    String name;
    int weight;
    int damage;

    int health;
    double dodge;


    Fighter(String name,int health,int weight,int damage,double dodge){
        this.name=name;
        this.health=health;
        this.weight=weight;
        this.damage=damage;
        this.dodge=dodge;
    }

    int hit(Fighter opponent){ //hit sonrası can degeri


        if(opponent.isDodge()){
            System.out.println(opponent.name + " saldırıyı dodgeledi");
            return opponent.health;
        }
        System.out.println(this.name + " >>> "+ opponent.name+ "\t" + this.damage + " hassar vurdu.");

        if (opponent.health - this.damage < 0 ){
            return 0;
        }
        return opponent.health - damage;
    }

    boolean isDodge(){
        double randomDonge =Math.random() * 100;

        return this.dodge >= randomDonge;
    }



}
