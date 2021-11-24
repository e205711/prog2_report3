package jp.ac.uryukyu.ie.e205711;

public class Enemy extends LivingThing{

    public Enemy(String name, int maximumHP, int attack){
        super(name, maximumHP, attack);
    }

    @Override
    public void wounded(int damage){
        hitPoint -= damage;
        if( isDead() ) {
            System.out.printf("モンスター%sは倒れた。\n", getName());
        }
    }

}