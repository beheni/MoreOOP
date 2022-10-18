package lotr;

import kick.NobleKick;

import java.util.Random;

public class Knight extends Noble {
    NobleKick ability = new NobleKick();
    public Knight(){
        super(2,2);
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