package mechanics;
import lotr.Character;
public class GameManager {
    void fight (Character c1, Character c2){
        int round = 1;
        System.out.println(c1.getClass().getSimpleName()+" VS "+c2.getClass().getSimpleName());
        while (c1.isAlive() && c2.isAlive()){
            if(c1.getClass().getSimpleName().equals("Hobbit") && c2.getClass().getSimpleName().equals("Hobbit")){
                System.out.println("Hi, let's not cry - let's be friends");
                break;
            }
            System.out.println();
            System.out.println("Round "+ round);
            System.out.println();
            System.out.println(c1.getClass().getSimpleName()+" kicked " + c2.getClass().getSimpleName());
            c1.kick(c2);

            System.out.println(c1.getClass().getSimpleName() + " hp = " + c1.getHp());
            System.out.println();
            System.out.println(c2.getClass().getSimpleName()+" kicked " + c1.getClass().getSimpleName());
            c2.kick(c1);

            System.out.println(c2.getClass().getSimpleName() + " hp = " + c2.getHp());

            ++round;
            System.out.println();


        }
        if (c1.isAlive()){
            System.out.println(c1.getClass().getSimpleName() + " won!");
        }
        else {
            System.out.println(c2.getClass().getSimpleName() + " won!");
        }
    }
    public static void main(String[] args)  {
        CharacterFactory factory = new CharacterFactory();
        GameManager manager = new GameManager();
        manager.fight(factory.createCharacter(), factory.createCharacter());
    }
}
