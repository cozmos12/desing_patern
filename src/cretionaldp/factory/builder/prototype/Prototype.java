package cretionaldp.factory.builder.prototype;

public class Prototype implements Cloneable {

    public int health;
    public int power;
    public int energy;

    public boolean life;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public boolean isLife() {
        return life;
    }

    public void setLife(boolean life) {
        this.life = life;
    }

    public Prototype(int health, int power, int energy, boolean life) {
        this.health = health;
        this.power = power;
        this.energy = energy;
        this.life = life;
    }

    @Override
    public Prototype clone() {
        Prototype prototype=null;
        try {
            prototype= (Prototype) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
        return prototype;
    }
}
