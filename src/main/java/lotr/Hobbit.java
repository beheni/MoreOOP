package lotr;

public class Hobbit extends Character {
    public Hobbit(){
        super(3,0);
    }
    @Override
    public String toString() {
        return super.toString();
    }
    public void toCry(){
        System.out.println("Is crying....(ɵ̥̥︹ɵ̥̥)");
    }
    @Override
    public void kick(Character c) {toCry();}
}
