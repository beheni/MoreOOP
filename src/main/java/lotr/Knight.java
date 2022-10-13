package lotr;

import java.util.Random;

public class Knight extends Character {
    public Knight(){
        super(2,2);
        Random rand = new Random();
        setHp(getHp()+rand.nextInt(10));
        setPower(getPower()+rand.nextInt(10));
    }
    @Override
    public void kick(Character c) {
        Random rand = new Random();
        c.setHp (c.getHp()- rand.nextInt(this.getPower()));
    }
    @Override
    public String toString() {
        return super.toString();
    }
}