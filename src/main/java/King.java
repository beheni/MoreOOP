package lotr;


import java.util.Random;

public class King extends Character{
    public King(){
        super(5,5);
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
