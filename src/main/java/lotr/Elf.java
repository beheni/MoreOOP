package lotr;
import kick.BasicKick;
public class Elf extends Character{
    BasicKick ability = new BasicKick();
    public Elf(){super(10,10);
}
    @Override
    public void kick(Character c) {
        ability.kick(c);
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
