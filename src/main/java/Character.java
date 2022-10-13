package lotr;

public abstract class Character {
    private int power;
    private int hp;
    public Character(int hp, int power){
        this.hp = Math.max(hp, 0);
        this.power = power;
    }
    public boolean isAlive(){
        return getHp() > 0;
    }
    public void kick(Character c){
        return;
    }
    public int getPower() {
        return power;
    }
    public void setPower(int power) {
        this.power = power;
    }
    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = Math.max(hp, 0);
    }

    @Override
    public String toString() {
        return "Character{" +
                "power=" + power +
                ", hp=" + hp +
                '}';
    }
}
