package jp.ac.uryukyu.ie.e205711;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WarriorTest {

    @Test
    void weponSkillTest() {
        int defaultEnemyHP = 100;
        Warrior warrior = new Warrior("戦士", 20, 10);
        Enemy enemy = new Enemy("キングスライム", defaultEnemyHP, 5);
        int weponSkillDamage = (int)(warrior.attack * 1.5);
        int remainingEnemyHP = defaultEnemyHP;
        int enemyTakenDamage = 0;

        for(int i=0; i<3; i++){
            warrior.attackWithWeponSkill(enemy);
            enemyTakenDamage = remainingEnemyHP - enemy.hitPoint;
            assertEquals(weponSkillDamage, enemyTakenDamage);
            remainingEnemyHP -= enemyTakenDamage;
        }
    }
}
