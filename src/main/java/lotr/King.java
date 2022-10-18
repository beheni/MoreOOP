package lotr;


import kick.NobleKick;

import java.util.Random;

public class King extends Noble{
    NobleKick ability = new NobleKick();
    public King(){
        super(5,5);
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
