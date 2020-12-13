package abstractclass.gamecharacter;

import java.util.Random;

public abstract class Character {

    private Point position;
    private int hitPoint = 100;
    private Random random;


    public Point getPosition() {
        return position;
    }

    public int getHitPoint() {
        return hitPoint;
    }

    public Random getRandom() {
        return random;
    }

    public Character(Point position, Random random) {
        this.position = position;
        this.random = random;
    }

    public boolean isAlive() {
        boolean alive = false;
        if (getHitPoint() > 0) {
            alive = true;
        }
        return alive;
    }

    protected int getActualPrimaryDamage() {
        return random.nextInt(1-11);
    }

    private int getActualDefence() {
        return random.nextInt(0-6) -1;
    }

    protected void hit(Character enemy, int damage) {
        if (getActualDefence() < damage) {
            decraseHitPoint(damage);
        }
    }

    private void decraseHitPoint(int diff) {
        hitPoint = hitPoint - diff;
    }


    public void primaryAttack(Character enemy) {
        hit(enemy, getActualPrimaryDamage());
    }

    abstract public void secondaryAttack(Character enemy);

}
