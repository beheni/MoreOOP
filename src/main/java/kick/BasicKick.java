package kick;

import lotr.Character;

public class BasicKick implements Kick{
    private int power;

    public BasicKick(){
        setPower(10);
        };
    public void setPower(int power) {
        this.power = 10;
    }

    @Override
    public void kick(Character c){
        if(power>c.getPower()){
            c.setHp(0);
        }
        else {
            c.setHp(c.getHp()-1);
        }
    }
}