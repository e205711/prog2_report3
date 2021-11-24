package jp.ac.uryukyu.ie.e205711;

public class LivingThing {
    String name;
    int hitPoint;
    int attack;
    boolean dead;

    /**
     * 死亡を判定するメソッド。
     * HPが0より小さい時、生死状態を死亡に変更する。
     * @return 対象の生死状態
     */
    public boolean isDead(){
        if( hitPoint < 0 ) {
            dead = true;
        }
        return dead;
    }

    /**
     * 名前を参照するメソッド。
     * @return 対象の名前
     */
    public String getName(){
        return this.name;
    }

    /**
     * コンストラクタ。名前、最大HP、攻撃力を指定する。
     * @param name 対象の名前
     * @param maximumHP 対象のHP
     * @param attack 対象の攻撃力
     */
    public LivingThing (String name, int maximumHP, int attack) {
        this.name = name;
        hitPoint = maximumHP;
        this.attack = attack;
        dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, maximumHP, attack);
    }

    /**
     * 相手を攻撃するメソッド。
     * attackに応じて乱数でダメージを算出し、hero.wounded()によりダメージ処理を実行。
     * @param opponent 攻撃対象
     */
    public void attack(LivingThing opponent){
        if(!dead){
            int damage = (int)(Math.random() * attack);
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, opponent.getName(), damage);
            opponent.wounded(damage);
        }         
    }

    /**
     * 自身へ攻撃されたときのダメージ処理をするメソッド。
     * 指定されたダメージを hitPoint から引き、死亡判定を行う。
     * @param damage 受けたダメージ
     */
    public void wounded(int damage){
        hitPoint -= damage;
        if( isDead() ) {
            System.out.printf("%sは倒れた。\n", name);
        }
    }
}
