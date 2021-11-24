package jp.ac.uryukyu.ie.e205711;

public class Hero extends LivingThing{

    public Hero(String name, int maximumHP, int attack){
        super(name, maximumHP, attack);
    }

    @Override
    public void wounded(int damage){
        hitPoint -= damage;
        if( isDead() ) {
            System.out.printf("勇者%sは道半ばで力尽きてしまった。\n", getName());
        }
    }
}